package kr.co.ejyang.module_user_verification.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "verification.mobile")
@Configuration
public class MobileVerificationConfig {

    private String type;
    private String length;
    private String expireMin;

    public int getLength() {
        return Integer.parseInt(length);
    }

}
