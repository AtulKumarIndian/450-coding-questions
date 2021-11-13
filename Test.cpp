int dist[k];
for(int i=0; i<k; k++){
    for (int i = 0; i < edge.size(); i++)
  { if(edge[i][1] == edge[i+1][0]) {dist[k]++;}

  }
    
}
//max distance in array;
int max; 
for (int j = 0; j<k; j++)
    if( max < dist[j])  max = dist[j];
   
// change thes indices into binary 1 and remaining to 0
for (int i = 0; i<k; i++){
   if( max == dist[i];)
           dist[i]= 1;
 else dist[i]= 0;
}
 
return dist;
  
