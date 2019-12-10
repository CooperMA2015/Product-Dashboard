package com.tts.restwithapi;

import org.springframework.batch.item.ItemProcessor;

import com.tts.restwithapi.model.User;

public class UserItemProcessor implements ItemProcessor<User, User> {

 @Override
 public User process(User user) throws Exception {
  return user;
 }

} 
