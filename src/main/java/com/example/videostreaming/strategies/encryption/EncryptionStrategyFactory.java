package com.example.videostreaming.strategies.encryption;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EncryptionStrategyFactory {

    private Map<String, EncryptionStrategy> strategyMap;

    @Autowired
    public EncryptionStrategyFactory(Map<String, EncryptionStrategy> strategyMap){
        this.strategyMap = strategyMap;
    }

    public EncryptionStrategy getStrategy(String strategyKey){
        EncryptionStrategy strategy = strategyMap.get(strategyKey.toLowerCase());

        if (strategy == null){
            throw new IllegalArgumentException("Strategy Not Found");
        }
        return strategy;
    }

}