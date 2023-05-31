package com.k1m743hyun.memberservice;

import com.k1m743hyun.memberservice.config.JasyptConfig;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
public class JasyptTest {

    StringEncryptor encryptor;

    JasyptTest(@Value("${jasypt.encryptor.encryptKey}") String encryptKey) {
        this.encryptor = new JasyptConfig(encryptKey).stringEncryptor();
    }

    @Test
    void encryptPlainTextTest() {

        // given
        String plainText = "";

        // when
        String encryptText = encryptor.encrypt(plainText);
        System.out.printf(">>> ENC(%s)%s", encryptText, System.lineSeparator());

        // then
        assertThat(encryptText).isNotNull().isNotBlank();
    }

    @Test
    void decryptEncryptTest() {

        // given
        String encryptText = "";

        // when
        String decryptText = encryptor.decrypt(encryptText);
        System.out.printf(">>> %s\n", decryptText);

        // then
        assertThat(decryptText).isNotNull().isNotBlank();
    }
}
