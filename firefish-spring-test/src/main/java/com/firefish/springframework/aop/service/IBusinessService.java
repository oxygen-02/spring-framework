package com.firefish.springframework.aop.service;

/**
 * 业务接口.
 * @author Fire Fish
 */
public interface IBusinessService {
	public int devide(int i, int j);

	public void print();

	void selfInvoke();
}
