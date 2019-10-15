package com.ArrayAverage.app;
import java.util.Random;
public class ArrayAverage 
{

	public static void main(String[] args) 
	{
				//Constant
				final int ELEMENTS_ARRAY=5;
				
				//Variable
				int average=0;
				
				//Array Declaration
				byte[] vector = new byte [ELEMENTS_ARRAY];
				
				//Object declaration
				Random randomNumbers = new Random(System.nanoTime());
				
				//Relleno del vector con numeros aleatorios
				for (int i=0;i<ELEMENTS_ARRAY;i++)
				{
					vector[i]= (byte) randomNumbers.nextInt(10);
					System.out.println(vector[i]);
					average += vector[i];
				}
				
				
				average= average/ELEMENTS_ARRAY;
				
				System.out.println("El Promedio es: "+average);
				
	}

}
