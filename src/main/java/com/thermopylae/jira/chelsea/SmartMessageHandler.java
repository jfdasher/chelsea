package com.thermopylae.jira.chelsea;

import java.util.Map;

import javax.mail.Message;
import javax.mail.MessagingException;

import com.atlassian.jira.service.util.handler.MessageHandler;
import com.atlassian.jira.service.util.handler.MessageHandlerContext;
import com.atlassian.jira.service.util.handler.MessageHandlerErrorCollector;

public class SmartMessageHandler implements MessageHandler {

    private String issueKey;
	@Override
	public boolean handleMessage(Message arg0, MessageHandlerContext arg1)
			throws MessagingException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void init(Map<String, String> arg0, MessageHandlerErrorCollector arg1) {
		// TODO Auto-generated method stub

	}

	
}
