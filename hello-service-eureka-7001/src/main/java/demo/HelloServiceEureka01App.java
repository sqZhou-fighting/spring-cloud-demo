package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: yaya
 * @Date: 2019/7/26 15:24
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class HelloServiceEureka01App {
    public static void main(String[] args) {
        SpringApplication.run(HelloServiceEureka01App.class, args);
    }
}
