package sortcompany;

public class Bubble {
    public  static  void  Sort( int arr[]){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if( arr[j]<arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

    }



    public  static  void  Print( int arr[]){
        for(int m=0;m< arr.length;m++){
            System.out.print(arr[m]);
        }
    }

        public static void main(String[] args) {
        int arr[]={5,4,1,3,2,4};
        Sort(arr);
        Print(arr);
    }
}
