package com.github.all.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author handoli
 * @date 2024年08月09日
 * @version: 1.0
 */
@RestController
@RequestMapping("/all")
public class AllController {

    @GetMapping("/gitea")
    public String gitea(){
        //时间
        String time = DateUtil.format(DateTime.now(), "yyyy-MM-dd hh:mm:ss");
        //随机id
        String id = IdUtil.randomUUID();
        return time + ", " + id;
    }

}
