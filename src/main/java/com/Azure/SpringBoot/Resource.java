package com.Azure.SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

    @GetMapping("/healthCheck")
    public String healthCheck(){
        return "SpringBoot application successfully Running in Azure";
    }
}
