package com.myprojects.springmvc.uiController;


import com.myprojects.springmvc.service.UserService;
import com.myprojects.springmvc.sharedDto.UserDto;
import com.myprojects.springmvc.uiModelRequest.UserDetailsRequestModel;
import com.myprojects.springmvc.uiModelResponse.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")    //http://localhost:8080/users
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path ="/{id}")
    public UserRest getUser(@PathVariable String id){

        UserRest returnValue = new UserRest();

        UserDto userDto = userService.getUserByUserId(id);
        BeanUtils.copyProperties(userDto,returnValue);

        return returnValue;
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){                       //@RequestBody is used to covert the incoming json objects to javaobjects
        UserRest returnValue = new UserRest();
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails,userDto);
        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser,returnValue);
        return returnValue;
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}
