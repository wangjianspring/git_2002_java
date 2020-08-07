package hxzy.com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA
 * USER: summer
 * CLASSNAME: FreemarkerContrller
 * DATE: 2020/7/21
 * TIME: 14:15
 * Company: 侠客岛
 * JDK 1.8
 */
@Controller
@RequestMapping("free")
public class FreemarkerContrller {
    @GetMapping("/show_list.do")
    public String showIndex(Model model) {
        model.addAttribute("username","zhangsan");
        return "index";
    }

}
