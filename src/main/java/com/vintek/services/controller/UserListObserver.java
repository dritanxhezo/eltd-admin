package com.vintek.services.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import com.vintek.database.model.user.User;
import com.vintek.database.service.MojaveDB;

@ApplicationScoped
public class UserListObserver {
	@Inject
	private MojaveDB mojaveDB;
	
   private Map<String,User> users;

   @PostConstruct
   public void retrieveAllUsersOrderedByName() {
	   List<User> allUsers = mojaveDB.findWithNamedQuery("User.ALL");
	   for (User user: allUsers) {
		   users.put(user.getUserID(), user);
	   }
   }
   
   @Produces
   @Named
   public Map<String,User> getUsers() {
      return users;
   }

   public void onUserRegisterd(@Observes(notifyObserver = Reception.IF_EXISTS) @UserEventType(eventType = "register") final User user) {
      users.put(user.getUserID(), user);
   }

   public void onUserUnRegisterd(@Observes(notifyObserver = Reception.IF_EXISTS) @UserEventType(eventType = "unregister") final User user) {
	   users.remove(user);
   }
   
}
