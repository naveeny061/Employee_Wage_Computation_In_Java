import java.util.Random;
public class Company_Emp_Wages {
	String Company_Name;
	int Emp_Rate_Per_Hour;
	int Emp_Number_Of_Working_Days;
	int Max_Hours_Per_Month;
	int Total_Emp_Wage;
	public Company_Emp_Wages(String Company_name, int Emp_Rate_Per_Hour, int Emp_Number_Of_Working_Days,
			int Max_Hours_Per_Month) {
		this.Company_Name=Company_name;
		this.Emp_Rate_Per_Hour = Emp_Rate_Per_Hour;
		this.Emp_Number_Of_Working_Days = Emp_Number_Of_Working_Days;
		this.Max_Hours_Per_Month = Max_Hours_Per_Month;
		Total_Emp_Wage=0;
	}
	public void Set_Total_Emp_Wage(int Total_Emp_Wage) {
		this.Total_Emp_Wage=Total_Emp_Wage;
	}
	public String toString() {
		return "Total Emp Wage For Company " + Company_Name + " is " + Total_Emp_Wage;
	}
}
