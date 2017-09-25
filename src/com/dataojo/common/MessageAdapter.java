package com.dataojo.common;

import java.util.Properties;

import javax.jms.JMSException;

public abstract class MessageAdapter implements Runnable{

	protected DataProducer dataProducer;
	protected Properties properties;
	protected String topic;
	protected String v;

	protected MessageAdapter(String topic,String v) throws JMSException {
		this.topic = topic;
		this.dataProducer = new DataProducer(topic,v);
		this.properties = ActiveMqUtil.activeMq.pro;
	}

	protected void distory() throws JMSException{
		dataProducer.destory();
	}

	protected DataProducer getDataProducer() {
		return dataProducer;
	}

	public abstract void start() throws Exception;
}
