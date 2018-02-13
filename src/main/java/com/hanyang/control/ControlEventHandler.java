package com.hanyang.control;

import com.hanyang.user.User;
import com.hanyang.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Control.class)
public class ControlEventHandler {
    private final UserRepository users;

    @Autowired
    public ControlEventHandler(UserRepository users) {
        this.users = users;
    }

    @HandleBeforeCreate
    public void addUserBasedOnLoggedInUser(Control control) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = users.findByUsername(username);
        control.setLastModifiedBy(user);
    }
}
