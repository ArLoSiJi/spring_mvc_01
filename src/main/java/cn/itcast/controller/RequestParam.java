package cn.itcast.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/**
 * @author shkstart@create 2019-08-31 15:37
 */
@Controller
@RequestMapping("/anno")
public class RequestParam {
    //RequestParam：指点属性名
    @RequestMapping("testRquestparam")
    public String testRequestParam(@org.springframework.web.bind.annotation.RequestParam(name = "name") String username) {

        System.out.println(username);

        System.out.println("hello,Requestparam");
        return "success";
    }
    //RequestBody：得到请求体
    @RequestMapping("/testRquestBody")

    public String testRquestBody(@RequestBody String body) {

        System.out.println(body);

        System.out.println("hello,testRquestBody");
        return "success";
    }
}
