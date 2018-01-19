package ca.demo.salestool;
/* Represents sales data for a given peiod */
public class SalesData {
	int data[] = { -1, 0, 4, 42, 84 };

	public void display() {
		System.out.println("Data : ");
		int sum = 0;
		for (int i : data) {
			
			System.out.println("Next Value : " + i);
			sum += i;
		}

		System.out.println("The sum is " + sum);
	}

}
