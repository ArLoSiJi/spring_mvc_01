package cn.itcast.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import javax.annotation.Resources;

/**
 * @author shkstart@create 2019-08-30 16:06
 */
@Controller
public class HelloController {

   @RequestMapping(path="/hello")
    public String sayHello(String username){
        System.out.println("Hello,springMVC");
       System.out.println(username);
        return "success";
    }

}
