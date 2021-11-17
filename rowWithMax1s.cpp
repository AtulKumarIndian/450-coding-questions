#include<bits/stdc++.h>
class Solution{
public:
	int rowWithMax1s(vector<vector<int> > arr, int n, int m) {
	    // code here
	    int k =0 ; int row_i;
	    for(int i = 0; i< n; i++)
	    {    int count =0;
	        for(int j=0; j<m; j++)
	        {
	            if(arr[i][j] == 1) count++;
	            
	        } int pre_k = k; k = max(k, count); if(pre_k != k) row_i = i;
	    } if (!k) return -1; else return row_i;
	}

};
