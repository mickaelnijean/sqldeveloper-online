package com.mybatis.sqldeveloperonline.controller;

import com.mybatis.sqldeveloperonline.repository.UserRepository;
import com.mybatis.sqldeveloperonline.repository.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest/test")
public class RestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<Map<String,String>> findAll(){
        return null;
    }

    @RequestMapping("/user/{firstName}")
    public List<Users> getByFirstName(@PathVariable("firstName") String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    @RequestMapping("/{tableName}/{constraint}")
    public List<Users> getByTableNameAndConstraint(@PathVariable("tableName") String tableName,@PathVariable("firstName") String firstName) {
        return userRepository.findByTableNameAndConstraint(tableName,firstName);
    }

    @RequestMapping("/abstract/{tableName}/{constraint}")
    public List<Map<String,String>> getByTableNameAndConstraintWithAbstractType(@PathVariable("tableName") String tableName,@PathVariable("firstName") String firstName) {
        return userRepository.getByTableNameAndConstraintWithAbstractType(tableName,firstName);
    }

}
