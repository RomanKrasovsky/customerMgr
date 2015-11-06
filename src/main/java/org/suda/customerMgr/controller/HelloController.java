package org.suda.customerMgr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/hello2")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("message", helloService.sayHello());
        return "hello";
    }
}