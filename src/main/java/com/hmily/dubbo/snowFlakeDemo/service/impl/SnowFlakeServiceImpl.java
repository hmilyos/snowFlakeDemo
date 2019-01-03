package com.hmily.dubbo.snowFlakeDemo.service.impl;

import com.hmily.dubbo.snowFlakeDemo.exception.SnowFlakeCustomException;
import com.hmily.dubbo.snowFlakeDemo.service.ISnowFlakeService;
import com.hmily.dubbo.snowFlakeDemo.util.SnowFlake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SnowFlakeServiceImpl implements ISnowFlakeService {

    private final  static Logger log = LoggerFactory.getLogger(SnowFlakeServiceImpl.class);

	@Override
	public long getSnowFlakeID() {
        long id = SnowFlake.getId();
        log.info("id: {}", id);
        return id;
	}

	@Override
	public long[] getSnowFlakeIDs(int size) {
		if (size < 1) {
			throw new SnowFlakeCustomException(500, " size is illegal");
		}
		long[] ids = new long[size];
		for (int i = 0; i < size; i++) {
            long id = SnowFlake.getId();
			ids[i] = id;
            log.info("id: {}", id);
		}
		return ids;
	}

}
