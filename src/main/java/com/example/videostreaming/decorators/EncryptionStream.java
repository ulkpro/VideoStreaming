package com.example.videostreaming.decorators;

import com.example.videostreaming.strategies.encryption.EncryptionStrategy;

public class EncryptionStream extends VideoStreamDecorator {
    private final EncryptionStrategy strategy;

    public EncryptionStream(VideoStream wrapped, EncryptionStrategy strategy) {
        super(wrapped);
        System.out.println("");
        this.strategy = strategy;
    }

    @Override
    public void stream(String videoName) {
        strategy.encrypt(videoName);
        super.stream(videoName);
    }
}
