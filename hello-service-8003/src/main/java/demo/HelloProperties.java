package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: yaya
 * @Date: 2019/7/26 15:17
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}