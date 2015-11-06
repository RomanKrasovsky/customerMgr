package org.suda.customerMgr.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="HelloService")
public class HelloServiceEndpoint {
    @Autowired
    private HelloService helloService;

    @WebMethod
    public String sayHello() {
        return helloService.sayHello();
    }
}
