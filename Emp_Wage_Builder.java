import java.util.Random;
import java.util.Scanner;
public class Emp_Wage_Builder {
	int Part_Time = 0;
	int Full_Time = 1;
	String Company_Name;
	int Emp_Rate_Per_Hour;
	int Emp_Number_Of_Working_Days;
	int Max_Hours_Per_Month;
	int Total_Emp_Wage;
	Emp_Wage_Builder(String Company_name, int Emp_Rate_Per_Hour, int Emp_Number_Of_Working_Days,int Max_Hours_Per_Month) {
		this.Company_Name=Company_name;
		this.Emp_Rate_Per_Hour=Emp_Rate_Per_Hour;
		this.Emp_Number_Of_Working_Days=Emp_Number_Of_Working_Days;
		this.Max_Hours_Per_Month=Max_Hours_Per_Month;
	}
	void Compute_Emp_Wage() {
		int Emp_Hours=0;
		int Total_Emp_Hours=0;
		int Total_Working_Days=0;
		while(Total_Emp_Hours<=Max_Hours_Per_Month && Total_Working_Days<Emp_Number_Of_Working_Days ){
			Total_Working_Days++;
			Random r1=new Random();
			int Emp_Check=r1.nextInt(2);
			switch (Emp_Check) {
			case 0:
				Emp_Hours=4;
				break;
			case 1:
				Emp_Hours=8;
				break;
		default:
				Emp_Hours=0;
			}
			Total_Emp_Hours+=Emp_Hours;
			System.out.println("Days="+Total_Working_Days+"Emp Hours="+Total_Emp_Hours);
		}
		Total_Emp_Wage=Total_Emp_Hours*Emp_Rate_Per_Hour;
	}
	public String toString() {
		return "Total Emp Wage For Company "+Company_Name+" is "+Total_Emp_Wage;
	}

public static void main(String arg[]) {
		String Company_Name;
		int Emp_Rate_Per_Hour;
		int Emp_Number_Of_Working_Days;
		int Max_Hours_Per_Month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company Name ");
		Company_Name = sc.next();
		System.out.println("Enter Employee Rate Per Hour ");
		Emp_Rate_Per_Hour = sc.nextInt();
		System.out.println("Enter Number Of Working Days ");
		Emp_Number_Of_Working_Days = sc.nextInt();
		System.out.println("Enter Max Hours Per Month ");
		Max_Hours_Per_Month = sc.nextInt();
		Emp_Wage_Builder obj1 = new Emp_Wage_Builder(Company_Name,Emp_Rate_Per_Hour,Emp_Number_Of_Working_Days,Max_Hours_Per_Month);
		obj1.Compute_Emp_Wage();
		System.out.println(obj1);
	}
}
