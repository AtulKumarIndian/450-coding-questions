#include <bits/stdc++.h>
using namespace std;
struct MinMaxArray
   {
       int min,max;
   };

 MinMaxArray Getminmax(int arr[], int n)
{ int j;
   MinMaxArray MinMax;
   if (n==1)
   {
      MinMax.max = MinMax.min = arr[0];
      return MinMax;
    
   }
  
    if(arr[0]> arr[1])
     {
        MinMax.max= arr[0];
        MinMax.min= arr[1];
        
    }
    else{
        MinMax.max= arr[1];
        MinMax.min= arr[0];
    }
   for( j=2;j<n;j++){
        if(arr[j]>MinMax.max)
             {MinMax.max= arr[j];
             cout<<arr[j];}
        else if(arr[j]<MinMax.min)
           { MinMax.min=arr[j];}
        
      

    }  return MinMax;
}
int main()
{
    int arr[] = { 1000, 10000, 445, 2, 330, 3000 };
    int arr_size = 6;
     
     MinMaxArray minmax = Getminmax(arr, arr_size);
     
    cout << "Minimum element is "
         << minmax.min << endl;
    cout << "Maximum element is "
         << minmax.max;
          
    return 0;
}