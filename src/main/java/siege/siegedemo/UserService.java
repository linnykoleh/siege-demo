package siege.siegedemo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public String createUser(String name, String lastName) {
        return userRepository.createUser(name, lastName);
    }

    public User getUser(String name) {
        return userRepository.getUser(name);
    }

    public void deleteUser(String name) {
        userRepository.deleteUser(name);
    }
}
