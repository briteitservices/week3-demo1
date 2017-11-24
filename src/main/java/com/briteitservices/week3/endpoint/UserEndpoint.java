package com.briteitservices.week3.endpoint;

import com.briteitservices.week3.model.User;
import com.briteitservices.week3.repository.UserRepository;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Date;


@Path("/user")
@Stateless
@PermitAll
public class UserEndpoint {

    @Inject
    private UserRepository userRepository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String save(@QueryParam("name") String name) {
        User user = new User();
        user.setName(name);
        user.setCreated(new Date());
        userRepository.save(user);

        return "USER ID: " + user.getId();
    }
}
