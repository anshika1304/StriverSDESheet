// https://bit.ly/3I7fNXn

/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/


import java.util.*;
public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
            double profit=0;
            Arrays.sort(items, (a,b)->Double.compare(((double)a.value/a.weight), ((double)b.value/b.weight)));
        for(int i=items.length-1; i>=0; i--){
            if(items[i].weight<=w){
                w -= items[i].weight;
                profit += items[i].value;
            }
            else{
                profit += ((double)items[i].value/items[i].weight)*w;
                break;
            }
        }
        return profit;
    }
}
