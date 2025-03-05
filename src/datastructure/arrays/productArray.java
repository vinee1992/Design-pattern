package src.datastructure.arrays;

import java.util.Arrays;

public class productArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        int[] res = product(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] product(int[] arr) {
        int[] op= new int[arr.length];
        int prod=1;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(i==j){
                    continue;
                }
                prod=prod*arr[j];
            }
            op[i]=prod;
            prod=1;
        }

        return op;
    }
}
