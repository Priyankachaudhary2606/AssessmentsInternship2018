package com.nskfdc.scgj.common;

import org.jasypt.util.text.BasicTextEncryptor;

public class PasswordUtils {

	public static String decrypt(String encryptionKey, String databasePassword) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(encryptionKey);
		return textEncryptor.decrypt(databasePassword);
		
	}

	public static String encrypt(String encryptionKey, String databasePassword) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(encryptionKey);
		return textEncryptor.encrypt(databasePassword);
		
	}
	
	public static void main(String[] args) {
		System.out.println(encrypt("nskfdcIndia","NsKfDc123$$"));
	}
	
}
