package com.vkr.example.githubactiondeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class GithubActionDeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionDeployApplication.class, args);
    }

    @GetMapping("/hello")
    public String getMsg(){
        return "Hello Good Morning...";
    }

}
