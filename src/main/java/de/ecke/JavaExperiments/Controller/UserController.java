package de.ecke.JavaExperiments.Controller;

import de.ecke.JavaExperiments.ApiModels.UserData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/userData")
    public UserData userData(){
        return new UserData(1, "James Moriarty");
    }
}
