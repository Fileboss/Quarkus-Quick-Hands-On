package fr.pgu.user;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@ApplicationScoped
public class UserService {
    private final UserRepository userRepository;

    public String printUsers() {
        return userRepository.getAll().toString();
    }
}
