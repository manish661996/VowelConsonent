package com.bridgelabz.VowelConsonent;

import org.apache.logging.log4j.Logger;



import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log = LogManager.getLogger(App.class);
	private char Alphabet;
    public static void main( String[] args )
    {
    	// this section of the code will generate log file and print log message on console
    			String message="Welcome ";
    			Log.debug(message + " will be printed on Debug");
    			Log.info(message + " Will be printed on info");
    			Log.warn(message + " will be printed on warn");
    			Log.error(message + " will be printed on error");
    			Log.fatal(message + " will be printed on fatal");
    			Log.info("Appending String: {}.", message);
    			System.out.println(message);
    			
    			//creating object
    			App a = new App();
    			a.setAlphabet();
    			a.isVowelOrConsonent();
    }
    //method to set the value for IsVowelOrConsonent
    public void setAlphabet() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter a charecter to verify");
    	this.Alphabet=sc.next().charAt(0);
    }
    //method to get the value of IsVowelOrConsonent
    public char getAlphabet() {
    	return this.Alphabet;
    }
    //method to find charecter is vowel or consonent
    public void isVowelOrConsonent() {
    	 if(this.Alphabet== 'a' || this.Alphabet == 'e' || this.Alphabet == 'i' || this.Alphabet == 'o' || this.Alphabet == 'u' )
             System.out.println(this.Alphabet + " is vowel");
         else
             System.out.println(this.Alphabet + " is consonant");
    }
    
    
    
}
