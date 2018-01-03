package org.rabia.tabassum.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rabia.tabassum.model.Message;
import org.rabia.tabassum.model.Profile;
import org.rabia.tabassum.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

	private ProfileService profileService=new ProfileService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List <Profile> getProfiles()
	{
		return profileService.getAllProfiles();
	}
	
	
	@POST
	public Profile addProfile(Profile profile)
	{
		return profileService.addProfile(profile);
	}
	
	@GET
	@Path("/{profileName}")
	
	public Profile getProfile(@PathParam("profileName") String profileName)
	{
		return profileService.getProfile(profileName);
	}
}
