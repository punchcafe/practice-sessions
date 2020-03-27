package spring.boot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyController {

    @RequestMapping("/")
    public String home() {
        return "You made it!";
    }

    @RequestMapping("/secret")
    public String secretLair() {
        return "<h1>It's a secret to everybody!</h1>";
    }

    @RequestMapping("/countMe")
    @Autowired
    public String countMe(Counter counter){
        System.out.println(counter.getCount());
        counter.increaseCount();
        System.out.println(counter.getCount());
        return "you are the ".concat(Integer.toString(counter.getCount()));
    }
}
