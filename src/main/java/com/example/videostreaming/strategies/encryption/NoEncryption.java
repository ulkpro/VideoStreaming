package com.example.videostreaming.strategies.encryption;

import org.springframework.stereotype.Component;

@Component("none")
public class NoEncryption implements EncryptionStrategy{

    @Override
    public void encrypt(String videoName) {
        System.out.println("No Encryption for:" + videoName);
    }
}