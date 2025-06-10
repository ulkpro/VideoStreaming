package com.example.videostreaming.decorators;

public class WatermarkStream extends VideoStreamDecorator {
    private final String watermark;

    public WatermarkStream(VideoStream wrapped, String watermark) {
        super(wrapped);
        this.watermark = watermark;
    }

    @Override
    public void stream(String videoName) {
        System.out.println("Applying watermark: " + watermark);
        super.stream(videoName);
    }
}