#include <bits/stdc++.h>
using namespace std;
void rearrange(int arr[], int n)
{
    int j=0;
    for(int i=0; i<n; i++)
    { if(arr[i]<0){
           if(i != j)
     { 
         swap(arr[i],arr[j]);
         j++;
     }
    }
     }
}
void printArray(int arr[], int size)
{
   for (int i = 0; i < size; i++)
   cout << arr[i] << " ";
 
   cout << endl;
}
int main()
{  int arr[] = {1,-1,2,3,-5};
   int size= sizeof(arr)/sizeof(arr[0]);
   printArray(arr, size);
   rearrange(arr, size);
    printArray(arr, size);

    return 0;
}