package com.coll.RestController;

import java.util.Date;

import org.springframework.web.bind.annotation.RestController;

import com.coll.model.Message;
import com.coll.model.OutputMessage;

/*@RestController
public class ChatController 
{
	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message)
	{
		return new OutputMessage(message,new Date());
	}
}*/