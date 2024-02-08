package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What value of n would you like to start with?");
		int n = in.nextInt();
		
		boolean [] array  = new boolean[n]; 
		
		for (int i=2; i < array.length; i++){
		array[i] = true;
		}
		
		for (int i=2; i < array.length; i++){
			
			
			for(int f = i*i; f < array.length; f = i+f){
			array[f] = false;
			
			}
		}
		
		for (int i=2; i <array.length; i++)
		{
			if (array[i] == true)
					{
				System.out.println(i);
					}
			
		}
		}

}
