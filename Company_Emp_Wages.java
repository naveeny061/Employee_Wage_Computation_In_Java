import java.util.Random;

public class Company_Emp_Wages {
	int Part_Time = 0;
	int Full_Time = 1;
	String Company_Name;
	int Emp_Rate_Per_Hour;
	int Emp_Number_Of_Working_Days;
	int Max_Hours_Per_Month;
	int Total_Emp_Wage;
	Company_Emp_Wages(String Company_name, int Emp_Rate_Per_Hour, int Emp_Number_Of_Working_Days,
			int Max_Hours_Per_Month) {
		this.Company_Name = Company_name;
		this.Emp_Rate_Per_Hour = Emp_Rate_Per_Hour;
		this.Emp_Number_Of_Working_Days = Emp_Number_Of_Working_Days;
		this.Max_Hours_Per_Month = Max_Hours_Per_Month;
	}
	int Compute_Emp_Wage() {
		int Emp_Hours = 0;
		int Total_Emp_Hours = 0;
		int Total_Working_Days = 0;
		while (Total_Emp_Hours <= Max_Hours_Per_Month && Total_Working_Days < Emp_Number_Of_Working_Days) {
			Total_Working_Days++;
			Random r1 = new Random();
			int Emp_Check = r1.nextInt(2);
			switch (Emp_Check) {
			case 0:
				Emp_Hours = 4;
				break;
			case 1:
				Emp_Hours = 8;
				break;
			default:
				Emp_Hours = 0;
			}
			Total_Emp_Hours += Emp_Hours;
		}
		Total_Emp_Wage = Total_Emp_Hours * Emp_Rate_Per_Hour;
		return Total_Emp_Wage;
	}
	public String toString() {
		return "Total Emp Wage For Company " + Company_Name + " is " + Total_Emp_Wage;
	}
}
