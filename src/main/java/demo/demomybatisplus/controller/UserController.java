package demo.demomybatisplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import demo.common.CommonResponse;
import demo.demomybatisplus.pojo.User;
import demo.demomybatisplus.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // r
    @GetMapping("/getUsers")
    Object getUsers() {
        return userService.getUsers();
    }

    // r
    @GetMapping("/getUsers2")
    CommonResponse getUsers2() {
        return userService.getUsers2();
    }

    // r
    @GetMapping("/getUserById/{id}")
    Object getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // // r
    // @GetMapping("/getUserById")
    // Object getUserById(@RequestParam("id") Long id) {
    // return userService.getUserById(id);
    // }

    // c
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addUser")
    String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "success";
    }

    // d
    @DeleteMapping("/deleteUserById/{id}")
    String deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "success";
    }

    // // d
    // @DeleteMapping("/deleteUserById")
    // String deleteUserById(@RequestParam("id") Long id) {
    // userService.deleteUserById(id);
    // return "success";
    // }

    // u
    @PutMapping("/updateUserById")
    String updateUserById(@RequestBody User user) {
        userService.updateUserById(user);
        return "success";
    }
}
