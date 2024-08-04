package siege.siegedemo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateUserRestController {

    private final UserService userService;

    @PostMapping("/user/{name}/{lastName}")
    public String createUser(@PathVariable String name, @PathVariable String lastName) {
        return userService.createUser(name, lastName);
    }

    @GetMapping("/user/{name}")
    public ResponseEntity<User> getUser(@PathVariable String name) {
        try {
            var user = userService.getUser(name);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/user/{name}")
    public ResponseEntity<String> deleteUser(@PathVariable String name) {
        try {
            userService.getUser(name);
            return ResponseEntity.ok("Deleted");
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
