package com.example.videostreaming.decorators;

public class SubtitleOverlayStream extends VideoStreamDecorator {
    public SubtitleOverlayStream(VideoStream wrapped) {
        super(wrapped);
    }

    @Override
    public void stream(String videoName) {
        System.out.println("Overlaying subtitles...");
        super.stream(videoName);
    }
}
