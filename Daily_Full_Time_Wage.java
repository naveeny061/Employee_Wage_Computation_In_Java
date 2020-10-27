public class Daily_Full_Time_Wage{
	int Wage_Per_Hour=20;
	int Full_Day_Hours=8;
	int Part_Time_Hours=4;
	int Daily_Wage_Full=Wage_Per_Hour*Full_Day_Hours;
	int Daily_Wage_Part_Time=Wage_Per_Hour*Part_Time_Hours;
	void Show_Wages(){
		System.out.println("Daily employee wage for full time ="+Daily_Wage_Full);
		System.out.println("Daily employee Wage for Part time ="+Daily_Wage_Part_Time);
		}
}
