package com.example.videostreaming.decorators;

import org.springframework.stereotype.Component;

@Component
public abstract class VideoStreamDecorator implements VideoStream{
    private VideoStream wrapped;

    public VideoStreamDecorator(VideoStream wrapped){
        this.wrapped = wrapped;
        System.out.println("In Abstract deco cons. After Wrap:" + this.wrapped);
    }

    @Override
    public void stream(String videoName) {
        System.out.println("In Abstract deco stream method. VideoName:" + videoName + "wrapped:" + wrapped);
        wrapped.stream(videoName);
    }
}