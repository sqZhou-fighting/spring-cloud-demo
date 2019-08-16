package demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: yaya
 * @Date: 2019/7/26 15:37
 * @Description:
 */
@Component
public class HelloService {
//    @Value("${helloServiceUri}")
//    private String helloServiceUri;
    @Autowired
    private RestTemplate restTemplate;

    private String helloServiceUri = "http://HELLOSERVER";

    @HystrixCommand(fallbackMethod = "getDefault")
    public String getGreeting(String uri) {
        return restTemplate.getForObject(uri, String.class);
    }

    @HystrixCommand(fallbackMethod = "getDefault")
    public String getGreeting() {
        return getGreeting(helloServiceUri);
    }

    String getDefault() {
        return "hello... something?";
    }
}
