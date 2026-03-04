package module_5;

import java.io.*;

public class ExceptionDemo{
	public static void main(String[] a){
		try{
			FileReader fr =new FileReader("abc.txt");
			}
		catch(IOException e){
			System.out.println("Checked Exception");
			}

		try{
			int x=10/0;
			}
		catch(ArithmeticException e){
			System.out.println("Unchecked Exception");
			}
		}
}