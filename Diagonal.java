package com.company;

public class Diagonal {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {6, 5, 4}, {8, 2, 3}};
        int rd = 0, ld = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    rd += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    ld += arr[i][j];
                }

            }
        }System.out.println(rd);
    }
}
