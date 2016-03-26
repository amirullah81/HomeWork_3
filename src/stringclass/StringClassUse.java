package stringclass;

import java.io.UnsupportedEncodingException;

public class StringClassUse {

	public static void main(String[] args) {
		//1. This method Returns a char at the specified index
		String s = "This method Returns a char at the specified index";
		char result = s.charAt(5);
		System.out.println(result);
		//end
		
		//2. Compares this String to another Object
		String a1 = "Compares this String to another Object";
        String a2 = "This method Returns a char at the specified index";
        String a3 = "This method Returns a char at the specified index";
        
        int result2 = a1.compareTo(a2);
        System.out.println(result2);
        
        result2 = a2.compareTo(a3);
        System.out.println(result2);
        
        result2 = a3.compareTo(a1);
        System.out.println(result2);
        //End
        
        //3. String concatenates
        String b1 = "Concatenates the specified string";
        b1 = b1.concat(" to the end of this string.");
        System.out.println(b1);
        //End
        
        //4. Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer
        String c1 = "Hi, This is Alex";
        String c2 = "Hello World";
        StringBuffer c3 = new StringBuffer( "Hi, This is Alex");
        
        boolean result3 = c1.contentEquals(c3);
        System.out.println(result3);
        
        result3 = c2.contentEquals(c3);
        System.out.println(result3);
        //End
        
        //5. Returns a String that represents the character sequence in the array specified
        char[] d1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String d2 = "";
        
        d2 = d2.copyValueOf( d1 );
        System.out.println("Returned String: " +d2);
        
        d2 = d2.copyValueOf(d1, 3, 5);
        System.out.println("Returned String: " +d2);
        //End
        
        //6. Tests if this string ends with the specified suffix
        String e1 = "Tests if this string ends with the specified suffix";
        boolean e1Val;
        
        e1Val = e1.endsWith("suffix");
        System.out.println("Return Value " +e1Val);
        
        e1Val = e1.endsWith("suf");
        System.out.println("Return Value " +e1Val);
        //End
        
        //7. Compares this string to the specified object

        String f1 = new String("Compares this string to the specified object");
        String f2 = f1;
        String f3 = new String("Compares this string to the specified object");
        boolean fVal;

        fVal = f1.equals( f2 );
        System.out.println("Returned Value = " + fVal );

        fVal = f1.equals( f3 );
        System.out.println("Returned Value = " + fVal );
        //End
        
        //8. Compares this String to another String, ignoring case considerations

         String ab1 = new String("Compares this String to another String, ignoring case considerations");
	      String ab2 = ab1;
	      String ab3 = new String("Compares this String to another String, ignoring case considerations");
	      String ab4 = new String("Compares this String to another String, ignoring case considerations");
	      boolean abVal;
	
	      abVal = ab1.equals( ab2 );
	      System.out.println("Returned Value = " + abVal );
	
	      abVal = ab1.equals( ab3 );
	      System.out.println("Returned Value = " + abVal );
	
	      abVal = ab1.equalsIgnoreCase( ab4 );
	      System.out.println("Returned Value = " + abVal ); 
        //End
	      
	      //9. Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array
	      String abc1 = new String("Welcome to Tutorialspoint.com");

	      try{
	         byte[] abc2 = abc1.getBytes();
	         System.out.println("Returned  Value " + abc2 );

	         abc2 = abc1.getBytes( "UTF-8" );
	         System.out.println("Returned  Value " + abc2 );

	         abc2 = abc1.getBytes( "ISO-8859-1" );
	         System.out.println("Returned  Value " + abc2 );
	      }
	      catch( UnsupportedEncodingException e){
	         System.out.println("Unsupported character set");
	      }
	      //End
	      
	      //10. Copies characters from this string into the destination character array.
	      
	      String St1 = new String("Copies characters from this string into the destination character array");
	      char[] St2 = new char[7];

	      try{
	         St1.getChars(2, 9, St2, 0);
	         System.out.print("Copied Value = " );
	         System.out.println(St2 );

	      }catch( Exception ex){
	         System.out.println("Raised exception...");
	      }
	      //End
	      
	      //11. Returns a hash code for this string
	      
	      String xy = new String("Welcome PIIT");
	      System.out.println("Hashcode for xy :" + xy.hashCode() );
	      //End
	      
	      //12. Returns the index within this string of the first occurrence of the specified character
	      String Xyz = new String("Returns the index within this string of the first occurrence of the Specified character");
	      String SubXyz1 = new String("Specified");
	      String SubXyz2 = new String("Tpecified");

	      System.out.print("Found Index :" );
	      System.out.println(Xyz.indexOf( 'o' ));
	      System.out.print("Found Index :" );
	      System.out.println(Xyz.indexOf( 'o', 5 ));
	      System.out.print("Found Index :" );
	      System.out.println( Xyz.indexOf( SubXyz1 ));
	      System.out.print("Found Index :" );
	      System.out.println( Xyz.indexOf( SubXyz1, 15 ));
	      System.out.print("Found Index :" );
	      System.out.println(Xyz.indexOf( SubXyz2 ));
	      //End
	      
	      //13. This method Returns a canonical representation for the string object
	      
	      String z1 = new String("This method Returns a canonical representation for the string object");
	      String z2 = new String("This method Returns a canonical representation for the string object");

	      System.out.print("Canonical representation:" );
	      System.out.println(z1.intern());

	      System.out.print("Canonical representation:" );
	      System.out.println(z2.intern());
	      //End
	      
	      //14. Returns the length of this string
	      
	      String Sr1 = new String("Returns the length of this string");
	      String Sr2 = new String("length" );

	      System.out.print("String Length :" );
	      System.out.println(Sr1.length());

	      System.out.print("String Length :" );
	      System.out.println(Sr2.length());
	      //End
	      
	      //15. Tells whether or not this string matches the given regular expression
	      
	      String Str = new String("Tells whether or not this string matches the given regular expression");

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("(.*)whether(.*)"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("whether"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Tells(.*)"));
	      //End   
	}

}
