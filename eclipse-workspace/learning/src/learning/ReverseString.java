package learning;

	import java.lang.*;
	import java.io.*;
	import java.util.*;
	
	public class ReverseString {
		
		public static void main(String []args) {
			String in = "Dracarys";
	        StringBuilder in1 = new StringBuilder(); 
			in1.append(in);
			in1 = in1.reverse();
			System.out.println(in1);
		}
	}