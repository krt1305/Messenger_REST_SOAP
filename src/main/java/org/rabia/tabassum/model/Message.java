package org.rabia.tabassum.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Message {
	private long id;
	private String message;
	private Date created;
	private String author;
	
	public Message()
	{
		
	}
	
	public Message(long id,String message,String author)
	{
		this.id=id;
		this.message=message;
		this.author=author;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMesasge() {
		return message;
	}
	public void setMesasge(String mesasge) {
		this.message = mesasge;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
