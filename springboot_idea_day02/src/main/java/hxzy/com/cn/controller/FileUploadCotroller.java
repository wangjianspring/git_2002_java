package hxzy.com.cn.controller;

import org.springframework.stereotype.Controller;
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
 * CLASSNAME: FileUploadCotroller
 * DATE: 2020/7/21
 * TIME: 10:25
 * Company: 侠客岛
 * JDK 1.8
 */
//alt+enter
@Controller
@RequestMapping("file")
public class FileUploadCotroller {

    @RequestMapping(value="/upload",method= RequestMethod.POST)
    @ResponseBody
    public Map<String,String> fileUpload(MultipartFile myfile) throws IllegalStateException, IOException {
        String newUrl="F:\\student\\2002\\file";
        //获取文件名称
        String fileName=myfile.getOriginalFilename();
        //文件上传
        myfile.transferTo(new File(newUrl,fileName));

        Map<String,String> map=new HashMap<>();
        map.put("sucess", "true");
        return map;
    }

}
