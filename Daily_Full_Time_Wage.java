import java.util.Random;
public class Daily_Full_Time_Wage{
	int Wage_Per_Hour=20;
	int Full_Day_Hours=8;
	int Part_Time_Hours=4;
	int Daily_Wage_Full=Wage_Per_Hour*Full_Day_Hours;
	int Daily_Wage_Part_Time=Wage_Per_Hour*Part_Time_Hours;
	int Total_Wage=0;
	int Total_Days=0;
	int Working_Hours=0;
	Random random=new Random();
	void Show_Wages(){
		switch(random.nextInt(2)){
                	case 0:
			while(Total_Days<20 && Working_Hours<100 ){
				Total_Days++;
				Working_Hours+=8;
				Total_Wage+=Daily_Wage_Full;
			}
			System.out.println("Total Day="+Total_Days+" Total Working Hours"+Working_Hours);
			System.out.println("Full Time Employee Total Wage ="+Total_Wage);
			break;
			case 1:
			while(Total_Days<20 && Working_Hours<100 ){
                                Total_Days++;
                                Working_Hours+=4;
				Total_Wage+=Daily_Wage_Part_Time;
			}
			System.out.println("Total Day="+Total_Days+" Total Working Hours"+Working_Hours);
			System.out.println("Part Time Employee Total Wage ="+Total_Wage);
		}
	}
}

