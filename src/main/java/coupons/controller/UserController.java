package coupons.controller;


import com.shelly.coupons.entities.UserEntity;
import com.shelly.coupons.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserLogic userLogic;

    @Autowired
    public UserController(UserLogic userLogic) {
        this.userLogic = userLogic;
    }

    @PostMapping
    public void createUser(@RequestBody UserEntity user) {
        userLogic.createUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody UserEntity user) {
    }

    @GetMapping("/{id}")
    public UserEntity getUser(@PathVariable("id") long id) {
        return userLogic.getUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") long id) {
        userLogic.deleteUser(id);
    }



}
