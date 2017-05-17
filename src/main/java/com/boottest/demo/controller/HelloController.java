package com.boottest.demo.controller;

import com.boottest.demo.vo.Student;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    @ApiOperation(value="获取学生信息", notes="")
    @ApiImplicitParam(name = "student",value = "学生信息" ,required = true ,dataType = "Student")
    public Student index(Student student) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int n = 100/0;
        Student s = null;
        s = new Student("liuqiang",20,sdf.parse("1996-11-11"));
        return s;
    }
}
