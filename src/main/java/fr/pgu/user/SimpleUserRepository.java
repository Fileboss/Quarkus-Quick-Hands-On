package fr.pgu.user;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Set;

@ApplicationScoped
public class SimpleUserRepository implements UserRepository {

    @Override
    public Set<UserDto> getAll() {
        UserDto user1 = new UserDto("Jean", "12 rue gascogne");
        UserDto user2 = new UserDto("Louis", "rue de la Bière");
        return Set.of(user1, user2);
    }
}
