package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int number_of_items = scan.nextInt(); //number of items they have
		String[] item_name = new String[number_of_items];
		int[] item_amount = new int[number_of_items];
		int[] number_of_customer_bought = new int[number_of_items];
	
		for(int i = 0; i<number_of_items; i++) {
			String item = scan.next();
			item_name[i] = item;
			double cost = scan.nextDouble();
		}
	
		int number_of_customers = scan.nextInt(); // number of customers 3
		/*
		 * This for loop stores the full name of each customer in customer_full_name array
		 */
		for(int i1 = 0; i1<number_of_customers; i1++) {
			String first_name = scan.next(); //Carrie
			String last_name = scan.next(); //Brownstein
			
			int number_of_item_per_customer = scan.nextInt(); //3
			int[] item_count = new int[number_of_item_per_customer]; //Number of each item each customer buy
			String[] item_name_per_customer = new String[number_of_item_per_customer]; //name of items each customer buy
			/*
			 * This for loop examines all the items each customer buy
			 * output: the total spent of each customer 
			 */
			for(int i2=0; i2< number_of_item_per_customer; i2++) {
				item_count[i2] = scan.nextInt();
				item_name_per_customer[i2] = scan.next();
				/*
				 * This for loop compares name of products with item_name array 
				 * in order to have to price for each product
				 */
				for(int i3 = 0; i3<number_of_items; i3++) {
					if(item_name_per_customer[i2].equals(item_name[i3])) {
						item_amount[i3] += item_count[i2];
						number_of_customer_bought[i3] += 1;
					}	
				}
			}
		}
			
		for (int i4=0; i4<number_of_items; i4++) {
			if (number_of_customer_bought[i4] ==0){
				System.out.println("No customers bought " + item_name[i4]);
			}
			else {
				System.out.println(number_of_customer_bought[i4] + " customers bought " + item_amount[i4] + " " + item_name[i4]);
			}
			
		}
	
	
	}
}
