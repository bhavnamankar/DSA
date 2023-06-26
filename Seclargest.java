package arraypackage.Arry;

public class Seclargest {
    public static void main(String[] args) {
        int arr[]={34,162,12,98,45,173};
        int max=arr[0];
        int secmax=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            { secmax=max;
                max=arr[i];
            }
            else if(secmax<arr[i])
            {
                secmax=arr[i];
            }
        }
        System.out.println("second max  "+secmax);
        System.out.println(" first max  "+max);
    }
}
