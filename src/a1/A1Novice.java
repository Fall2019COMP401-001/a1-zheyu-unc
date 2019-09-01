package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		// Your code follows here.
		int number_of_customers = scan.nextInt(); //first input will be an integer indicating the total number of customers
		
		String[] initial_name = new String[number_of_customers]; //The first name of the customer
		String[] last_name = new String[number_of_customers]; //The last name of the customer
		double[] total_cost = new double[number_of_customers];
		
		for (int i=0; i < number_of_customers; i++) {
			String initial = scan.next();
			initial = initial.substring(0,1).toUpperCase();
			initial_name[i] = initial;
			String last = scan.next();
			last_name[i] = last;
			
			int items = scan.nextInt();
			int[] item_number = new int[items];
			double[] item_cost = new double[items];
			double per_total_cost = 0.0;
			for (int i1=0; i1<items; i1++) {
				int number = scan.nextInt();
				item_number[i1] = number;
				String item_name = scan.next();
				double cost = scan.nextDouble();
				item_cost[i1] = cost;
				per_total_cost  += item_number[i1] * item_cost[i1];
			}
			total_cost[i] = per_total_cost;
			
		}

		for (int i2=0; i2 <number_of_customers; i2++) {
			System.out.print(initial_name[i2]);
			System.out.print(". ");
			System.out.print(last_name[i2]);
			System.out.print(": ");
			System.out.println(String.format("%.2f", total_cost[i2]));

		}
	}
}
