import java.util.Scanner;
public class Employee_Wage_Computation {

	public static void main(String [] arg){
		System.out.println("Welcome To Employee Wage Computation Program");
		Attendence employee=new Attendence();
		employee.calculate_attendence();
		Daily_Full_Time_Wage Daily_Full_Wage=new Daily_Full_Time_Wage();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Wage Per Hour");
		int Wages_Per_Hour=sc.nextInt();
		System.out.println("Enter Number Of Working Days");
		int Working_Days=sc.nextInt();
		System.out.println("Enter Working Hour Per Month");
		int Working_Hour_Per_Month=sc.nextInt();
		Daily_Full_Wage.Show_Wages(Wages_Per_Hour,Working_Days,Working_Hour_Per_Month);
		}
}
