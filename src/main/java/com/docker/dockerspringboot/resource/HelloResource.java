package com.docker.dockerspringboot.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {

    @GetMapping
    public String hello() throws UnknownHostException {
        return " Hello From Docker \n" +
                " with IP Address : "+ InetAddress.getLocalHost().getHostAddress() +" \n" +
                " with Hostname : "+ InetAddress.getLocalHost().getCanonicalHostName();
    }
}
