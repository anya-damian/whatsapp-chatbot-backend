package com.springboot.whatsapp_chat_bot.controller;

import com.springboot.whatsapp_chat_bot.model.MessageRequest;
import com.springboot.whatsapp_chat_bot.model.MessageResponse;
import com.springboot.whatsapp_chat_bot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/webhook")
@CrossOrigin(origins = "*")
public class WebhookController {

    private final ChatbotService chatbotService;

    @Autowired
    public WebhookController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping
    public ResponseEntity<MessageResponse> handleWebhook(@RequestBody MessageRequest request) {
        MessageResponse response = chatbotService.processMessage(request);
        return ResponseEntity.ok(response);
    }
}
