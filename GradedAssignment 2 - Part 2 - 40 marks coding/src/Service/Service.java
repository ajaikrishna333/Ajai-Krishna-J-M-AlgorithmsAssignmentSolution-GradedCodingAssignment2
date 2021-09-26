package Service;

import java.util.Scanner;

import Sorter.MergeSort;

public class Service {

    Scanner sc = new Scanner(System.in);

    public void choice(int[] arr, int[] status) {
        int choice = 100;
        MergeSort ms = new MergeSort();

        while (choice != 0) {

            System.out.println("\n================================================================");
            System.out.println(
                    "Press 1 - Display the companies stock prices in ascending order \nPress 2 - Display the companies stock prices in descending order \nPress 3 - Display the total no of companies for which stock prices rose today\nPress 4 - Display the total no of companies for which stock prices declined today\nPress 5 - Search a specific stock price\nPress 6 - To exit");
            System.out.println("================================================================\n");
            choice = sc.nextInt();
            System.out.println("");

            switch (choice) {

                case 1:
                    ms.msort(arr, 0, arr.length - 1);
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    ms.msort(arr, 0, arr.length - 1);
                    for (int i = arr.length - 1; i >= 0; i--) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Total number of companies whose stock price rose today : ");
                    int rised = 0;
                    for (int i = 0; i < status.length; i++) {
                        if (status[i] == 1) {
                            rised++;
                        }
                    }
                    System.out.print(rised);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Total number of companies whose stock price declined today : ");
                    int declined = 0;
                    for (int i = 0; i < status.length; i++) {
                        if (status[i] == 0) {
                            declined++;
                        }
                    }
                    System.out.print(declined);
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.print("Enter the stock value : ");
                    int key = sc.nextInt();
                    int flag = 0;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == key) {
                            System.out.println("Stock values " + key + " is present");
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Stock value not present");
                    }
                    break;
                case 6:
                    choice = 0;
                    break;

            }

        }

    }

}
