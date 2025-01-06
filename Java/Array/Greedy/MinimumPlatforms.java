package Greedy;

import java.util.Arrays;

/*
We are given two arrays that represent the arrival and departure times of trains that stop at the platform.
We need to find the minimum number of platforms needed at the railway station so that no train has to wait.

 * */
public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arr ={900,945,955,1100,1500,1800};
        int[] dep={920,1200,1130,1150,1900,2000};
        int n=arr.length;
        int totalCount=bruteCountPlatforms(n,arr,dep);
        System.out.println("Minimum number of Platforms required "+totalCount);
        totalCount=countPlatforms(n,arr,dep);
        System.out.println("Minimum number of Platforms required "+totalCount);
    }
//    we can find the overlaps by counting the trains having overlapping intervals
//    use a nested for loop to count the overlap for each iteration
    private static int bruteCountPlatforms(int n, int[] arr, int[] dep) {
        int ans = 1;
        for(int i =0; i< n; i++){
            int count = 1;
            for(int j = i+1; j<n; j++){
//                peeche(i) wala train arrives first, toh usko abhi(j) wale k ane k bad jana(dep[i]) hoga
//                  abhi wala(j) wala arrive first toh abhi wala should leave after previous arrival
                if((arr[i]<=arr[j] && arr[j]<=dep[i]) || (arr[j]<=arr[i] && arr[i]<=dep[j])){
                    count++;
                }
            }
            ans = Math.max(ans,count);

        }
        return ans;
    }
//T(c) - o(n2)

    private static int countPlatforms(int n, int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat_needed = 1;
        int res = 1;
        int incoming = 1; //represents the arriving trains
        int outgoing = 0; //represents the departing trains
        //looping inside both arr simultaneously to check
        while(incoming < n && outgoing < n ){
            if(arr[incoming] <= dep[outgoing]){
                //if the train is coming we increment platforms needed & increment the index of arriving train
                plat_needed++;
                incoming++;
            }
            else if(arr[incoming] > dep[outgoing]){
                //if train is departing we decrement platform needed & increment the index for departing trains
                plat_needed--;
                outgoing++;
            }
            if(plat_needed > res){
                res = plat_needed;
            }
        }
        return res;
    }
}
//Time complexity is (n logn) - sort and n - looping once through both arrays