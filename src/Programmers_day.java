import java.util.Scanner;

public class Programmers_day {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("13.09." + year);
        } else {
            System.out.println("12.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {


        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
