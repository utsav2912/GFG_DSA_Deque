// Rest of the code is already given in driver code

class Solution
{
    public static ArrayDeque<Integer> deque_Init(int arr[], int n)
    {
        ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
        for(int i=0;i<n;i++)
        {
            dq.add(arr[i]);
        }
        return dq;
    }
}