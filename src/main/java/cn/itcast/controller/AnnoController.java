package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart@create 2019-08-30 18:42
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/hello")
    public String testRequestparam(){

        return "success";
    }
}
