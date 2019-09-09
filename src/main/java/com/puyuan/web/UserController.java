package com.puyuan.web;

import com.puyuan.pojo.User;
import com.puyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class UserController {

    @Autowired
    UserService userService = null;

    @RequestMapping("/findAll")
    public void findAllShop() {
        System.out.println("查询所有商品");

    }

    @RequestMapping("findOne/{id}")
    public void findOneShop(@PathVariable String id) {
        System.out.println("查询一个商品" + id);
        User user = userService.findOne(id);
        System.out.println(user.getAge());
        System.out.println(user.getPhone());
        System.out.println(user.getUid());
        System.out.println(user.getUname());
    }
}
