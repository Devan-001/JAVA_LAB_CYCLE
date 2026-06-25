import java.util.Scanner;

public class Lab_cycle_QNO_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Salary: ");
        double basic = sc.nextDouble();

        double da = basic * 0.10;
        double hra = basic * 0.15;
        double gross = basic + da + hra;

        System.out.println("DA = " + (int) da);
        System.out.println("HRA = " + (int) hra);
        System.out.println("Gross Salary = " + (int) gross);

        sc.close();
    }
}