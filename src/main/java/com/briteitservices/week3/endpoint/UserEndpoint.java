package com.briteitservices.week3.endpoint;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/user")
@Stateless
@PermitAll
public class UserEndpoint {

    @GET
    public void save() {

    }
}
