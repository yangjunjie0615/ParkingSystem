package com.project.controller;

import com.project.service.UploadService;
import com.project.utils.FileUploadUtil;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping(value = "/upload")
@Scope("prototype")
@Data

/**
 * @author: yangjunjie
 */
public class FileUploadController {

    @Autowired
    private UploadService uploadService;

    /**
     *
     * @param file
     * @param request
     * @return
     * @throws IOException
     */
    @PostMapping(value = "/file")
    @ResponseBody
    public String  uploadFile(@RequestParam(value = "file",required = false) MultipartFile file, HttpServletRequest request) throws IOException {
        //获取前台传来的文件并保存为新文件存入到数据库中
        String newFilePath = FileUploadUtil.fileOne(file,request);
        System.out.println("生成的路径"+newFilePath);
        //获取登陆账户的信息
        HttpSession session = request.getSession();
        Object oUid = session.getAttribute("uid");
        if (oUid == null) {
            return null;
        }
        Integer uid = (Integer) oUid;
        // 插入数据库
        Integer result = uploadService.uploadFile(newFilePath,uid);
        System.out.println(request);
        String str = "{\"code\": "+result+",\"msg\":\"\",\"data\": {\"src\":\"" + newFilePath + "\"}}";
        return str;
    }
}
