
// Iterative C++ program to reverse an array
#include <bits/stdc++.h>
using namespace std;
 
void roatate(int arr[], int n)
{
    int temp = arr[n-1];
    for(int i=n ; i>=0; i--)
       {
           arr[i+1]= arr[i];
       } arr[0]= temp;
}  


void printArray(int arr[], int size)
{
   for (int i = 0; i < size; i++)
   cout << arr[i] << " ";
 
   cout << endl;
}
 

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6};
     
    int n = sizeof(arr) / sizeof(arr[0]);
 
    cout<<n;
    printArray(arr, n);
     
  
     roatate( arr,  n);

    printArray(arr, n);
     
    return 0;
}