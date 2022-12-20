package com.example.headfirstdesignpatterns.controller;

import com.example.headfirstdesignpatterns.service.HomeAutomationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeAutomationController {

    private final HomeAutomationService service;

    @GetMapping("/simple-remote")
    public void getRemoteInfo() {
        service.getSimpleRemoteInfo();
    }

    @GetMapping("/remote")
    public void getRemote() { service.getRemoteInfo();}

    @GetMapping("/remote-lambda")
    public void getRemoteLambda() { service.getRemoteInfoLambda();}
}
