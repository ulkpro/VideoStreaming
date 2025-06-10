    package com.example.videostreaming.strategies.compression;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Component;
    import java.util.Map;

    @Component
    public class CompressionStrategyFactory {

        private final Map<String , CompressionStrategy> strategyMap;

        @Autowired
        public CompressionStrategyFactory(Map<String , CompressionStrategy> strategyMap){

            this.strategyMap = strategyMap;
        }

        public CompressionStrategy getStrategy(String strategyKey){
            CompressionStrategy returnStrategy = strategyMap.get(strategyKey.toLowerCase());
            if (returnStrategy == null){
                throw new IllegalArgumentException("No strategy found");
            }
            return returnStrategy;
        }

    }