package org.wg.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wg.springmvc.po.Items;

/**
 * <p>Title: JsonTest</p>
 * <p>Description: json交互测试</p>
 */
@Controller
public class JsonTestController {

    //请求json串(商品信息)，输出json(商品信息)
    //@RequestBody将请求的商品信息的json串转成items对象
    //@ResponseBody将items转成json输出
    @RequestMapping("/requestJson")
    @ResponseBody
    public Items requestJson(@RequestBody Items items) {
        System.err.println(items);
        //@ResponseBody将items转成json输出
        return items;
    }

    //请求key/value，输出json
    @RequestMapping("/responseJson")
    @ResponseBody
    public Items responseJson(Items items) {
        System.err.println(items);
        //@ResponseBody将items转成json输出
        return items;
    }

}
