import java.util.HashMap;
import java.util.Map;

class Solution{
public int[] twoSum(int[] numbers, int target){
    int result[] = new int[2];
    Map<Integer, Integer>map = new HashMap<Integer, Integer>();     // key = elements and Value = indices or Pos of elements in given array.
    for(int i = 0; i<numbers.length; i++){
        if(map.containsKey(target - numbers[i])){
            result[1]= i;
            result[0]= map.get(target- numbers[i]);    //map.get(key)    
            return result;
        }
        map.put(numbers[i], i);    // map.put(key, value)
    }
    return result;
}
}

