package com.fq.springboot.exception;

import com.fq.springboot.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    //返回json, 无法自适应
    @ResponseBody
    @ExceptionHandler(UserNotExistException.class)
    public Map<String, Object> handleException(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "user.notexist");
        map.put("message", e.getMessage());
        return map;
    }

    // 自适应处理 转发给 /error 页面
//    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();

        //传入我们自己的错误状态码  4xx 5xx
        request.setAttribute("javax.servlet.error.status_code", 500);

        map.put("code", "user.notexist");
        map.put("message", "用户出错啦");
        request.setAttribute("ext", map);

        return "forward:/error";
    }
}
