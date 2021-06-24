package org.exampledriven.config;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] array = {5,4,5,4,6,1};
        Arrays.sort(array);
        int[] finalResult = ditmemay(array, array.length);
        for(int i = 0; i < finalResult.length; i++){
            System.out.println(finalResult[i]);
        }
    }

    static int[] ditmemay (int[] arr, int n){
        int j = 0;
        int[] temp = new int[n];

        for(int i = 0; i < arr.length; i++){
            if(i < arr.length - 1 && (arr[i] == arr[i+1])){
                continue;
            }
            temp[j] = arr[i];
            j++;
        }
        return temp;
    }
}
