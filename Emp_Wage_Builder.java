import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Emp_Wage_Builder implements IComputeEmpWage {
	int Part_Time = 0;
	int Full_Time = 1;
	private int Number_Of_Company = 0;
	private ArrayList<Company_Emp_Wages> company_Emp_Wage_List;
	private Map<String, Company_Emp_Wages> company_Emp_Wage_Map;

	Emp_Wage_Builder() {
		company_Emp_Wage_List = new ArrayList();
		company_Emp_Wage_Map = new HashMap();
	}

	public void Add_Company_Emp_Wage(String Company_name, int Emp_Rate_Per_Hour, int Emp_Number_Of_Working_Days,
			int Max_Hours_Per_Month) {
		Company_Emp_Wages company_Emp_Wage = new Company_Emp_Wages(Company_name, Emp_Rate_Per_Hour,
				Emp_Number_Of_Working_Days, Max_Hours_Per_Month);
		company_Emp_Wage_List.add(company_Emp_Wage);
		company_Emp_Wage_Map.put(Company_name, company_Emp_Wage);
	}

	public void Compute_Emp_Wage() {
		for (int i = 0; i < company_Emp_Wage_List.size(); i++) {
			Company_Emp_Wages company_Emp_Wage = company_Emp_Wage_List.get(i);
			company_Emp_Wage.Set_Total_Emp_Wage(this.Compute_Emp_Wage(company_Emp_Wage));
			System.out.println(company_Emp_Wage);
		}

	}

	public int Get_Total_Wage(String Company) {
		return company_Emp_Wage_Map.get(Company).Total_Emp_Wage;
	}

	private int Compute_Emp_Wage(Company_Emp_Wages company_Emp_Wage) {
		int Emp_Hours = 0;
		int Total_Emp_Hours = 0;
		int Total_Working_Days = 0;
		int Daily_Wage = 0;
		while (Total_Emp_Hours <= company_Emp_Wage.Max_Hours_Per_Month
				&& Total_Working_Days < company_Emp_Wage.Emp_Number_Of_Working_Days) {
			Total_Working_Days++;
			Random r1 = new Random();
			int Emp_Check = r1.nextInt(2);
			switch (Emp_Check) {
			case 0:
				Emp_Hours = 4;
				Daily_Wage = company_Emp_Wage.Emp_Rate_Per_Hour * 4;
				break;
			case 1:
				Emp_Hours = 8;
				Daily_Wage = company_Emp_Wage.Emp_Rate_Per_Hour * 8;
				break;
			default:
				Emp_Hours = 0;
			}

			Total_Emp_Hours += Emp_Hours;
			System.out.println(
					"Days=" + Total_Working_Days + "Emp Hours=" + Total_Emp_Hours + "Daily Wage=" + Daily_Wage);
		}
		company_Emp_Wage.Total_Emp_Wage = Total_Emp_Hours * company_Emp_Wage.Emp_Rate_Per_Hour;
		return company_Emp_Wage.Total_Emp_Wage;
	}

	public static void main(String arg[]) {
		IComputeEmpWage obj1 = new Emp_Wage_Builder();
		Scanner sc = new Scanner(System.in);
		String Company_Name;
		int Emp_Rate_Per_Hour;
		int Emp_Number_Of_Working_Days;
		int Max_Hours_Per_Month;
		while (true) {
			System.out.println("Enter Company Name ");
			Company_Name = sc.next();
			System.out.println("Enter Employee Rate Per Hour ");
			Emp_Rate_Per_Hour = sc.nextInt();
			System.out.println("Enter Number Of Working Days ");
			Emp_Number_Of_Working_Days = sc.nextInt();
			System.out.println("Enter Max Hours Per Month ");
			Max_Hours_Per_Month = sc.nextInt();
			obj1.Add_Company_Emp_Wage(Company_Name, Emp_Rate_Per_Hour, Emp_Number_Of_Working_Days, Max_Hours_Per_Month);
			obj1.Compute_Emp_Wage();
			System.out.println("Company Name--" + Company_Name + "  Total Wage--" + obj1.Get_Total_Wage(Company_Name));
			System.out.println("Want to add more companies Press:1 else Press:0 ");
			int choice = sc.nextInt();
			if (choice == 0)
				break;
		}
	}
}
