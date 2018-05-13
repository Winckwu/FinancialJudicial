package cn.no7player.controller;

import cn.no7player.mapper.FiletestMapper;
import cn.no7player.model.Filetest;
import com.alibaba.fastjson.JSONObject;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by pc on 2017/2/11.
 */
@Controller
public class FiletestController {

    @Autowired
    private FiletestMapper filetestMapper;

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public String ImageUpload(@RequestParam(value = "file") MultipartFile file) {
        String fileName=null;
        if (!file.isEmpty()) {
            try {
                fileName = file.getOriginalFilename();
                byte[] bytes = file.getBytes();
                String filePath ="F:/cp/" + fileName;
                BufferedOutputStream buffStream =new BufferedOutputStream(new FileOutputStream(new File(filePath)));
                buffStream.write(bytes);
                buffStream.close();

                Filetest filetest=new Filetest();
                filetest.setFilename(fileName);
                filetest.setFilepath(filePath);
                filetestMapper.insertSelective(filetest);
                return "You have successfully uploaded " + fileName;
            } catch (Exception e) {
                return "You failed to upload " + fileName + ": " + e.getMessage();
            }
        } else {
            return "You failed to upload , because the file was empty.";
        }
    }

}
