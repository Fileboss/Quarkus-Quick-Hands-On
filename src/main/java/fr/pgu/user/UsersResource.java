package fr.pgu.user;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Path("/users")
public class UsersResource {

    private final UserService userService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String users() {
        return userService.printUsers();
    }
}
