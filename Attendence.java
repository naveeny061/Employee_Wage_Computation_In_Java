import java.util.Random;
public class Attendence{
		Random random=new Random();
		void calculate_attendence(){
                int attendence=random.nextInt(2);
                if(attendence==0)
                System.out.println("present");
                else
                System.out.println("absent");
		}
}
