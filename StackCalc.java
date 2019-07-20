package a;

import java.util.*;

public class StackCalc {

	//returns the operated to put onto the stackLL
	//pre a operator, and the two most recent "pushes"
	//post the answer to the items added/subtracted/divided/multiplied by the operator.
	public static double operate(char op, double x, double y) {
		
		if(op=='+'){
			return(y+x);
		}else if(op=='-'){
			return(y-x);
		}else if(op=='*'){
			return(y*x);
		}else{
			return(y/x);
		}

	}
	
	public static void main( String args[] ){
	String x = " ";
	double temp= 0;
	StackLL calc = new StackLL( );
	Scanner input = new Scanner(System.in);

	while(x != "") {
	System.out.println("Enter number, math operation(+,-,*, or /), or Q to quit:");	
	
	x = input.nextLine();
	try{
	calc.push(Double.parseDouble(x));
	
	}catch(NumberFormatException e){
		if (x.charAt(0) == 'q'|| x.charAt(0) == 'Q'){//for quitting
			break;
		}else if (x.charAt(0) == '+'||x.charAt(0) == '-'||x.charAt(0) == '*'||x.charAt(0) == '/'){
			try{
			temp = 	calc.pop();	//for calculating and putting on stack.
			calc.push(operate(x.charAt(0), temp, calc.pop()));
			
			}catch(NoSuchElementException ex){// if there is 1 or less items.
				System.out.println("You need to enter at least 2 numbers to operate on");
			}
		}else{
			System.out.println("You need to input a number or math operation.");
		}
		
		
	} // if it cannot be parced into a double, it will see if the string is either of the characters
	
			
}

	input.close();
	
	try{
	System.out.println("The answer is " + calc.peek());
	}catch(NoSuchElementException e){
		System.out.println("End Program"); // if nothing is in the stack.
	}
	}
	
	
}
