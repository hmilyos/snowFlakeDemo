package com.hmily.dubbo.snowFlakeDemo.web.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.hmily.dubbo.common.service.ISnowFlakeServiceApi;
import com.hmily.dubbo.snowFlakeDemo.service.ISnowFlakeService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class SnowFlakeProvider implements ISnowFlakeServiceApi {

    @Autowired
    private ISnowFlakeService snowFlakeService;

    @Override
    public long getSnowFlakeID(){
        return snowFlakeService.getSnowFlakeID();
    }

    @Override
    public long[] getSnowFlakeIDs(int size){
        return snowFlakeService.getSnowFlakeIDs(size);
    }
}
