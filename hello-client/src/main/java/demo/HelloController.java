package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yaya
 * @Date: 2019/7/26 15:36
 * @Description:
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String hello(@RequestParam(required=false) String uri) {
        if (uri != null) {
            return helloService.getGreeting(uri);
        } else {
            return helloService.getGreeting();
        }
    }
}
