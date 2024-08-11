package com.github.ilyxahobby.FrontWebBff.controller;

import com.github.ilyxahobby.FrontWebBff.dto.HelloWorldDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web-bff/api/v1")
public class HelloWorldController {

    @GetMapping("/get-hello-message")
    public ResponseEntity<HelloWorldDto> helloWorld() {
        return ResponseEntity.ok(HelloWorldDto.builder()
                .message("kaka")
                .build());
    }
}
