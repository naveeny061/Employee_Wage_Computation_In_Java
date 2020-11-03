import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
		int Daily_Wage=0;
		while (Total_Emp_Hours <= company_Emp_Wage.Max_Hours_Per_Month
				&& Total_Working_Days < company_Emp_Wage.Emp_Number_Of_Working_Days) {
			Total_Working_Days++;
			Random r1 = new Random();
			int Emp_Check = r1.nextInt(2);
			switch (Emp_Check) {
			case 0:
				Emp_Hours = 4;
				Daily_Wage=company_Emp_Wage.Emp_Rate_Per_Hour*4;
				break;
			case 1:
				Emp_Hours = 8;
				Daily_Wage=company_Emp_Wage.Emp_Rate_Per_Hour*8;
				break;
			default:
				Emp_Hours = 0;
			}

			Total_Emp_Hours += Emp_Hours;
			System.out.println("Days=" + Total_Working_Days + "Emp Hours=" + Total_Emp_Hours+"Daily Wage="+Daily_Wage);
		}
		company_Emp_Wage.Total_Emp_Wage = Total_Emp_Hours * company_Emp_Wage.Emp_Rate_Per_Hour;
		return company_Emp_Wage.Total_Emp_Wage;
	}

	public static void main(String arg[]) {
		IComputeEmpWage obj1 = new Emp_Wage_Builder();
		obj1.Add_Company_Emp_Wage("Nike", 100, 20, 120);
		obj1.Add_Company_Emp_Wage("Rebook", 120, 18, 80);
		obj1.Compute_Emp_Wage();
		System.out.println("totalwage Nike" + obj1.Get_Total_Wage("Nike"));
		System.out.println("totalwage Rebook" + obj1.Get_Total_Wage("Rebook"));
	}

}
