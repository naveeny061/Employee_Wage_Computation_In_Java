import java.util.Scanner;
public class Emp_Wage_Builder {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of companies");
		int number = sc.nextInt();
		int array[];
		array = new int[number];
		String array1[];
		array1 = new String[number];
		String Company_Name;
		int Emp_Rate_Per_Hour;
		int Emp_Number_Of_Working_Days;
		int Max_Hours_Per_Month;
		int i = 0;
		while (i < number) {
			System.out.println("Enter Company Name ");
			Company_Name = sc.next();
			System.out.println("Enter Employee Rate Per Hour ");
			Emp_Rate_Per_Hour = sc.nextInt();
			System.out.println("Enter Number Of Working Days ");
			Emp_Number_Of_Working_Days = sc.nextInt();
			System.out.println("Enter Max Hours Per Month ");
			Max_Hours_Per_Month = sc.nextInt();
			Company_Emp_Wages obj1 = new Company_Emp_Wages(Company_Name, Emp_Rate_Per_Hour, Emp_Number_Of_Working_Days,
					Max_Hours_Per_Month);
			array[i] = obj1.Compute_Emp_Wage();
			array1[i] = obj1.Company_Name;
			i++;
		}
		for (i = 0; i < number; i++) {
			System.out.println("Company Name-"+array1[i]+"  Total Wage-"+array[i]);
		}
	}
}
