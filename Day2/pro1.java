import java.util.*;
import java.io.*;


// Find unique element in ArrayList every element twice in array except one

class Demo{

    static int uniqueEle(ArrayList<Integer>arr, int size){
        int ele = 0;

        for(int i=0; i<size; i++){
            ele = arr.get(i)^ele;
        }
        return ele;
    }

    public static void main(String[] args)throws IOException {
        System.out.println("Enter the size of array");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        //declared arralist
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        int ans = uniqueEle(arr,n);
        System.out.println("Unique element in array is  "+ ans);
    }
}