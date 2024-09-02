package com.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.TwilioService;

@RestController
public class SMSController {

    @Autowired
    private TwilioService twilioService;

    @PostMapping("/send-sms")
    public String sendSMS(@RequestParam String toNumber, @RequestParam String message) {
        twilioService.sendSMS(toNumber, message);
        return "SMS sent successfully";
    }
}