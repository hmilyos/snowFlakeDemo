package com.hmily.dubbo.snowFlakeDemo.service.impl;

import com.hmily.dubbo.snowFlakeDemo.exception.SnowFlakeCustomException;
import com.hmily.dubbo.snowFlakeDemo.service.ISnowFlakeService;
import com.hmily.dubbo.snowFlakeDemo.util.SnowFlake;

public class SnowFlakeServiceImpl implements ISnowFlakeService {

	@Override
	public long getSnowFlakeID() {
		return SnowFlake.getId();
	}

	@Override
	public long[] getSnowFlakeIDs(int size) {
		if (size < 1) {
			throw new SnowFlakeCustomException(500, " size is illegal");
		}
		long[] ids = new long[size];
		for (int i = 0; i < size; i++) {
			ids[i] = SnowFlake.getId();
		}
		return ids;
	}

}
