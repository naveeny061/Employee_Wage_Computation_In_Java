import java.util.Random;
public class Daily_Full_Time_Wage{
	int Working_Hours=0;
	int Total_Days=0;
	int Total_Wage=0;
	void Show_Wages(int x,int y,int z){
		Random random=new Random();
		switch(random.nextInt(2)){
                	case 0:
			while(Total_Days<y && Working_Hours<z ){
				Total_Days++;
				Working_Hours+=8;
				Total_Wage+=(x*8);
			}
			System.out.println("Total Day="+Total_Days+" Total Working Hours"+Working_Hours);
			System.out.println("Full Time Employee Total Wage ="+Total_Wage);
			break;
			case 1:
			while(Total_Days<y && Working_Hours<z ){
                                Total_Days++;
                                Working_Hours+=4;
				Total_Wage+=(x*4);
			}
			System.out.println("Total Day="+Total_Days+" Total Working Hours"+Working_Hours);
			System.out.println("Part Time Employee Total Wage ="+Total_Wage);
		}
	}
}

