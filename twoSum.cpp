#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;
 int main() {
    /*Two sum - Return indices of two number in the given array such that they add up to target.
    unsorted array.
    1st solution is to have (On2) - BruteForce
    2nd Solution is HashTable 
    internally implemented as hash table , search, insert, deleted (O(1)) 
    its time complexity can go from O(1) to O(n2), especially for big prime numbers.
   */
    return 0;
}
vector<int> twoSum(vector<int>& nums, int target)
    {
        vector<int> ans;
        unordered_map<int,int> mpp;   
        for(int i =0; i<nums.size(); i++)
        {
            if(mpp.find(target- nums[i]) != mpp.end()){
                ans.push_back(mpp[target - nums[i]]);
                ans.push_back(i);
                return ans;
            }
            mpp[nums[i]] = i;

        }
        return ans;
    }