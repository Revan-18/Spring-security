package in.revan.Springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplication {
    @GetMapping("/")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/private")
    public String privateFun(){
        return "Hi there ete";
    }

}
