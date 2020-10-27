import java.util.Random;
public class Daily_Full_Time_Wage{
	int Wage_Per_Hour=20;
	int Full_Day_Hours=8;
	int Part_Time_Hours=4;
	int Daily_Wage_Full=Wage_Per_Hour*Full_Day_Hours;
	int Daily_Wage_Part_Time=Wage_Per_Hour*Part_Time_Hours;
	Random random=new Random();
	void Show_Wages(){
		switch(random.nextInt(2)){
                	case 0:
			System.out.println("Daily employee wage for full time ="+Daily_Wage_Full);
			break;
			case 1:
                	System.out.println("Daily employee Wage for Part time ="+Daily_Wage_Part_Time);

		}
	}
}

