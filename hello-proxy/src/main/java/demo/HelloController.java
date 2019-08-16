package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private RestTemplate client;

    String url = "http://SERVER/test";
    String surl = "http://SERVER/stest";
    String burl = "http://SERVER/btest";

    @RequestMapping(value = "/proxy",method = RequestMethod.POST)
    public String trans(@RequestBody String s) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        HttpEntity<String> requestEntity = new HttpEntity<>(s, headers);
        ResponseEntity<String> response = client.exchange(this.url, HttpMethod.POST, requestEntity, String.class);
        return response.getBody();
    }

    @RequestMapping(value = "/sproxy",method = RequestMethod.POST)
    public String SRP(@RequestBody String s) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        HttpEntity<String> requestEntity = new HttpEntity<>(s, headers);
        ResponseEntity<String> response = client.exchange(this.surl, HttpMethod.POST, requestEntity, String.class);
        return response.getBody();
    }

    @RequestMapping(value = "/bproxy",method = RequestMethod.POST)
    public String BRP(@RequestBody String s) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        HttpEntity<String> requestEntity = new HttpEntity<>(s, headers);
        ResponseEntity<String> response = client.exchange(this.burl, HttpMethod.POST, requestEntity, String.class);
        return response.getBody();
    }


}
