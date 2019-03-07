package com.syw.demo1.controller;

import com.syw.demo1.entity.User;
import com.syw.demo1.service.UserService;
import com.syw.util.PageInfo;
import com.syw.util.ResultBean;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ServletContext servletContext;

@RequestMapping("login")
     public String login(User user){
    try {
        userService.login(user);
    }catch (Exception e) {
        return "redirect:/my-account.html";
    }
    return "index";
     }
     @RequestMapping("register")
     public String register(User user){
        userService.save(user);
        return "redirect:/my-account.html";
     }
    }
