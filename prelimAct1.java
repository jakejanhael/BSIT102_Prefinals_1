/* Pre-final Activity 1
 * Jake Janhael Hapita
 * BSIT1021
 *
 */

import java.util.Scanner;

class prelimAct1
{

public static void main(String args[])
{

		int n,thousands,hundreds,tens,ones,zero,elevens;
		
		  Scanner scan = new Scanner(System.in);
		
		  System.out.println("Enter Number: ");
		   n = scan.nextInt();
		
		if (n==0) // if zero yung ininput na number the output is zero
		{
			
		switch (n)
		{
		  case 0: System.out.println("Zero");break;
		  }
		}
		 
		 
		  if ((n>=100) && (n<=1000)) // if statement, range 100-1000
		  {
		  thousands = n/1000; // if you input a digits in thousands it will divided by 1000 so the answer will be one digit only that choose from the case
		 
		  hundreds = n/100; //if you input digits with value of hundreds it will divided by 100 to have a one digit answer that choose from the cases
		  n = n%100;
		
			  switch(thousands) //the value of thousand move to switch to able to choose from the cases
			  {
			  case 1: // if the answer in thousand divided by 1000 is 1
			 	System.out.print("One Thousand ");
			 	break;
			  }
			
			
			  switch (hundreds) //answer of n divided to 100
			  {
			  case 1:
			  	System.out.print("One Hundred "); //if the answer in n divided by 100 is 1
			  	break;
			 
			  case 2:
			  	System.out.print("Two Hundred ");	//the answer in n divided by 100 is 2
			  	break;
			 
			  case 3:
			  	System.out.print("Three Hundred "); //the answer in n divided by 100 is 3
			  	break;
			 
			  case 4:
			  	System.out.print("Four Hundred "); //the answer in n divided by 100 is 4
			  	break;
			 
			  case 5:
			  	System.out.print("Five Hundred ");//the answer in n divided by 100 is 5
			  	break;
			 
			  case 6:
			  	System.out.print("Six Hundred ");//the answer in n divided by 100 is 6
			  	break;
			 
			  case 7:
			  	System.out.print("Seven Hundred ");//the answer in n divided by 100 is 7
			  	break;
			 
			  case 8:
			  	System.out.print("Eight Hundred ");//the answer in n divided by 100 is 8
			  	break;
			 
			  case 9:
			  	System.out.print("Nine Hundred ");//the answer in n divided by 100 is 9
			  	break; //for break it is use to run the case and not to keep on going to another cases
			  }
		  }
		
		
		if ((n>10) && (n<20)) //if n is greater than 10 but less than 20
		{
			tens = n/10; // the n will be divided by 10 if it is 11-19
			ones = n;
			elevens = n%10; // it will get the modulo of n and 10
			
			switch (elevens) //switch the var elevens to run the cases below
			{
			  case 1: //if the n and 10 has a modulo of 1
				System.out.print("Eleven ");
				break;
			
			  case 2: //if the n and 10 has a modulo of 2
			  	System.out.print("Twelve ");
			  	break;
			 
			  case 3: //if the n and 10 has a modulo of 3
			  	System.out.print("Thirteen ");
			  	break;
			 
			  case 4: //if the n and 10 has a modulo of 4
			  	System.out.print("Fourteen ");
			  	break;
			 
			  case 5: //if the n and 10 has a modulo of 5
			  	System.out.print("Fifteen ");
			  	break;
			 
			  case 6: //if the n and 10 has a modulo of 6
			  	System.out.print("Sixteen ");
			  	break;
			 
			  case 7: //if the n and 10 has a modulo of 7
			  	System.out.print("Seventeen ");
			  	break;
			 
			  case 8: //if the n and 10 has a modulo of 8
			  	System.out.print("Eighteen ");
			  	break;
			 
			  case 9: //if the n and 10 has a modulo of 9
			  	System.out.print("Nineteen ");
			  	break;
			}
		}
		
		if (n>1000) // if n or the number you input is greater than 1000
		{
			System.out.print("ERROR! Number is greater than 1000"); // the statement if n or the number you input is greater than 1
		}
		
		else // if the if statement is false it will go to else which:
		{
			tens = n/10; // the n divided by ten so the answer will be one digit inly to able to run and choose from cases
			n = n%10; // the n will get the modulo of n to 10 to able to show the ones if you input 3 digit numbers
			ones = n; //
		
			switch (tens) // the variable ten switch to many cases from the quotient of n/10
			{
			case 1:
				System.out.print("Ten ");
				break;
			
			case 2:
				System.out.print("Twenty ");
				break;
			
			case 3:
				System.out.print("Thirty ");
				break;
			
			case 4:
				System.out.print("Fourty ");
				break;
			
			case 5:
				System.out.print("Fifty ");
				break;
			
			case 6:
				System.out.print("Sixty ");
				break;
			
			case 7:
				System.out.print("Seventy ");
				break;
			
			case 8:
				System.out.print("Eighty ");
				break;
			
			case 9:
				System.out.print("Ninety ");
				break;
			}
			
			switch (ones) // same function from the hundreds and thousands the answer will choose form cases
			{
			case 1:
				System.out.print("One ");
				break;
			
			case 2:
				System.out.print("Two ");
				break;
			
			case 3:
				System.out.print("Three ");
				break;
			
			case 4:
				System.out.print("Four ");
				break;
			
			case 5:
				System.out.print("Five ");
				break;
			
			case 6:
				System.out.print("Six ");
				break;
			
			case 7:
				System.out.print("Seven ");
				break;
			
			case 8:
				System.out.print("Eight ");
				break;
			
			case 9:
				System.out.print("Nine ");
				break;
	}

}

}  
}