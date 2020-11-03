public interface IComputeEmpWage {

	public void Add_Company_Emp_Wage(String Company_name, int Emp_Rate_Per_Hour, int Emp_Number_Of_Working_Days,
			int Max_Hours_Per_Month);

	public void Compute_Emp_Wage();

}
