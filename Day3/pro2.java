

/*problem statment : Majority element 
Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

Input : A[] = {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element
Explanation: There is no element whose frequency is greater than the half of the size of the array size.*/

import java.io.*;
import java.util.*;
import java.util.Random;


class Demo {

    static int[] createArray(int size)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[] = new int[size];
        System.out.println("Enter the element in array");

        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Array created!!!!");
        return arr;
    }

    static void printArray(int arr[]){
        int size = arr.length;

        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void getCount(int arr[], int ans){
        int size = arr.length;

        int count = 0;
        for(int i=0; i<size; i++){
            if(ans==arr[i])
            count++;
        }
        System.out.println(count);
    }
    
    // Main Problem
    static int majorityEle(int[] arr) {
        int size = arr.length;

        int limit = size/2;

        int finalmax = 1;
        int ans = -1;

        for(int i=0; i<size; i++){
            int max = 1;
            for(int j=i+1; j<size; j++){
                if(arr[i] == arr[j]){
                    max++;
                }
                if(max >= finalmax){
                    finalmax = max;
                    ans = arr[i];
                }
            }
            if((i >= limit+1) && (finalmax <= limit/2)){
                return -1;
            }
        }
        if(finalmax > limit)
            return ans;
        else
            return -1;
    }

    // static int[] generateRandomArray(int size) {
    //     Random random = new Random();
    //     int[] arr = new int[size];

    //     for (int i = 0; i < size; i++) {
    //         arr[i] = random.nextInt(size); // Generates a random positive number
    //     }
    //     System.out.println("Array is Created !!!");
    //     return arr;
    // }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array");
        int size = Integer.parseInt(br.readLine());

        //create Array by us
        int arr[] = createArray(size);

        // //call gernerate ramdom array
        // int[] arr = generateRandomArray(size);
        // System.out.println("Generate Array");
        // printArray(arr);
        // System.out.println("Size of array is "+size);

        
        //call function 
        int ans = majorityEle(arr);

        //majority element 
        System.out.println("majority element in array is "+ans);

        //for checking only : get count of ans var
        getCount(arr,ans);
    }
    
}