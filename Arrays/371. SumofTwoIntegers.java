class Solution {
    public int getSum(int a, int b) {
        int result =a^b;
        int temp = a&b;
        if(temp==0){
            return result;
        }
        while(temp!=0){
            
                temp=temp<<1;
                int next = result&temp;
                result=result^temp;
                temp= next;
            
        }
        return result;
    }
}