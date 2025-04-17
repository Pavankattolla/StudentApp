package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendExamLink(String toEmail, String studentName) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Your Exam Link");
        message.setText("Hi " + studentName + ",\n\nYour exam link is: https://examportal.com/exam123\n\nGood luck!");
        message.setFrom("kattollapavan1000@gmail.com");

        mailSender.send(message);
    }
}
