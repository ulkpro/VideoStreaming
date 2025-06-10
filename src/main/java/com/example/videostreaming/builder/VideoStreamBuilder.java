package com.example.videostreaming.builder;

import com.example.videostreaming.decorators.*;
import com.example.videostreaming.strategies.compression.CompressionStrategy;
import com.example.videostreaming.strategies.encryption.EncryptionStrategy;

public class VideoStreamBuilder {
    private VideoStream stream;

    public VideoStreamBuilder(VideoStream baseStream) {
        this.stream = baseStream;
    }

    public VideoStreamBuilder withCompression(CompressionStrategy strategy) {
        stream = new CompressionStream(stream, strategy);
        return this;
    }

    public VideoStreamBuilder withEncryption(EncryptionStrategy strategy) {
        stream = new EncryptionStream(stream, strategy);
        return this;
    }

    public VideoStreamBuilder withWatermark(String watermark) {
        stream = new WatermarkStream(stream, watermark);
        return this;
    }

    public VideoStreamBuilder withSubtitles() {
        stream = new SubtitleOverlayStream(stream);
        return this;
    }

    public VideoStream build() {
        return stream;
    }
}