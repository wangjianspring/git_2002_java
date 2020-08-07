package hxzy.com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * USER: summer
 * CLASSNAME: RiskController
 * DATE: 2020/7/21
 * TIME: 10:31
 * Company: 侠客岛
 * JDK 1.8
 */
@Controller
public class RiskController {

    @GetMapping("/show.do")
    public String showIndex(Model model) {
        model.addAttribute("show","jsp_test");
        return "show";
    }
}
