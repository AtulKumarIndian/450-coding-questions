package Greedy;
/*The weight of N items and their corresponding values are given.
 We have to put these items in a knapsack of weight W such that the total value obtained is maximized.
---------------------------------------------
Input: N = 3, W = 50, values[] = {100,60,120}, weight[] = {20,10,30}.
Output: 240.00
 */

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                ", weight=" + weight +
                '}';
    }

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}
class ItemComparator implements Comparator<Item>{
    @Override
    public int compare(Item a, Item b) {
        //take out ratio of value/wt. as we have to increase value over weight.
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);
        return Double.compare(r2, r1);
    }
}
public class FractionalKnapsack {
    public static void main(String[] args) {
        int n = 3, weight = 50;
        Item[] arr = {new Item (100,20),new Item(60,10),new Item(120,30)};
        double ans = fractionalKnapsack(weight, arr, n);
        System.out.println(ans);
    }

    private static double fractionalKnapsack(int weight, Item[] arr, int n) {
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new ItemComparator());
        System.out.println(Arrays.toString(arr));

        //sorted h toh dalte jaiye apne answer m aur jab weight limit khtm hojaye to bahar aajaiye
        int curWeight = 0;
        double finalVal = 0.0;
        for(int i=0; i < n; i++){
            if(arr[i].weight+curWeight >= weight){
                curWeight+=arr[i].weight;
                finalVal+=arr[i].value;
            }
            else {
                //what is the remaining weight left?
                int remain = weight - curWeight;
                finalVal += ((double)arr[i].value / (double)arr[i].weight) * (double)remain;
                break;

            }
        }
        return finalVal;
    }
}
