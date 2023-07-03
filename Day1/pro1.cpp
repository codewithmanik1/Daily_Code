
// coutnZeroAndOne in Array

#include<iostream>

void coutnZeroAndOne(int arr[], int size){
    int cntZero = 0;
    int cntOne = 0;

    for(int i=0; i<size; i++){
        if(arr[i] == 0)
            cntZero++;
        else
            cntOne++;
    }
    std::cout<< "0 = " << cntZero <<std::endl;
    std::cout<< "1 = " << cntOne <<std::endl;
}

int main(){
    int size;
    std::cout<<"Enter the size of array" <<std::endl;
    std::cin>>size;

    int arr[size];

    for(int i=0; i<size; i++)
        std::cin>>arr[i];

    coutnZeroAndOne(arr,size);
    return 0;
}