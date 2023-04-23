package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    
    @GetMapping("/")
    public String freemarker() {
        return "index";
    }
    
    @GetMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String someJson() {
        return "{\"message\": \"some JSON\"}";
    }

    @GetMapping("/qw/**")
	public String quasarWebpack() {
        return "forward:/target/qdemo_webpack/index.html";
    }
    
    @GetMapping("/qv/**")
	public String quasarVite() {
        return "forward:/target/qdemo_vite/index.html";
    }
}
