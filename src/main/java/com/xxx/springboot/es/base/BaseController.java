package com.xxx.springboot.es.base;

import com.xxx.springboot.es.status.StatusEnum;
import org.springframework.stereotype.Controller;

/**
 * @Author JN
 * @Date 2020/5/3 17:47
 * @Version 1.0
 * @Description
 **/
@Controller
public class BaseController {

    /**
     * @Author JN
     * @Description 如果不需要返回数据，则使用这个方法
     * @Date 17:56 2020/5/3
     * @Param [msg]
     * @return com.xxx.springboot.es.base.ResultData
     **/
    protected ResultData success(String msg) {
        ResultData resultData = new ResultData();
        resultData.setCode(StatusEnum.SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @Author JN
     * @Description 需要返回前端页面数据，则使用这个方法
     * @Date 22:02 2020/5/3
     * @Param [msg, data]
     * @return com.xxx.springboot.es.base.ResultData
     **/
    protected ResultData success(String msg, Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(StatusEnum.SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }
}
