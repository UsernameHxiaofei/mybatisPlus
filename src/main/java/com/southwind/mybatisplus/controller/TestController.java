package com.southwind.mybatisplus.controller;

import com.southwind.mybatisplus.test.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hujunfei
 * * @date 2021/5/25
 */
@RestController
@RequestMapping("/test")
public class TestController {





    @PostMapping("/aaa")
    public Map<String, Object> test (@RequestBody @Valid User user) {
       return new HashMap<String, Object>();
    }
}
