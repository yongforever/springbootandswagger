package com.yongforever.controller;

import com.yongforever.util.WgetDownUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/down")
public class DownFileController {

    @RequestMapping("/file")
    public void downFile(){
        String wgetUrl = "wget -P /root/wget  https://ftp.gnu.org/gnu/wget/wget-1.5.3.tar.gz";
        WgetDownUtils.downFile(wgetUrl);
    }
}
