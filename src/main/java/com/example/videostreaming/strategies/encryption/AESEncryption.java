package com.example.videostreaming.strategies.encryption;

import org.springframework.stereotype.Component;

@Component("aes")
public class AESEncryption implements EncryptionStrategy{

    @Override
    public void encrypt(String videoName) {
        System.out.println("AESEncryption for: " + videoName);
    }
}