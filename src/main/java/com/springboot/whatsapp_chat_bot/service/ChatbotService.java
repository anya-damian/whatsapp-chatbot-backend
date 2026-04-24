package com.springboot.whatsapp_chat_bot.service;

import com.springboot.whatsapp_chat_bot.model.MessageRequest;
import com.springboot.whatsapp_chat_bot.model.MessageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    private static final Logger logger = LoggerFactory.getLogger(ChatbotService.class);

    public MessageResponse processMessage(MessageRequest request) {
        String incomingMessage = request.getMessage() != null ? request.getMessage().trim() : "";
        String sender = request.getSender() != null ? request.getSender() : "Unknown";

        // Log the incoming message
        logger.info("Received message from {}: {}", sender, incomingMessage);

        String replyText;

        // Predefined replies
        if (incomingMessage.equalsIgnoreCase("Hi") || incomingMessage.equalsIgnoreCase("Hello")) {
            replyText = "Hello";
        } else if (incomingMessage.equalsIgnoreCase("Bye")) {
            replyText = "Goodbye";
        } else {
            replyText = "I only understand 'Hi' and 'Bye'.";
        }

        return new MessageResponse(replyText);
    }
}
