package org.rabia.tabassum.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rabia.tabassum.model.Message;
import org.rabia.tabassum.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageservice=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		return messageservice.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public Message test(@PathParam("messageId") long messageId)
	{
		return messageservice.getMessage(messageId);
	}
}
