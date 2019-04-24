package com.jk.controller;

import com.jk.model.Owner;
import com.jk.model.User;
import com.jk.service.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("query")
public class UserController {

    @Autowired
    private UserServiceFeign userServiceFeign;
    @PostMapping("addUser")
    @ResponseBody
    public void addUser( User user){
        System.out.println(user.toString()+"=========================================");
        userServiceFeign.addUser(user);
    }

    @GetMapping("findAllUser")
    @ResponseBody
    public List findAllUser(){
        return userServiceFeign.findAllUser();
    }

    @ResponseBody
    @DeleteMapping("delUserById")
    public void delUserById(Integer id){
        System.out.println(id+"==================================================================");
        userServiceFeign.delUserById(id);
    }

    @ResponseBody
    @GetMapping("queryById")
    public User queryById(Integer id){
        return userServiceFeign.queryById(id);
    }

    @RequestMapping("show")
    public String show (){
        return "show";
    }
    @RequestMapping("home")
    public String show1 (){
        return "HomePage.html";
    }
    @RequestMapping("owner")
    public String show2 (){
        return "owner";
    }



    /*//业主
    @GetMapping("queryOwner")
    @ResponseBody
    public List queryOwner(){
        return userServiceFeign.queryOwner();
    }


    @PostMapping("addOwner")
    @ResponseBody
    public void addOwner(Owner owner){
      userServiceFeign.addOwner(owner);
    }*/
}
