package com.company;

public class RichestMAn {
    public static void main(String[] args) {
//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.


// varableargument

        //final keyword
      //  only declear one time

      //  final int RATE_OF_INTEREST =6.3;

      //  varible became constant
      //  class not inherit
        // method not override

        int arr[][]={ {1,2,3},{3,2,1}};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                 sum=i+j;
                if(sum<=3)
                {
                    sum=sum+arr[i][j];
                   // System.out.print();
                }

            }
            System.out.print(sum+" ");
        }
    }
}
