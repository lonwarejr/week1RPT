package class1;

public class Week1 {

	public static void main(String[] args) {
		
	
		for (int i = 0; i < 10; i++) {
        	System.out.println(i); 
        }
        for (int i = 10; i >= 0; i--) {
        	System.out.println(i);
        }
        for (int i = 0; i <= 100; i++) {
        	if (i % 2 == 0) {
        	System.out.println(i);
        	}
        }
        for (int i = 0; i <= 100; i++) {
        	if (i % 2 == 0){ 
        		System.out.println(i + "EVEN");
        	} else {
        		System.out.println(i + "ODD");
        	}}
        	int i = 100;
        	while (i > 0) {
        		System.out.println(i + " " + (i % 3));
        		i--;
        	}
        
	}

	}
//write a for loop that prints each number from 0 to 9
//write a for loop that prints each number from 10 to 0 backwards 
//write a for loop that prints every other number from 0 to 100
//write a for loop that interates 0 to 100 and prints "EVEN" if the number is even and "ODD" if its odd
//write a while loop that starts at 100 and iterates backwards by 1 until it rEACHES 0
//DIVIDE EACH NUMBER BY 3 AND PRINT THE REMAINDER TO THE CONSOLE