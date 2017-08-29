package com.shechaoqun.index.controller;

import com.shechaoqun.index.model.Test;
import com.shechaoqun.index.service.TestSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chaoqunshe on 8/28/17.
 */
@Controller
public class IndexController {

    @Autowired
    private TestSevice testSevice;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test2() {
        List<Test> tests = testSevice.queryAll();
        for (int i = 0; i <tests.size() ; i++) {
            System.out.println(tests.get(i).getId() + "");
            System.out.println(tests.get(i).getText());
        }

        return "hello world";
    }
}
