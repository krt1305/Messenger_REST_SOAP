package org.rabia.tabassum.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rabia.tabassum.messenger.database.Database;

import org.rabia.tabassum.model.Profile;

public class ProfileService {
	
	private Map<String,Profile> profiles=Database.getProfiles();
	
	
	public List<Profile> getAllProfiles()
	{
		return new ArrayList<Profile>(profiles.values());
		
	}
	
	public Profile getProfile(String profileName)
	{
		return profiles.get(profileName);
		
	}
	
	public Profile addProfile(Profile profile)
	{
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
		
	}
	
	public Profile updateProfile(Profile profile)
	{
		if(profile.getId()<=0)
		return null;
		profiles.put(profile.getProfileName(), profile);
		return profile;
		
	}
	
	public Profile removeProfile(String profileName)
	{
		return profiles.remove(profileName);
	}
	

}
