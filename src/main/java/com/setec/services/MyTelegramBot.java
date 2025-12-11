package com.setec.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.setec.entities.Booked;

import lombok.Data;

@Service
@Data 
public class MyTelegramBot {

  @Value("${token}")
  private String token;
  @Value("${chat_id}")
  private String chat_id;
  
  private TelegramBot bot;
  
  public SendResponse sendMessage(String text) {
    if (bot == null) {
      bot = new TelegramBot(token);
    }
    
//    System.out.println("TOKEN = " + token);
//    System.out.println("CHAT_ID = " + chat_id);

      
    SendResponse message = bot.execute(new SendMessage(chat_id, text));
    
//    System.out.println("OK: " + message.isOk());
//    System.out.println("Error: " + message.errorCode() + " " + message.description());
    
    return message;
  }
}
