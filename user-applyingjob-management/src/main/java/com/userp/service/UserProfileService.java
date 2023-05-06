package com.userp.service;

import java.util.List;

import com.google.common.base.Optional;
import com.userp.entity.UserProfile;

public interface UserProfileService {
	
	
	//CreateAnUserProfile
	public String createAnUseProfile(UserProfile userProfile);
	
	
	//GetASingleUserProfile
	public UserProfile getASingleUserProfile(Long userId);
	
	//GetAllUserProfile
	public List<UserProfile> getAllUserprofile();
	
	//DeleteAnUserProfile
	
	public void deleteUserProfile(Long userId);
	
	//UpdateAnUserProfile

}
