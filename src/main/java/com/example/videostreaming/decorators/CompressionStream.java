package com.example.videostreaming.decorators;

import com.example.videostreaming.strategies.compression.CompressionStrategy;

public class CompressionStream extends VideoStreamDecorator {
    private final CompressionStrategy strategy;

    public CompressionStream(VideoStream wrapped, CompressionStrategy strategy) {
        super(wrapped);
        this.strategy = strategy;
    }

    @Override
    public void stream(String videoName) {
        strategy.compress(videoName);
        super.stream(videoName);
    }
}