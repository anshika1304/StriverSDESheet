// https://bit.ly/3nquVHj

public class Solution
{
public static int findMinimumCoins(int amount)
    {
        int[] arr={1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int i=arr.length-1;
    int count=0;
    while(amount>0){
        if(arr[i]<=amount){
            count++;
            amount -= arr[i];
        }
        else{
            i--;
        }
    }
    return count;
    }
}
