package com.arrayplay;
import java.util.Arrays;

public class ArrayPlay {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }

        }

        System.out.println(index);
        System.out.println(exampleArray.equals(exampleArray));
        
       
		
		}
	}


