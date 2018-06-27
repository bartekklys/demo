package pl.bartekk.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public void createUser(@RequestParam int id, @RequestParam String name, @RequestParam int age) {
        User newUser = new User(id, name, age);
        userRepository.save(newUser);
        System.out.println("User has been saved successfully!");
    }
}
