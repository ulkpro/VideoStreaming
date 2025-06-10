    package com.example.videostreaming.decorators;

    import org.springframework.stereotype.Component;

    @Component
    public class BaseVideoStream implements VideoStream{

        @Override
        public void stream(String videoName) {

            System.out.println("Streaming raw video:" + videoName);
        }

    }