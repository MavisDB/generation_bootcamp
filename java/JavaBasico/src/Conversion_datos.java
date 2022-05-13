
public class Conversion_datos {
	
	public static void main(String[] args) {
		byte numByte = 127;
		short numShort = numByte;
		int numInt = numShort;
		long numLong = 50000000;
		
		//casteo o parse
		int otroInt = (int) numLong;
		short otroShort = (short) otroInt;
		byte otroByte = (byte) otroShort;
		
		
		System.out.println(otroShort);
	}
}
