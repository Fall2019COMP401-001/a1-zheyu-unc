package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int number_of_items = scan.nextInt(); //number of items they have
		String[] item_name = new String[number_of_items];//
		double[] item_cost = new double[number_of_items];
		/*
		 * This for loop stores all the products in two arrays
		 * one for name
		 * one for cost
		 */
		for(int i = 0; i<number_of_items; i++) {
			String item = scan.next();
			item_name[i] = item;
			double cost = scan.nextDouble();
			item_cost[i] = cost;
		}
		
		int number_of_customers = scan.nextInt(); // number of customers 3
		String[] customer_first_name = new String[number_of_customers];
		String[] customer_last_name = new String[number_of_customers];
		String[] customer_full_name = new String[number_of_customers]; //this array store 
		double[] total_cost = new double[number_of_customers]; //this array stores the total money spent for each customer
		/*
		 * This for loop stores the full name of each customer in customer_full_name array
		 */
		for(int i1 = 0; i1<number_of_customers; i1++) {
			String first_name = scan.next(); //Carrie
			customer_first_name[i1] = first_name;
			String last_name = scan.next(); //Brownstein
			customer_last_name[i1] = last_name;
			customer_full_name[i1] = customer_first_name[i1] +" " +  customer_last_name[i1];// Carrie Brownstein
			
			int number_of_item_per_customer = scan.nextInt(); //3
			int[] item_count = new int[number_of_item_per_customer]; //Number of each item each customer buy
			String[] item_name_per_customer = new String[number_of_item_per_customer]; //name of items each customer buy
			double[] item_price = new double[number_of_item_per_customer]; //Price of each item each customer buy
			double per_total_cost = 0.0;
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
						item_price[i2] = item_cost[i3];
					}	
				}	
				per_total_cost += item_count[i2] * item_price[i2];
							}
			total_cost[i1] = per_total_cost;
		}
		/*
		 * This for loop aims to find the average value of all the spendings
		 */
		double sum = 0.0;
		for(int i3=0; i3<number_of_customers; i3++) {
			sum += total_cost[i3];
		} 
		double average = sum / number_of_customers;
		/*
		 * This part is used to find the maximum amount of spending with name
		 */
		double max = 0.0;
		String most_name = new String(); 
		for(int i4=0; i4<total_cost.length; i4++ ) {
	         if(total_cost[i4]>max) {
	            max = total_cost[i4];
	            most_name = customer_full_name[i4];
	         }
	      }
		
		/*
		 * This part is used to find the miminum amount of spending with name
		 */
		double min = 1000.0;
		String least_name = new String(); 
		for(int i5=0; i5<total_cost.length; i5++ ) {
	         if(total_cost[i5]<min) {
	            min = total_cost[i5];
	            least_name = customer_full_name[i5];
	         }
	      }

		/*
		 * The final part of the program will print the expected output
		 */
		System.out.println("Biggest: " + most_name + " (" + max + ")");
		System.out.println("Smallest: " + least_name + " (" + min + ")");
		System.out.println("Average:" + String.format("%.2f",average));

	}
	
	
	}
