package sortcompany;

import java.security.PublicKey;

public class InsertionSort {
public  static  void Insertion(int arr[]){
    for(int i=1;i<arr.length;i++){
        int prev=i-1;
        int curr=arr[i];
        while (prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;

        }
        arr[prev+1]=curr;
    }
    for(int i=0;i< arr.length;i++){
        System.out.print(arr[i]);
    }
}
        public static void main(String[] agrs){
int arr[]={5,9,1,2,4};
Insertion(arr);
        }
    }

