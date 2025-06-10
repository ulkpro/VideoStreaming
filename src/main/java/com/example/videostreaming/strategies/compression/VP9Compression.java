package com.example.videostreaming.strategies.compression;

import org.springframework.stereotype.Component;

@Component("vp9")
public class VP9Compression implements CompressionStrategy {

    @Override
    public void compress(String videoName) {
        System.out.println("Compressing using VP9 codec for: " + videoName);
    }
}