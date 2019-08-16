package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: yaya
 * @Date: 2019/7/26 15:17
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class HelloServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApp.class, args);
    }
}
