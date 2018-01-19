package ca.demo.salestool;
/* Represents sales data for a given peiod */
public class SalesData {
	int data[] = { 0, 4, 42 };

	public void display() {
		System.out.println("Data : ");
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			System.out.println("Next Value : " + data[i]);
			sum += i;
		}

		System.out.println("The sume is " + sum);
	}

}
