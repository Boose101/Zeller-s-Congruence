import java.util.Scanner;
public class Zcon {
    public static Scanner scan = new Scanner(System.in);
    public static String days[] = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        System.out.println();
        System.out.print("Enter the month(1-12): ");
        int month = scan.nextInt();
        System.out.println();
        System.out.print("Enter the day(1-31): ");
        int day = scan.nextInt();

        int mothz = month;
        int yearz = year;
        if(month >= 2){
            mothz += 12;
            yearz -= 1;
        }
        int yearoc = yearz % 100;
        int zbc = (yearz / 100);

        int h;

        h = (day + ((13*(mothz+1))/5) + yearoc + (yearoc/4) + (zbc/4)+ (5*zbc)) % 7;

        System.out.println("Day of the week is " + days[h]);


    }
}
