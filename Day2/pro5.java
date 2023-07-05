
//Triplet sum


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

    static void printAns(int arr[]){
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
    }
    
    // Main Problem
    static int[] tripletSum(int[] nums, int target) {
        
        int size = nums.length;
        int[] ans = new int[3];

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                for(int k = j+1; k<size; k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                        ans[0] = nums[i];
                        ans[1] = nums[j];
                        ans[2] = nums[k];
                        return ans; 
                }
            }
        }
    }
    return new int[0];
}

    static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size) + 1; // Generates a random positive number
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
        //printArray
        printArray(arr);

        //get target
        System.out.println("Enter Target");
        int target = Integer.parseInt(br.readLine());

        //call two sum
        int ans[] = tripletSum(arr,target);

        //printArray
        printAns(ans);
    }
    
}