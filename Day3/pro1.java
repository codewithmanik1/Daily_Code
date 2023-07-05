

//left rotate an array by one element 
//i/p : [1, 2, 3, 4, 5]
//o/p : [2, 3, 4, 5, 1]


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
    static int[] rotateArrByOneEle(int[] arr) {
        int size = arr.length;

        for(int i=0; i<size-1; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

    return arr;
    }

    static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size); // Generates a random positive number
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
        System.out.println("Generate Array");
        printArray(arr);

        
        //call function 
        int ans[] = rotateArrByOneEle(arr);

        //print rotate array by one
        System.out.println("rotate array by one");
        printArray(ans);
    }
    
}