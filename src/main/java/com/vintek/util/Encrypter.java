package com.vintek.util;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.xml.bind.DatatypeConverter;

import java.util.logging.Logger;

public class Encrypter {

	private final static String m_strCipher = "AES";
	private final static String strKey = "5717229957172299";  // get it from the DB or prop file

	@Inject
    private Logger log;

	public Encrypter() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {		 
		String strPassword = "6CdfytUM0PUhTQgfWx4LpQ==";
		Encrypter encrypter = new Encrypter();
		String decrypted = encrypter.decrypt(strPassword); 
		System.out.println(decrypted);
		String encrypted = encrypter.encrypt(decrypted);
		System.out.println(encrypted);
		System.out.println("match?:" + encrypted.compareTo(strPassword));
	}
	
	public String decrypt(String strValue) {
		if (strValue == null || strValue.length() == 0) {
			return "";
		}
		try {	        
	        Cipher c = Cipher.getInstance(m_strCipher);
	        Key m_oKey = new SecretKeySpec(strKey.getBytes(), m_strCipher);
	        c.init(Cipher.DECRYPT_MODE, m_oKey);
	        byte[] m_arEncrypted = DatatypeConverter.parseBase64Binary(strValue);
	        byte[] decValue = c.doFinal(m_arEncrypted);
	        String decryptedValue = new String(decValue);
	        return decryptedValue;
	    } catch (Exception e) {
	    	e.printStackTrace();
			return null;
		}
	}
	
	public String encrypt(String strValue) {
		try {
			Cipher c = Cipher.getInstance(m_strCipher);
			Key m_oKey = new SecretKeySpec(strKey.getBytes(), m_strCipher);
			c.init(Cipher.ENCRYPT_MODE, m_oKey);
			byte[] encrypted = c.doFinal(strValue.getBytes());
			return DatatypeConverter.printBase64Binary(encrypted);
		} catch (Exception e) {			
			log.severe(e.toString());
			return null;
		}
	}
}
