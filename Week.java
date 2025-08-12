package skill4;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String s = sc.nextLine();

        LocalDate d = LocalDate.parse(s);
        DayOfWeek day = d.getDayOfWeek();

        System.out.println("Day of week: " + day);
    }
}
