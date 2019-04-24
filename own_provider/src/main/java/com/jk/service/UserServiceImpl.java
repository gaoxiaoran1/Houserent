package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.Owner;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserServiceImpl implements UserService_api {

    @Autowired
    private UserMapper userMapper;


    @Override
    @PostMapping("addUser")
    @ResponseBody
    public void addUser(@RequestBody User user) {
        if (user.getId()!=null){
            userMapper.updateUser(user);
        }else{
            userMapper.addUser(user);
        }
    }


    @Override
    @GetMapping("findAllUser")
    @ResponseBody
    public List findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    @ResponseBody
    @DeleteMapping("delUserById")
    public void delUserById( Integer id) {
        userMapper.delUserById(id);
    }

    @Override
    @ResponseBody
    @GetMapping("queryById")
    public User queryById(Integer id) {
        return userMapper.queryById(id);
    }

/*
    //业主
    @GetMapping("queryOwner")
    @ResponseBody
    @Override
    public List queryOwner() {
        return userMapper.queryOwner();
    }

    @Override
    @PostMapping("addOwner")
    @ResponseBody
    public void addOwner(Owner owner) {
        userMapper.addOwner(owner);
    }

*/

}
