package com.dataojo.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public enum ActiveMqUtil {

	activeMq;

	private ConnectionFactory  connectionFactory = null;
	public Properties pro =null;
	private FileInputStream in = null;

	static{
		try {
			activeMq.pro = new Properties();
			activeMq.in = new FileInputStream("start.properties");
			activeMq.pro.load(activeMq.in);
			String url = activeMq.pro.getProperty("url");
			activeMq.connectionFactory = new ActiveMQConnectionFactory(url);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("=======∆Ù∂Ø≥Ã–Ú ß∞‹=======");
		}finally {
			if(activeMq.in!=null){
				try {
					activeMq.in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}


	public Connection getConnection() throws JMSException{
		return connectionFactory.createConnection();
	}


	public void cloneConnection(Connection conn) throws JMSException{
		if(conn!=null){
			conn.close();
		}
	}

	public Session getSession(Connection conn) throws JMSException{
		Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
		return session;
	}

}
