package com.company;

import java.util.Scanner;

public class CodeNest2DArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[][]=new int[4][3];
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("company "+ (i+1));
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i< arr.length;i++)
        {
            System.out.println("EMPLOYEES Of THE "+(i+1)+" COMPANY");
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println(" salary of the employees is "+(j+1) + " " +arr[i][j]);
            }
        }
    }
}
