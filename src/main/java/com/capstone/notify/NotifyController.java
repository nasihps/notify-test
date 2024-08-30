package com.capstone.notify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class NotifyController {

    @Autowired
    private NotifyService emailService;

    @GetMapping("/greet")
    public String greetFunction(){
        return "greet message";
    }

    @PostMapping("/send")
    public String sendNotification(@RequestParam String email, @RequestParam String subject, @RequestParam String message) {
        emailService.sendEmail(email, subject, message);
        return "Email sent to " + email;
    }

}
