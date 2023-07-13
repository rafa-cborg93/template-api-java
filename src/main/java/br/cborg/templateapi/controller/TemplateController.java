package br.cborg.templateapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
@RequiredArgsConstructor
public class TemplateController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
