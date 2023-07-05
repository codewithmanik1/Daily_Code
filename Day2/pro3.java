

//Intersaction Arrays - get common elements 

import java.io.*;
import java.util.*;

class Demo{
    
    static void printArray(ArrayList<Integer> arr){

        int size = arr.size();

        for(int i=0; i<size; i++){
            System.out.print(arr.get(i) + " ");
        }
    }

    static ArrayList<Integer> intersactionArray(int arr1[], int s1, int arr2[], int s2){
        // int start1 = 0;
        // int start2 = 0;

        // int size = s1+s2;

        ArrayList<Integer> arr = new ArrayList<Integer>(1);
        //int[] arr = new int[size];
        for(int i=0; i<s1; i++){
            for(int j=0; j<s2; j++){
                if(arr1[i] == arr2[j]){
                    arr.add(arr1[i]);
                }
            }
        }
        
        return arr;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of 1st array");
        int s1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[s1];
        System.out.println("Enter the elements for 1st Array");
        for(int i=0; i<s1; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the size of 2nd array");
        int s2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[s2];
        System.out.println("Enter the elements for 2nd Array");
        for(int i=0; i<s2; i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }

        //call function
        ArrayList<Integer> ans = intersactionArray(arr1,s1,arr2,s2);

        //printArray
        printArray(ans);
    }
}