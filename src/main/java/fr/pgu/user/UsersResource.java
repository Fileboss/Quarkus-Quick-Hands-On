package fr.pgu.user;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
public class UsersResource {

    private final UserService userService;

    @Inject
    public UsersResource(UserService userService) {
        this.userService = userService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String users() {
        return userService.printUsers();
    }
}
