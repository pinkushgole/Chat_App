package com.Chat_App.model;

import java.util.Date;

public class Message {
	
	private String name;
	private String content;
//	private Date date;
	public Message(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	

}
