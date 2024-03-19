package main;
import java.security.SecureRandom;

public class RandomPassGenrator {

	private static final String LOWECASE_CHAR="abcdefghijklmnopqrstuvwxyz"; 
	private static final String UPPER_CHAR=LOWECASE_CHAR.toUpperCase(); 
	private static final String NUMBER="0123456789"; 
	private static final String OTHER_CHAR="!@#$%^&*()";
	
	private static final String BASE_PASSWORD_CHAR=LOWECASE_CHAR+UPPER_CHAR+OTHER_CHAR+NUMBER;
	private static final SecureRandom random=new SecureRandom();
	
	public static String genartePassword(int length) {
		if(length<1) throw new IllegalArgumentException("Lenghth SHould be Greater than 1");
		StringBuilder sb= new StringBuilder(length);
		for(int i=0;i<length;i++) {
			int charIndex=random.nextInt(BASE_PASSWORD_CHAR.length());
			sb.append(BASE_PASSWORD_CHAR.charAt(charIndex));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		int passwordLength=10;
		String password=genartePassword(passwordLength);
		System.out.println("Password:" + password);
	}
	
}
