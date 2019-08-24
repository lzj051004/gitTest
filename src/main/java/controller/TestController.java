package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Contended;

@RestController("/a")
public class TestController {

    @RequestMapping(value = "/test")
    public Object test(String str){
        //develop提交
        System.out.println("lzjbranch");
        return str;
    }
}
