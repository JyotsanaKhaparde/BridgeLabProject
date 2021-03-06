package utility;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
//https://github.com/Saurabh323351/Bridgelabz/blob/master/BridgelabzPrograms/src/com/bridgelab/utility/Utility.java
import java.util.Scanner;

import com.bridgelabz.datastructure.HashChainingMethods;
import com.bridgelabz.datastructure.MyLinkedList;
import com.bridgelabz.datastructure.MyOrderedList;
import com.bridgelabz.datastructure.NodeOrderedList;





public class Utility {

	static Scanner scan = new Scanner(System.in);
	
	/*
	 *  This method is used to take integer input from user
	 */
	
	public static int getInt() {
	int Integer = scan.nextInt();
	return Integer;
	}
	
	/*
	 *  This method is used to take float input from user
	 */
	
	public static float getFloat() {
		float Float = scan.nextFloat();
		return Float;
		}
	
	/*
	 *  This method is used to take string input from user
	 */

	public static String getString() {
		String string = scan.nextLine();
		return string;
		}
	
	/*
	 *  This method is used to take double input from user
	 */

	public static double getDouble() {
		double Double = scan.nextDouble();
		return Double;
		}
	
	/*
	 *  This method is used to take long input from user
	 */

	public static long getLong() {
		long longvalue = scan.nextLong();
		return longvalue;
		}
	
	
	
	//**********************DoubleOpt*******************************************
	
	
	/**
	 * @param a taking double from user
	 * @param b taking double from user
	 * @param c taking double from user
	 */
	
	
	public static void getDoubleopt(double a,double b,double c)
	{
		
		//perform operation
		
	double x = a+(b*c);
	double y = (a*b)+c;
	double z = c+(a/b);
	double p = (a%b)+c;
	
	// output result
	
	System.out.println(x+" "+y+" "+z+" "+p);
	
	
	
	}
	
	
	//**************IntOpt*******************************************************
	
	/**
	 * @param a taking integer from user
	 * @param b taking integer from user
	 * @param c taking integer from user
	 * 
	 */
	
	
	public static void getIntOpt(int a,int b,int c) {
		
		//perform operation

		int x = a+(b*c);
		int y = (a*b)+c;
		int z = c+(a/b);
		int p = (a%b)+c;
		
		// output result

		System.out.println(x+" "+y+" "+z+" "+p);
	}
	
	//************LeapYear******************************************************
	
	/**
	 * @param year taking year from user if it is negative then enter valid year and year should be 
	 * greater then 1582
	 * @return 
	 */
	
	
	public static boolean getLeapYear(int year) {
		
	/*	if(year < 0) {
			System.out.println("Please enter positive year:  ");
			year=Utility.getInt();
			 Utility.getLeapYear(year);
		}*/
		
	
			//if(year >= 1582){
				if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
					return true;
				}else {
					return false;
				}

			

			
	}
		
	
	
	//*******************PrintThreeName****************************************
	

	/**
	 * @param str taking string from the user
	 */
		
	
		public static void getPrintThreeName(String str) {
		String a[] = str.split(" ");
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(""); 
		System.out.print("hii ");
		
		
		 // loop for reverse words
		 
		for(int i=a.length-1 ; i>=0 ; i--) {
			System.out.print(a[i]+" ");
		}
		}
	
	//***************Quadratic**************************************************

	/**
	 * @param a taking double from user
	 * @param b taking double from user
	 * @param c taking double from user
	 */
		
		
	public static void getQuadratic(double a, double b, double c) {
		
		 // declare variable
		 
        double root1, root2, delta;

        System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        
        delta = b * b - 4 * a * c;
        
         // check condition
         
        if(delta >= 0)
        {
            System.out.println("Roots are real");
            root1 = ( - b + Math.sqrt(delta))/(2*a);
            root2 = (-b - Math.sqrt(delta))/(2*a);
            
         // output result
             
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);
        }
        else 
        {
        	System.out.println("roots are imaginary");
        }
        }

	
	
	//****************TemperatureConversion**********************************************
	
	
	/**
	 * @param choice take integer value as an input 1 0r 2 from user
	 */
	
	public static void getTemperatureConversion(int choice) {
		
		double temperature = 0.0;
		double converted = 0.0;
		
		
		 // condition for choice 1 and 2
		 
		if(choice == 1) {
			
			System.out.println("Enter the temperature in celcius");
			temperature = Utility.getDouble();
			converted = (temperature*9/5)+32;
			System.out.println("Temperature in fahrenheit is: "+converted);
			
		}
		else {
			if(choice == 2) {
				
				System.out.println("Enter the temperature in fahrenheit: ");
				temperature = Utility.getDouble();
				converted = (temperature-32)*5/9;
				System.out.println("Temperature in celcius is: "+converted);
				
			}
			}
	}
	
	
	//**********************getSunOfTwoDice*********************************************

	/**
	 * @param x taking integer from user
	 * @param y taking integer from user 
	 */
	
	public static int getSumOfTwoDice() {
		
		
		  //Random is a inbuilt class in java.util package
		 
		Random dice = new Random();
		
		
		 // take 1st random number
		 
		int number1 = 1+dice.nextInt(6);
		System.out.println("First random number is: "+number1);
		
		
		 // take 2nd random number
		 
		int number2 = 1+dice.nextInt(6);
		System.out.println("Second random number is: "+number2);
		
		
		 // sum of both random number
		 
		
		int sum = number1 + number2;
		return sum;
		
	}
	
	//***************Stats5******************************************

	
	/**
	 * @param r input integer value from user 
	 * @param s input integer value from user 
	 */
	
	public static void getStar5(int r, int s) {
		double average;
		double sum = 0;
		double values[]=new double[5];
	
		//to find random value
		
		for(int i = 0 ; i < values.length ; i++) {
			values[i] = Math.random();
		System.out.println(values[i]);
		}
		
		//to find average
		
		for(int i = 0 ; i < values.length ; i++) {
			sum = sum+values[i];
		}
		average = sum/5;
		System.out.println("average is: "+average);
		
		//to find maximum value
		
		double max = values[0];
		for(int i = 0 ; i < values.length ; i++) {
			 if(values[i]>max) {
				 max = values[i];
			 }
			 }
		System.out.println("Maximum value is: "+max);

		//to find minimum value
		
		double min = values[0];
		for(int i = 0 ; i < values.length ; i++) {
			 if(values[i]<min) {
				  min = values[i];
			 }
			 }
		System.out.println("Minimum value is: "+min);
	}
	
	
	//***************SpringSeason**********************************************


	/**
	 * @param m input integer value from user 
	 * @param d input integer value from user 
	 */
	public static void getSpringSeason(int m, int d) {
		if(m<0 || d<0) {
			System.out.println("Please enter positive number: ");
			System.out.println("Enter Month is: ");
			m = Utility.getInt();
			System.out.println("Enter day is: ");
			d = Utility.getInt();
			Utility.getSpringSeason(m, d);
		}
		else
		{
		if((m == 3 && d >= 20 && d <= 31) || ( m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20))
		{
		System.out.println("true");
		}else {
			System.out.println("false");

		}
		}

	}
	
	//***********WindChill********************************************

	/**
	 * @param t input double value from user  
	 * @param v input double value from user 
	 */
	
	public static void getWindChill(double t, double v) {
			if(t>50 || v>120 || v<3) {
				System.out.println("not valid enter again: ");
				double t1 = Utility.getDouble();
				double v1 = Utility.getDouble();
				double w = 35.74 + 0.6215*t1 + ((0.4275*t1) - 35.75) * Math.pow(v1, 0.16);
				System.out.println("wind chill: "+w);


			}else {
				double w = 35.74 + 0.6215*t + ((0.4275*t) - 35.75) * Math.pow(v, 0.16);
				System.out.println("wind chill: "+w);
			}
	}
	
	//*****************Distance*******************************************

	/**
	 * @param x input double value from user 
	 * @param y input double value from user 
	 * @return
	 */
	
	public static double getDistence(double x, double y) {
		double distance = Math.sqrt((x*x) + (y*y));
		return distance;
		
	}

		
	
	//************CarLoan********************************************
	
	/**
	 * @param Y input int value from user 
	 * @param P input float value from user 
	 * @param R input float value from user 
	 */
	
	public static double getCarLoan(int Y, float P, float R) {
		float n = 12 * Y;
		float r = R/(12*100);
		double payment = (P*r)/Math.pow((-n),1-(1+r));
		return payment;
		
	}
	
	//****************DayOfWeek************************************

	/**
	 * @param y input integer value from user 
	 * @param m input integer value from user 
	 * @param d input integer value from user 
	 * @return 
	 */
	
	public static int getDayOfWeek(int y, int m, int d) {
        int y0 = y - (14 - m) / 12;
        
        int x = y0 + y0/4 - y0/100 + y0/400;
        
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        
        int d0 = (d + x + (31*m0)/12) % 7;	
        
        switch (d0) {
		
		case 0:
        	System.out.println("Sunday");
        	break;
		case 1:
        	System.out.println("Monday");
        	break;
		case 2:
        	System.out.println("Tuesday");
        	break;
		case 3:
        	System.out.println("Wednesday");
        	break;
		case 4:
        	System.out.println("Thursday");
        	break;
		case 5:
        	System.out.println("Friday");
        	break;
		case 6:
        	System.out.println("Saturday");
        	break;
		default:
			break;
        }
		return d0;
        }
	
	//**********************HarmonicNumber********************
	/**
	 * @param n take integer value from user
	 * @return
	 */
	public static double getHarmonic(int n)
	{

		if(n<0) {
			System.out.println("Please enter positive number: ");
			n = Utility.getInt();
			Utility.getHarmonic(n);
			
				}
				else 
					{
					double sum =0.0;
					for(int i = 1 ; i <= n ;i++) {
						sum = sum+ (1.0/i);
					}
					return sum;

					} 
					return Utility.getHarmonic(n);
					}
			
	
	//********************PrimtFactor***********************
	/**
	 * @param n take input from the user
	 */
	public static void primeFactor(long n) 
	{
		
	    for(int i = 2; i< n; i++) 
	    {
	       while(n%i == 0) 
	       {
	          System.out.println("Factor: "+i);
	          n = n/i;
	       }
	    }
	    if(n>2) //for 35 and so on this condition will apply 
	    {
	       System.out.println("Factor: "+n);
	    } 
	    if(n<0) {
	    	System.out.println("Please enter positive number: ");
			long n1 = Utility.getLong();
			Utility.primeFactor(n1);

	    }
	}
	
	//*******************FindRepeatedNumber***************************

	/**
	 * @param number takeing integer numbers from user in an array
	 */
	public static void getRepeatedNumber(int[] number) {
		for(int i = 0 ; i < number.length ; i++) {
			for(int j = i+1 ; j < number.length ; j++) {
				if(number[i] == number[j]) {
					System.out.println("Repeated value is: "+number[j]);
				}

			}
						
		}
		
	}
	
	//********************SecondLargeAndSmallElement*******************************

	/**
	 * @param a takeing integer numbers from user in an array
	 */
	public static void getSecondLargeAndSmallElement(int[] a) {
					
		
			int temp;
			
			for(int i = 0 ; i < a.length ; i++) {
				for(int j = i+1 ; j < a.length ; j++) {
					if(a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println("second largest number is: "+a[a.length - 2]);
			
			for(int i = 0 ; i < a.length ; i++) {
				for(int j = i+1 ; j < a.length ; j++) {
					if(a[i] < a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println("second smallest number is: "+a[a.length - 2]);

	}
	
	//*******************FlipCoin*****************************************

	
	/**
	 * @param f takeing integer numbers from user 
	 */
	public static void getFlipCoin(int f) {
		double d[]=new double[f];
		int tail = 0;
		int head = 0;
		if(f>0) {
			for(int i=0;i<f;i++) {
				d[i]= Math.random();
				if(d[i]<0.5) {
					System.out.println("tails");
					tail++;
				}else {
					System.out.println("heads");
					head++;
				}
				}
				}else {
					System.out.println("It is a negative number");
				
					

				}
				float PercentageHead  = (head*100)/f;
				System.out.println("Percentage of head= "+PercentageHead);
			
				float PercentageTail  = (tail*100)/f;
				System.out.println("Percentage of tail= "+PercentageTail);
				}
	
	//*******************PowerOf2********************************************

	/**
	 * @param n takeing integer numbers from user in an array
	 */
	public static void getPowerOf2(int n) {
		int power=0;
		if(n<0) {
			System.out.println("Please enter positive number: ");
			n = Utility.getInt();
			Utility.getPowerOf2(n);
		}else {
		if(0<=n) {
			if(n<31) {
				System.out.println("power of 2: ");
				for(int i=1;i<=n;i++) {
					power = (int) Math.pow(2, i);
					System.out.println("2 ^ "+i+" = "+power);
				}
				
			}else {
			System.out.println("overflows an int");
			}
		}
		}
	}
	
	//*******************Prime*************************************************

	/**
	 * @param n takeing integer numbers from user in an array
	 */
	public static void getPrime(int n) {
		
	  //  List<Integer> primes = new ArrayList<Integer>();
	    
		String primeNumbers = " ";
		 for (int i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(int num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		    
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to "+n+" are :");
	       
		System.out.println(primeNumbers);
	   }
	
	
	//******************Trig****************************************************

	/**
	 * @param degrees takeing double value from user in an array
	 */
	public static void getTrig(double degrees) {
		
		if(degrees<0) {
			System.out.println("please enter positive number: ");
			double degrees1 = Utility.getDouble();
			Utility.getTrig(degrees1);
		}else {
		
		// convert degrees to radians 
		double radians = Math.toRadians(degrees);
		System.out.println("radians is: "+radians);
		
        // sin() method to get the sin value 
		
		double sinVal = Math.sin(radians);
		System.out.println("sin = "+sinVal);

		
        // cos() method to get the cosine value 
		
		double cosVal = Math.cos(radians);
		System.out.println("cos = "+cosVal);
		
		
		
		}

	}

	//***********************Sqrt************************************************
	
	/**
	 * @param c takeing integer value from user in an array
	 */
	public static double getSqrt(double c) {
		
		double e = 1e-15;
		double t = c;
		if(c<0) {
			System.out.println("Please enter positive number: ");
			int c1 = Utility.getInt();
			Utility.getSqrt(c1);

		}else {
        // repeatedly apply Newton update step until desired precision is achieved
		
        while (Math.abs(t - c/t) > e*t) {
            t = (c/t + t) / 2.0;
        }
       
		}
		return t;
		
	}
	
	//*****************SinAndCos****************************************************

	
	
	/**
	 * @param x taking double value from user
	 * @param n taking integer value from user
	 * 
	 * method to find sinx 
	 * 
	 */
	public static double sin(double x , int n) {
		double p = 0;
		double q = 0;
		double sinx;
		double x1 = x%(2*Math.PI);
		
		for(int i = 1 ; i < n ; i = i + 4 ) {
			p = p + Math.pow(x1, i)/factorial(i);
			
		}
		for(int i = 3 ; i < n ; i = i + 4) {
			q = q - Math.pow(x1, i)/factorial(i);
		}
		sinx = p + q;
		return sinx;
		}
	
	
	/**
	 * @param x taking double value from user
	 * @param n taking integer value from user
	 * 
	 * 	 * method to find sinx 

	 */
	public static double cos(double x , int n) {
		double p = 0;
		double q = 0;
		double cosx;
		double x2 = x;
		for(int i = 4 ; i < n ; i = i + 4 ) {
			p = p + Math.pow(x2, i)/factorial(i);
			
		}
		for(int i = 2 ; i < n ; i = i + 4) {
			q = q - Math.pow(x2, i)/factorial(i);
		}
		cosx =1 + p + q;
		return cosx;
		}
	
	
	/**
	 * @param i taking integer value from user
	 * @return factorial of n number
	 * 
	 */
	public static long factorial(int n) {
		int fact = 1;
		//int n1;
		
			for(int i1 = 1 ; i1<= n ; i1++) {
			fact = fact*i1;
	
		}
			return fact;
		}
	

	//****************RollDie******************************************************


	/**
	 * @param n taking integer values from user
	 */
	public static void rollingDie(int n ) {
		Random dice = new Random();
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;

		for(int i = 0 ; i < n ; i++) {
			int num=1+dice.nextInt(6);
			System.out.println(num);
		
			if (num==1) {
				count1++;
			}
			
			if (num==2) {
				count2++;
			}
			
			if (num==3) {
				count3++;
			}
			
			if (num==4) {
				count4++;
			}
			
			if (num==5) {
				count5++;
			}
			
			if (num==6) {
				count6++;
			}
		
			
		}
		System.out.println();
		System.out.println(" 1 repeated :"+count1+"times   2 repeated :"+count2+"times  3 repeated :"+count3);
		System.out.println(" 4 repeated :"+count4+"times   5 repeated :"+count5+"times  6 repeated :"+count6);
	
		System.out.println();
		
	if(count1>count2 & count1>count3 &count1>count4 &count1>count5 & count1>count6) {
		System.out.println("1 maximum time rolled : "+count1);

	}else {
		if(count2>count1 & count2>count3 &count2>count4 &count2>count5 & count2>count6) {
			System.out.println("2 maximum time rolled : "+count2);
		}else {
			if(count3>count1 & count3>count2 &count3>count4 &count3>count5 & count3>count6) {
				System.out.println("3 maximum time rolled : "+count3);
			  }else {
					if(count4>count1 & count4>count2 &count4>count3 &count4>count5 & count4>count6) {
						System.out.println("4 maximum time rolled : "+count4);
					}else {
						if(count5>count1 & count5>count2 &count5>count3 &count5>count4 & count5>count6) {
							System.out.println("5 maximum time rolled : "+count5);
						  }else {
								if(count6>count1 & count6>count2 &count6>count3 &count6>count4 & count6>count5) {
									System.out.println("6 maximum time rolled : "+count6);
								}else {
									System.out.println("there are more then 1 maximum time repeated number");

								}
						  	}
						}
			  		}
				}
			}
		}
	
	//**************************gamlingSimulato********************************

	/**
	 * @param stake taking integer value from user
	 * @param goal taking integer value from user
	 * @param trails takling integer value from user
	 */
	public static void trails(int stake, int goal, int trails) {
		int won = 0;
		int loss = 0;
		int cash = stake;
		int bets=1;
		
		for(int t = 0 ; t < trails ; t++) {
		
			while(cash>0 && cash<goal) {
				if(Math.random()>0.5) {
					cash++;
				}else {
					cash--;
				}
			}
			if(cash==goal) {
				won++;
			}else {
				loss++;
			}
			
		}
		System.out.println("Number of times won :"+won);
		System.out.println("Number of times loss :"+loss);
		double perWin = (won*100)/trails;
		System.out.println("percent win : "+perWin);
		
		double perloss = (loss*100)/trails;
		System.out.println("percent win : "+perloss);
		
		
		
				
	}
	
	//********************Binary***************************************************
	
	/**
	 * @param decimal taking integer value from user
	 * 
	 */
	public static String decimalToBinary(int decimal) {
		// we can also convert decimal to binary by this ...
		
		/* String binary = Integer.toBinaryString(decimal);
		System.out.println("Binary is :"+binary);*/
		
		String binary="";
		
		int n = decimal;
		String sum = "";
		String reverse= "";
		
		//condition for getting remender
		
		while(n >=1) {
			binary=binary+(n%2);
			n = n/2;
		}
		
		//condition-if the element of binary number is greater then 0 or less then 4.
		
		
		if(binary.length() > 0 && binary.length() < 4) {
			for(int i = 0 ; i < 4-binary.length() ; i++) {
				sum = sum + 0;
			}
			binary = binary + sum;
		}
		
		//reverse the remender for getting binary number.
		
		for(int i = binary.length() - 1 ;i >= 0 ; i--) {
			reverse = reverse + binary.charAt(i);
		}
		return reverse;
		
		
	}
	
	//*************************Binary2**************************************************

	/**
	 * @param decimal taking integer value from user
	 */
	public static void swapNibbles(int decimal) {
		
		String binary="";
		int n = decimal;
		String sum = "";
		String reverse= "";
		//condition for getting remender
		
				while(n >=1) {
					binary=binary+(n%2);
					n = n/2;
				}
				//condition-if the element of binary number is greater then 0 or less then 4.
				
				
				if(binary.length() > 0 && binary.length() < 8) {
					for(int i = 0 ; i < 8-binary.length() ; i++) {
						sum = sum + 0;
					}
					binary = binary + sum;
				}
				
				//reverse the remender for getting binary number.
				
				for(int i = binary.length() - 1 ;i >= 0 ; i--) {
					reverse = reverse + binary.charAt(i);
				}
				System.out.println(" decimal to binary: "+reverse);
				String nibble1 = reverse;
				String b1="";
				String b2="";
				String s = "";
				for(int i = 0 ; i < 4 ;i++) {
					b1 = b1 + nibble1.charAt(i);
				}System.out.println("nibbel 1 : "+b1);
				
				for(int i = 4 ; i <= 7 ; i++) {
					b2 = b2 + nibble1.charAt(i);
				}System.out.println("nibbel 2 : "+b2);
				
				s = s+b2+b1;
				System.out.println("Swapped Nibble: "+s);
				int BtoD = Integer.parseInt(s, 2);
				System.out.println("Binary to decimal: "+BtoD);
			}
	
	//****************************BinarySearchWord******************************

	/**
	 * @param s taking string value from user.
	 * @throws IOException
	 */
	public static void matchWord(String s) throws IOException {
		String str = "";
		
	File file = new File("binarysearchword.txt"); 

		BufferedReader br = new BufferedReader(new FileReader(file)); 
		//String[] arryfile  = new String[br];
		String st; 
		while ((st = br.readLine()) != null) {
		 //str = st;
		 System.out.println(st);
		
		//String[] arryfile  = st;
		}
		if(s == str) {
			System.out.println("String matched");
		}else {
			System.out.println("String doesn't match");
		}


	}
	
	//***********************Insertionsort****************************************

	public static void insertionSort(int[] array, int n) {
		
		//put n number in array list
		
			int temp;
				for(int i = 0 ; i<n ; i++) {
					 array[i]=Utility.getInt();
				}
				
				//swap if any number is less then the any of previous number.
				
				for(int i = 1; i < array.length ; i++) {
					for(int j = 0 ; j < i-1 ; j++) {
						if(array[i] < array[j]) {
							temp = array[j];
							array[j]= array[i];
							array[i]= temp;
						}  
					}
				}
				
				//sorted list of number
				
				for(int i = 0 ; i < array.length ; i++) {
					System.out.println(array[i]);
				}
		
	}
	
	//***********************************BinarySearchOfWord**********************************

	public static void binarySearch(String word) throws IOException {

		//Read in a list of words from File
		
		String str="";
		Scanner reader = new Scanner(new File("BinarySrarchOfWord.txt"));
		while (reader.hasNext()){
			str = reader.nextLine();
	  }
		//System.out.println(str);
		String s = str;
		String check = "";
        String[] arrOfStr = s.split(",", 4); 
        
        // this code is for same output without binary search.
        
		/* String[] string = new String[str];
        
     	for (String a : arrOfStr) 
            System.out.println(a); 
		for(int i = 0 ; i < arrOfStr.length ; i++) {
			if(word.equals(arrOfStr[i])) {
				check = arrOfStr[i];
			}
			}*/
        
        // search the word with binary search.
        
        int first = 0;
        int last = arrOfStr.length;
        int mid  =  (first + last)/2;
        
        //loop for search words upto mid point.
        
        
        for(int i = 0 ; i <= mid ; i++) {
        	if(word.equals(arrOfStr[i])) {
        		check = arrOfStr[i];
        	}
        }
        
        //loop for search word after mid point.
        
        for(int i = mid ; i < last ; i++) {
        	if(word.equals(arrOfStr[i])) {
        		check = arrOfStr[i];
        	}
        }
		
			if(word.equals(check)) {
				System.out.println("yes, word is found");

			}
		else {
				System.out.println("word is not found");
			}		
	}
	
	//********************************BubbleSort***************************************

	public static void bubbleSort(int[] array, int n) {
		int temp;
		
		//loop for getting input from user
		
		for(int i =0 ; i < n ; i++) {
			array[i] = Utility.getInt();
		}
		
		//loop for perform bubble sort
		
		for(int i =  0 ; i < n-1 ; i++) {
			for(int j = i+1 ; j < n ; j++) {
				if(array[i]>array[j]) {
					temp = array[j];
					array[j]=array[i];
					array[i]= temp;
				}
			}
		}
		
		//sorted list of number
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
	}
	
	//********************************MergeSort******************************************

	public static void mergeSort(String[] array, int n) {
		int temp;
		int k;
		//loop for getting input from user
		
		for(k =0 ; k < n ; k++) {
			array[k] = Utility.getString();
		}
		for(k = 0 ; k < n ; k++) {
			System.out.println(array[k]);
		}
		int i;
		int j;
		int low = 0 ;
		int high = array.length;
		int mid = (low + high)/2;
		String  Left[] = null;
		String Right[] = null;
		 
		for(i = low ; i <= mid ; i++) {
			 Left[i] = Utility.getString();
		}
		for(i =low ; i<= mid ; i++) {
			System.out.println(Left[i]);
		}
		
		 for(j = mid+1 ; j <= high ; j++) {
			 Right[j] = Utility.getString();
		 }
		 
		 for(j =mid+1 ; j<= high ; j++) {
				System.out.println(Right[j]);
			}

		 
		 int nL = Left.length;
		 int nR = Right.length;
		 
		 while(i < nL && j < nR) {
			 if(Left[i].compareToIgnoreCase(Right[j])<0) 
			 {
				 array[k]=Left[i];
				 k++;
				 i++;
			 }
			 else 
			 {
				 array[k]=Right[j];
				 k++;
				 j++;
			 }
		 }
		 while(i < nL)
		 {
			 array[k]=Left[i];
			 i++;
			 k++;
		 }
		 while(j < nR) 
		 {
			 array[k]=Right[j];
			 j++;
			 k++;
		 }
		 
		 for(int k1 = 0 ; k1 < n ; k1++)
		 {
			 System.out.println(array[k1]);
		 }
		
		
			
		}
	
	//*****************************UnorderedList***************************************************

	public static void unorderedList(String word) throws IOException {
		
		//Read in a list of words from File

		  		//String p = "";
				String str="";
				Scanner reader = new Scanner(new File("unorderedlist.txt"));
				while (reader.hasNext()){
					str = reader.nextLine();
			
				}
				
				String s = str;
				//String check = "";
		        String[] arrOfStr = s.split(",", str.length()); 
		        
		        MyLinkedList<String> al = new MyLinkedList<String>();
		        for(int i = 0 ; i < arrOfStr.length ; i++) {
		        	al.add(arrOfStr[i]);
		        }
		        al.show();
	        	if(al.search(word)){
	        		String s1 = word;
	        		System.out.println("this word is alredy in list so remove it");
	        		//System.out.println(al.index(s1));
					int Deletedata = al.index(s1);
					al.pop(Deletedata);
					al.show();
	        	
		        	   }
	        		else 
	        		{
	        			System.out.println("this word is not in the list so add it");
	    				al.add(word);
	    				al.show();
	        			
	        		}
	        }

		        
		   
	
	//***********************************DistinctRandomNumber***********************************************

	public static void distinctRandomNumber(int n) {
		
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 
	/*	 Random dice = new Random();
			for(int i = 0 ; i < n ; i++) {
				list.add(1+dice.nextInt(6));
			//	System.out.println(num);
		
			}*/
			
        for (int i=1; i<n; i++) {
             list.add(new Integer(i));
         }
         Collections.shuffle(list);
         for (int i=1; i<n; i++) {
             System.out.println("Random Number= "+list.get(i));
         }
		
		
		//Collections.shuffle(list);
}
	
	//******************************OrderedList**********************

	public static void orderedList(int number) throws Exception{
		String str="";
	       MyOrderedList<Integer> al = new MyOrderedList<Integer>();
	       //MyLinkedList<Integer> al2 = new MyLinkedList<Integer>();

		
		Scanner reader = new Scanner(new File("orderedlist.txt"));
		while (reader.hasNext()){
			str = reader.nextLine();
	
		}
		
		String s = str;
		//String check = "";
        String[] arrOfStr = s.split(",", str.length()); 
       int[] array = new int[arrOfStr.length];
        for(int i  = 0 ; i < arrOfStr.length ; i++) {
        	array[i]= Integer.parseInt(arrOfStr[i]);
        }
    	NodeOrderedList<Integer> new_node1; 

        for(int i = 0 ; i < arrOfStr.length ; i++) {
    		new_node1 = al.newNode(array[i]); 
    		al.sortedInsert(new_node1);
        	//al.add(array[i]);
        }
		al.printList();

       //al.show();
       
      if(al.search(number)){
    	  System.out.println();
   		  System.out.println("this number is alredy in list so remove it");
			int Deletedata = al.index(number);
			al.pop(Deletedata);
			al.show();
   	
       	   }
   		else 
   		{
   			System.out.println();
   			System.out.println("this number is not in the list so add it");
   			new_node1 = al.newNode(number); 
   			al.sortedInsert(new_node1); 
				al.show();
   			
   		}
		}
	
	//************************HashingFunction*********************************

	public static void hashingFunction(int num) throws Exception {
		
		MyLinkedList<Integer> obj1 = new MyLinkedList<Integer>();
		
		String str="";
		int i;
		Scanner scan = new Scanner(new File("hashfunction.txt"));
	
		
		while(scan.hasNext())
	     {

	          String line = scan.nextLine(); 
	         // System.out.println(line);
	          String[] words = line.split(" ");
	        /*  for( i = 0 ; i <  words.length ; i++) {
		         System.out.println(words[i]);
	          }*/
	          
	         int[] number = new int[words.length];
	          for(i = 0; i < number.length ; i++) {
	        	  number[i] = Integer.parseInt(words[i]);
		          System.out.println(number[i]);

	          } 
	        	  /*for(i = 0 ; i < number.length ; i++) {
	        	  if(number[i] == num) {
	        		  number[i] = number[number.length - 1];
	        	  }
	        	 
		         // System.out.println(number[i]);

	        	  }
	        	  int[] newnumber = new int[number.length - 1];
	        	  
	        	  for(i = 0 ; i < newnumber.length ; i++) {
	        		  newnumber[i] = number[i];
	        	  }
	        	  
	        	  for(i = 0 ; i < newnumber.length ; i++) {
	        		  System.out.println(newnumber[i]);
	        	  }*/
	        	  
	        	  
	        /*	  for(int j = 0 ; j < number.length ; j++) {
	        		  if(number[j] != num) {
		        		  number[number.length+1] = num;
		        	  }
	        		 }
	        	  int[] newnumber2 = new int[number.length +1];
	        	  
	        	  for(int j = 0 ; j < newnumber2.length ; j++) {
	        		  newnumber2[j] = number[j];
	        	  }
	        	  int[] newnumber = new int[number.length - 1];

	        	  
	        	  for(int j = 0 ; j < newnumber.length ; j++) {
	        		  System.out.println(newnumber[j]);
	        	  }*/
	        	  
	        	  
	        	//  System.out.println(Arrays.toString(newnumber));
	           // System.out.println("numbers are: "+number[i]);
	      }
		
	//	System.out.println("Enter size: ");
		//HashChainingMethods obj = new HashChainingMethods(Utility.getInt());
		
		//for(int i = 0 ; i < words.)
		
		
		
		
	}
	
	//**************************************************************
	

	public static void bubbleSortString(String[] array, int n) {
		

        System.out.println("Please enter names to sort");              
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < array.length ;i++){

            array[i] = s1.nextLine();
        }
        
        for(int i = 0 ; i < array.length ; i++) {
        	//System.out.println(Arrays.sort(array[i]));
        }


		
	}
	}


		        
		     

			  	
		
		

	

			


	
	
	




	
	
	
	
	
	
