package com.itcast.controller;

import com.itcast.domain.Account;
import com.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(path={"/requestMappingTest","/rm/{id}/{name}"},params = {"userId","userName"},method = RequestMethod.GET)
    public String requestMappingTest(@PathVariable("id") String id,@PathVariable("name") String name,@RequestParam(value = "userId") String userId, @RequestParam("userName") String userName){
        System.out.println("requestMappingTest...");
        System.out.println(id);
        System.out.println(name);
        System.out.println(userId);
        System.out.println(userName);
        System.out.println("refresh***");
        return "success";
    }

    @RequestMapping(path="/requestMappingTest2",method = RequestMethod.POST)
    public String requestMappingTest2(User user, HttpServletRequest request){
        System.out.println(user);
        Enumeration headerNames = request.getHeaderNames();

//        while(headerNames.hasMoreElements()){
//            System.out.println(headerNames.nextElement());
//        }

        return "success";
    }

    @RequestMapping(path = "/requestMappingTest3",method = RequestMethod.POST)
    public String requestMappingTest3(@ModelAttribute("user") User user, HttpServletRequest request){
        request.setAttribute("sex","male");
        return "result";
    }


    @RequestMapping(value = "/requestMappingTest4",method = RequestMethod.POST)
    public String requestMappingTest4(Account account){
        System.out.println(account);
        return "success";
    }

}
