package arraypackage.Arry;

public class leaderElement {

    static void leading(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        int arr2[]=new int[arr.length];
int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
                System.out.println(arr[i]);
                arr2[j++]=arr[i];
            }
        }
        System.out.println("----------------");
        for( j=j -1;j>=0;j--)
        {
            System.out.println(arr2[j]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,27,6,1,24,3,4};

        leading(arr);
//        for(int i=0;i<arr.length;i++)
//        {     int cur=arr[i];
//           for(int j=i+1;j<arr.length;j++)
//           {
//               if(arr[j]>cur)
//               {
//                   break;
//               }
//               System.out.print(cur);
//           }
//        }



    }

}
