
// extreamPrintArray n Array

#include<iostream>


void printArray(int arr[], int size){

    std::cout << "print Array" << std::endl;
    for(int i=0; i<size; i++){
        std::cout << arr[i] << " " ; 
    }
}

void extreamPrintArray(int arr[], int size){

    int start = 0;
    int end = size-1;

    while(start <= end){
        if(start == end){
            std::cout << arr[start] << " "; 
            break;
        }else{
            std::cout << arr[start] << " ";
            std::cout << arr[end] << " ";

            start++;
            end--;
        } 
    }
    std::cout<<std::endl;
    printArray(arr,size);
}

int main(){
    std::cout<<"Extream print  array" <<std::endl;
    int size;
    std::cout<<"Enter the size of array" <<std::endl;
    std::cin>>size;

    int arr[size];

    std::cout<<"Enter the element" <<std::endl;
    for(int i=0; i<size; i++)
        std::cin>>arr[i];

    extreamPrintArray(arr,size);
    return 0;
}