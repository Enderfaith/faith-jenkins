package com.jenkins.test.faithjenkins;/**
 * @author tanxi
 * @date 2019/5/16
 */

import com.jenkins.test.faithjenkins.utils.IpUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName HelloController$
 * @Description TODO
 * @Author faith$
 * @Date
 * @Version 1.0
 **/
@RestController
@RequestMapping("/faithJenkins")
public class HelloController {

    @GetMapping("/test")
    public String faithJenkins(HttpServletRequest request){
        String ipAddr = IpUtils.getIpAddr(request);
        System.out.println("当前 ip "+ipAddr);
        return "hi, 来自"+ ipAddr +"的用户,welcome,this is test faith-jenkins";
    }
}
