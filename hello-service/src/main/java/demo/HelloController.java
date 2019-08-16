package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.util.List;

/**
 * @Auther: yaya
 * @Date: 2019/7/26 15:18
 * @Description:
 */
@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

//    @Value("${hello.name}")
//    private String hostname;
//
//    @Autowired
//    private DiscoveryClient client;
//
//    @Autowired
//    private HelloProperties helloProperties;
//
    String small = "cccccccccccccccccccccccccccccccc";
    String big = "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";

    @RequestMapping(value = "/stest",method = RequestMethod.POST)
    public String SRP(@RequestBody String s) {
        System.out.println(s);
        String ip = "";
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        }catch (Exception e){
            return small;
        }
        return ip + "_" + small;
    }

    @RequestMapping(value = "/btest", method = RequestMethod.POST)
    public String BRP(@RequestBody String s) {
        System.out.println(s);
        String ip = "";
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        }catch (Exception e){
            return big;
        }
        return ip + "_" + big;
    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String trans(@RequestBody String s) {
        System.out.println(s);
        String ip = "";
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        }catch (Exception e){
            return s;
        }
        return ip + "_" + s;
    }
//
//    @RequestMapping(value = "/test3",method = RequestMethod.POST)
//    public String ZSRP() {
//        return small;
//    }
//
//    @RequestMapping(value = "/test4", method = RequestMethod.POST)
//    public String ZBRP() {
//        return big;
//    }
//
//    @RequestMapping(value = "/test5",method = RequestMethod.POST)
//    public String SZRP(@RequestParam String param) {
//        System.out.println(param);
//        return "";
//    }
//
//    @RequestMapping(value = "/test6", method = RequestMethod.POST)
//    public String BZRP(@RequestParam String param) {
//        System.out.println(param);
//        return "";
//    }
//
//    @RequestMapping(value = "/test7",method = RequestMethod.POST)
//    public String MZRP(@RequestParam String param) {
//        System.out.println(param);
//        return "";
//    }

}
