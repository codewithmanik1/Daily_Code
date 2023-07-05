
//Sort 0s and 1s 

import java.io.*;
import java.util.*;
import java.util.Random;


class Demo {

    static void printArray(int arr[]){
        int size = arr.length;

        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Main Problem
    static int[] sortZeroAndOne(int[] arr) {
        
        int size = arr.length;
        
        //3 pointers 
        int i = 0;
        int start = 0;
        int end = size-1;

        while(start < end){
            if(arr[i] == 0){
                arr[start] = arr[i];
                i++;
                start++;
            }else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
        }
    }
    return arr;
}

    static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(2); // Generates a random positive number
        }
        System.out.println("Array is Created !!!");
        return arr;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array");
        int size = Integer.parseInt(br.readLine());

        //call gernerate ramdom array
        int[] arr = generateRandomArray(size);
        //printArray before sorted
        System.out.println("Unsorted Array");
        printArray(arr);

        
        //call function for sorting array
        int ans[] = sortZeroAndOne(arr);

        //print sort array
        System.out.println("sorted Array");
        printArray(ans);
    }
    
}