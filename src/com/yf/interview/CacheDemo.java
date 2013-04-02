package com.yf.interview;

import java.util.HashMap;

import java.util.Map;

import java.util.concurrent.locks.ReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheDemo{

	private Map<String, Object> cache = new HashMap<String, Object>(); // 模拟缓存，每个key对应一个obj

	public static void main(String[] args) {

	}

	private ReadWriteLock rwl = new ReentrantReadWriteLock();// 定义读写锁

	// 我们先跟去key去缓存中取数据，如果有的话，则返回对应的值，如果没有，去数据库中查找，返回查找到的值

	public Object getData(String key) {

		rwl.readLock().lock();// 上读锁

		Object value = null;

		try {

			value = cache.get(key);

			if (value == null) {// 如果换从中没有的话 打开读锁

				rwl.readLock().unlock();

				rwl.writeLock();// 读与写是互斥的，所以要先解开读锁，才能进行写操作（个人理解）

				try {

					value = "aaaa";// 实际是去数据库中queryDB();

					cache.put(key, value);// 将得到的数据，存入缓存中。以后的线程直接在缓存中取值（张老师视频上没有，个人加的）

				} catch (Exception e) {

				} finally {

					rwl.writeLock().unlock();// 释放读锁

				}

				rwl.readLock().lock();// 还原读锁，防止下面的finally出现异常

			}

		} catch (Exception e) {

		}

		finally {

			rwl.readLock().unlock();

		}

		return value;

	}

}
