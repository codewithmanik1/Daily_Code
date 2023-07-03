
// reverse Array in Array

#include<iostream>


void printArray(int arr[], int size){

    std::cout << "print Array" << std::endl;
    for(int i=0; i<size; i++){
        std::cout << arr[i] << " " << std::endl; 
    }
}

void revArray(int arr[], int size){

    int start = 0;
    int end = size-1;
    while(start<=end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

        start++;
        end--; 
    }
    printArray(arr,size);
}

int main(){
    std::cout<<"reverse array" <<std::endl;
    int size;
    std::cout<<"Enter the size of array" <<std::endl;
    std::cin>>size;

    int arr[size];

    for(int i=0; i<size; i++)
        std::cin>>arr[i];

    revArray(arr,size);
    return 0;
}