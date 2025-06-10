package com.example.videostreaming.strategies.compression;

import org.springframework.stereotype.Component;

@Component("h264")
public class H264Compression implements CompressionStrategy{

    @Override
    public void compress(String VideoName) {
        System.out.println("H264 Compressed Video:" + VideoName);
    }
}