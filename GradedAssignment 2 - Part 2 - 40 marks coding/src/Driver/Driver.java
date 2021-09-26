package Driver;

import java.util.Scanner;

import Service.Service;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        Service s = new Service();

        System.out.println("\n************************************************");
        System.out.println("Welcome to the STOCKERS Inc Dashboard");
        System.out.println("************************************************\n");

        System.out.println("Enter the number of companies : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] status = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter current stock price of the company " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            System.out.println("Whether company's stock price rose today compare to yesterday ? (true/false)");
            String stock = sc.next();
            if (stock.equals("true")) {
                status[i] = 1;
            } else if (stock.equals("false")) {
                status[i] = 0;
            }
        }

        s.choice(arr, status);

        sc.close();

    }
}
