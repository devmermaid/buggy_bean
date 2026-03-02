package Basic.numbers;

public class its8
{
    static void main() {
        int year=2000;
        if((year%4==0 && year%100 !=0)||(year%400==0))// 4 days time we skip every year, so after 100 years we remove one day and after eveyr 400 years we add one day back so
        {
            System.out.println("leap year");
        }
        else {
            System.out.println("not");
        }
    }
}
