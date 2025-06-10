package com.example.videostreaming.controller;

import com.example.videostreaming.builder.VideoStreamBuilder;
import com.example.videostreaming.decorators.BaseVideoStream;
import com.example.videostreaming.decorators.VideoStream;
import com.example.videostreaming.strategies.compression.CompressionStrategy;
import com.example.videostreaming.strategies.compression.CompressionStrategyFactory;
import com.example.videostreaming.strategies.encryption.EncryptionStrategy;
import com.example.videostreaming.strategies.encryption.EncryptionStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stream")
public class StreamController {

    @Autowired
    private BaseVideoStream baseStream;

    @Autowired
    private CompressionStrategyFactory compressionFactory;

    @Autowired
    private EncryptionStrategyFactory encryptionFactory;

    @PostMapping
    public String streamVideo(@RequestParam String video,
                              @RequestParam(defaultValue = "false") boolean compress,
                              @RequestParam(defaultValue = "false") boolean encrypt,
                              @RequestParam(defaultValue = "false") boolean watermark,
                              @RequestParam(defaultValue = "false") boolean subtitles,
                              @RequestParam(required = false) String compressionType,
                              @RequestParam(required = false) String encryptionType) {

        VideoStreamBuilder builder = new VideoStreamBuilder(baseStream);

        if (compress && compressionType != null) {
            CompressionStrategy strategy = compressionFactory.getStrategy(compressionType);
            builder.withCompression(strategy);
        }

        if (encrypt && encryptionType != null) {
            EncryptionStrategy strategy = encryptionFactory.getStrategy(encryptionType);
            builder.withEncryption(strategy);
        }

        if (watermark) {
            builder.withWatermark("User1234");
        }

        if (subtitles) {
            builder.withSubtitles();
        }

        VideoStream finalStream = builder.build();

        finalStream.stream(video);

        return "Streaming started for: " + video;
    }
}