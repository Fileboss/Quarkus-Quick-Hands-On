package fr.pgu.user;

import java.util.Set;

public interface UserRepository {
    Set<UserDto> getAll();
}
