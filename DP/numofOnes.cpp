{
    
    int diff = 0;;
    int close = 0;
    int prev_close = __INT_MAX;
    int ind_i , int_j;
    for(int i = 0; i< n; i++)
    { for(int j=0; j<n; j++)
     {
         
          diff = powers[i] - powers[j];
          prev_close = abs(des_res - diff);
     }
       close = min(close , prev_close); if(close < prev_close){ind_i = i; ind_j = j;}

    } int summ = powers[ind_i]+powers[ind_j];
    return summ;
     
     
}