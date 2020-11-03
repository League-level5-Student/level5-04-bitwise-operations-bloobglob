package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		printByteBinary((byte) 37);
		printShortBinary((short) 118);
		printIntBinary(35);
		printLongBinary((long) 2047);
	}
	
	public static void printByteBinary(byte b) {
		String binaryStr = "";
	    
        do {
            int quotient = b >>> 1;
        
            if( b % 2 != 0 ){
                binaryStr = '1' + binaryStr;
            } else {
                binaryStr = '0' + binaryStr;
            }
            
            b = (byte) quotient;
            
        } while( b != 0 );
        System.out.println(binaryStr);
	}
	
	public static void printShortBinary(short s) {
		String binaryStr = "";
	    
        do {
            int quotient = s >>> 1;
        
            if( s % 2 != 0 ){
                binaryStr = '1' + binaryStr;
            } else {
                binaryStr = '0' + binaryStr;
            }
            
            s = (short) quotient;
            
        } while( s != 0 );
        System.out.println(binaryStr);
	}
	
	public static void printIntBinary(int i) {
		String binaryStr = "";
	    
        do {
            int quotient = i >>> 1;
        
            if( i % 2 != 0 ){
                binaryStr = '1' + binaryStr;
            } else {
                binaryStr = '0' + binaryStr;
            }
            
            i = quotient;
            
        } while( i != 0 );
        System.out.println(binaryStr);
	}
	
	public static void printLongBinary(long l) {
		String binaryStr = "";
	    
        do {
            // 1. Logical right shift by 1
            long quotient = l >>> 1;
        
            // 2. Check remainder and add '1' or '0'
            if( l % 2 != 0 ){
                binaryStr = '1' + binaryStr;
            } else {
                binaryStr = '0' + binaryStr;
            }
            
            l = quotient;
            
        // 3. Repeat until number is 0
        } while( l != 0 );
        System.out.println(binaryStr);
	}
}
