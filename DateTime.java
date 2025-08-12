package skill4;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter format: ");
        String f = sc.nextLine();

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(f);

        System.out.println(sdf.format(d));
    }
}
