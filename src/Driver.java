import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;

public class Driver {
	public static void main(String args[])
	{
		String text = "0123456789ABCDEF";

		String key = "AABB09182736CCDD";

		DES cipher = new DES();
		System.out.println("-------------> Using DES <-------------\n");
		System.out.println("Encryption of:  " + text);
		System.out.println();
		text = cipher.encrypt(text, key);
		System.out.println(
				"Cipher Text: " + text.toUpperCase() );
		System.out.println("---------------------------------------\n");
		System.out.println("\nDecryption of:  " + text.toUpperCase());
		System.out.println();
		text = cipher.decrypt(text, key);
		System.out.println("Plain Text: "
				+ text.toUpperCase());
		System.out.println("---------------------------------------");

		
		System.out.println("\n\n---------> Using Triple DES <----------\n");
		
		/////3DES/////

		String text2 = "0123456789ABCDEF";

		String key1 = "AABB09182736CCDD";
		String key2 ="BBAA10891237DDCC";
		String key3 ="CCDD34526178FFCC";

		DES cipher2 = new DES();

		System.out.println("Encryption of:  " + text2);
		System.out.println();
		text2 = cipher2.encrypt(cipher2.decrypt(cipher2.encrypt(text2, key1),key2),key3);  //  ENC(DEC(ENC(TEXT,KEY1),KEY2),KEY3)		
		System.out.println(
				"Cipher Text: " + text2.toUpperCase() );
		System.out.println("---------------------------------------\n");
		System.out.println("\nDecryption of:  " + text2.toUpperCase());
		System.out.println();
		text2 = cipher2.decrypt(cipher2.encrypt(cipher2.decrypt(text2, key1),key2),key3); //  DEC(ENC(DEC(TEXT,KEY1),KEY2),KEY3)		
		System.out.println("Plain Text: "
				+ text.toUpperCase());
		System.out.println("---------------------------------------");
	}



}
