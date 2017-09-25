package com.dataojo.common;

import java.util.List;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.dataojo.entity.Message;

public class DataProducer {
	
	private Properties properties;
	private Connection connection;
	private Session session;
	private Destination destination ;
	private MessageProducer producer;
	private String topic;
	private String v;

	public DataProducer(String topic,String v) throws JMSException{
		this.topic = topic;
		this.v = v;
		this.properties = ActiveMqUtil.activeMq.pro;
		this.connection = ActiveMqUtil.activeMq.getConnection();
		connection.start();
		this.session = ActiveMqUtil.activeMq.getSession(connection);
		this.destination = session.createTopic(properties.getProperty(topic));
		this.producer = session.createProducer(destination);
	}

	public void sendMessage(Message message) throws Exception {
		TextMessage textMessage = session.createTextMessage(message.toString().replace("[","").replace("]", ""));
		producer.send(textMessage);
//		System.out.println("发送消息:"+message.toString());
		Thread.sleep(Integer.parseInt(properties.getProperty(v)));
	}
	public void sendMessage2(String list) throws Exception {
		TextMessage textMessage = session.createTextMessage(list);
		producer.send(textMessage);
//		System.out.println("发送消息:"+list);
		Thread.sleep(Integer.parseInt(properties.getProperty(v)));
	}

	public void destory() throws JMSException{
		if(connection!=null){
			connection.close();
		}
	}
}
