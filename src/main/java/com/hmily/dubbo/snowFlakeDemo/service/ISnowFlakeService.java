package com.hmily.dubbo.snowFlakeDemo.service;

public interface ISnowFlakeService {

	long getSnowFlakeID();
	
	long[] getSnowFlakeIDs(int size);
}
