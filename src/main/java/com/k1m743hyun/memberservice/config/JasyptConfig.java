package com.k1m743hyun.memberservice.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptConfig {

    private final String encryptKey;

    // 테스트 코드를 쉽게 짜기 위한 생성자
    public JasyptConfig(@Value("${jasypt.encryptor.encryptKey}") String encryptKey) {
        this.encryptKey = encryptKey;
    }

    @Bean("jasyptStringEncryptor")
    public StringEncryptor stringEncryptor() {

        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(encryptKey);
        config.setAlgorithm("PBEWITHMD5ANDDES");
        config.setKeyObtentionIterations("1024");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setIvGeneratorClassName("org.jasypt.iv.RandomIvGenerator");
        config.setStringOutputType("base64");

        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setConfig(config);

        return encryptor;
    }
}
