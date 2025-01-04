package src.datastructure.arrays;

import java.util.Arrays;

public class RemoveDuplicates26 {
    public static void main(String[] args) {

        int arr[]={1,1,2};

        int count=0;
        for(int i=0;i<arr.length;i++){

        if(i<arr.length-1 && arr[i]==arr[i+1]){
            continue;
        }else{
            arr[count++]=arr[i];
        }
        }



        System.out.println(count);
    }
}
