package com.ki5s.base.util;

import java.util.UUID;

public class UtilUUID {
	/**
	 * ����uuid ȥ��"-"
	 * 
	 * @return
	 */
	public static String uuid() {
		//String uuid = RandomStringUtils.random(32,randomChars);
		String uuid = UUID.randomUUID().toString();
		return uuid.replaceAll("-", "");
	}
	
	public static void main(String[] args) {
		System.out.println(UtilUUID.uuid());
	}
}
