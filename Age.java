package skill4;
import java.util.Scanner;
import java.util.Calendar;

public class Age {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int date, month, year;
        date = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        Calendar c = Calendar.getInstance();
        int cdate = c.get(Calendar.DAY_OF_MONTH);
        int cmonth = c.get(Calendar.MONTH) + 1; // 0-based
        int cyear = c.get(Calendar.YEAR);

        int age = cyear - year;
        if (month > cmonth || (month == cmonth && date > cdate)) {
            age--;
        }

        System.out.print(age);
    }
}
