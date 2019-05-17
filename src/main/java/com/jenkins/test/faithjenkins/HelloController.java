package com.jenkins.test.faithjenkins;/**
 * @author tanxi
 * @date 2019/5/16
 */

import com.jenkins.test.faithjenkins.utils.IpUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/test")
    public String faithJenkins(HttpServletRequest request){
        String ipAddr = IpUtils.getIpAddr(request);
        return "hi, 来自"+ ipAddr +"的用户,welcome,this is faith repo";
    }
}
