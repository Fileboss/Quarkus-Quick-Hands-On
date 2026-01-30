package fr.pgu.greeting;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;

import java.util.Objects;


@RequiredArgsConstructor
@Path("/hello")
public class GreetingResource {

    private final GreetingService greetingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam(value = "prenom") String firstName) {
        if (Objects.isNull(firstName)) {
            return greetingService.greet("les amis");
        } else {
            return greetingService.greet(firstName);
        }
    }
}
