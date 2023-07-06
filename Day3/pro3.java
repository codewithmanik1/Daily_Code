

/* Best Time to Buy and Sell Stock
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

Input:  prices = [7,1,5,3,6,4]
Output: 5

Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/


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
    
    // Main Problem
    static int buyAndSellStock(int[] arr) {
        int size = arr.length;


        //Approch - 1  : O(n^2);

        // int finalmax = 0;
        // for(int i=0; i<size; i++){

        //     for(int j=i+1; j<size; j++){

        //         if(arr[j] - arr[i] >= finalmax){
        //             finalmax = arr[j] - arr[i];
        //         }
        //     }
        // }
        // if(finalmax <= 0){
        //     return 0;
        // }else{
        //     return finalmax;
        // }

        // prefred approch - 2 : time complexity : O(n) using extra space : O(n)
        int extraArr[] = new int[size];

        int next = arr[size-1];

        for(int i=size-1; i>=0; i--){
            int ele = arr[i];
            if(ele >= next){
                extraArr[i] = ele;
                next = ele;
            }else{
                extraArr[i] = next;
            }
        }

        printArray(extraArr);

        int ans = 0;
        for(int j=0; j<size; j++){
            if(extraArr[j] - arr[j] >= ans)
                ans = extraArr[j] - arr[j];
        }

        //Approch 3 : time complexity O(n) , space complexity O(1)

        // int min = arr[0] ;
        // int max = arr[0];

        // for(int i = 0; i<size; i++){
        //     if(arr[i] < min){
        //         min = arr[i];
        //         max = 0;
        //     }else{
        //         if(arr[i] > max){
        //             max = arr[i];
        //         }
        //     }
        // }

        // int ans = max - min;
        // if(ans <=0)
        //     return 0;
        // else
        //     return ans;
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
        printArray(arr);

        
        //call function 
        int ans = buyAndSellStock(arr);

        System.out.println("The profit is "+ ans); 
    }
    
}