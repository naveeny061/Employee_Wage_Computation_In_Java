public class Employee_Wage_Computation {

	public static void main(String [] arg){
		System.out.println("Welcome To Employee Wage Computation Program");
		Attendence employee=new Attendence();
		employee.calculate_attendence();
		Daily_Full_Time_Wage Daily_Full_Wage=new Daily_Full_Time_Wage();
		Daily_Full_Wage.Show_Wages();
		}
}
