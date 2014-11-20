package com.vintek.services.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import com.vintek.services.model.UserAnnouncement;
import com.vintek.services.rest.ServiceException;

public class UserInfoController {

	public List<UserAnnouncement> getAnnouncements() throws ServiceException {
		List<UserAnnouncement> announcements = new ArrayList<UserAnnouncement>();
		//try {			
			UserAnnouncement announcement = new UserAnnouncement();
			announcement.setId("1");
			announcement.setMessage("message 1");
			announcement.setType("lien_inquiry");
			announcement.setRead(false);
			announcements.add(announcement);
		//} catch (Exception e) {			
			//throw new ServiceException(Response.Status.INTERNAL_SERVER_ERROR, "An Exception occurred while trying to get the announcements.");//, e);
			//throw new ServiceException("An Exception occurred while trying to get the announcements.");//, e);
			
		//}
		return announcements;
	}

	public UserAnnouncement getAnnouncement(int id) throws ServiceException {
		UserAnnouncement announcement = new UserAnnouncement();
		announcement.setId("1");
		announcement.setMessage("message 1");
		announcement.setType("lien_inquiry");
		announcement.setRead(false);
		return announcement;
	}
}
