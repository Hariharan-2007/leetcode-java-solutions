class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        if(numRows==1){
            return s;
        }
        // HashMap<Integer,StringBuilder>mps = new HashMap<>();
        //     int left =-1;
        //     boolean temp = true;
        // for(int i=0;i<n;i++){
        //     if(temp){
        //         left++;
        //         StringBuilder string = mps.getOrDefault(left,new StringBuilder());
        //         string.append(s.charAt(i));

        //         mps.put(left,string);
                
        //         if(left==numRows-1){
        //             temp = false;
        //         }
                
            
        //     }else{
        //         left--;
        //         StringBuilder string = mps.getOrDefault(left,new StringBuilder());
        //         string.append(s.charAt(i));

        //         mps.put(left,string);
        //         if(left==0){
        //             temp = true;
        //         }

        //     }
        // }
        // for(int i =0;i<mps.size();i++){
        //     str.append(mps.getOrDefault(i,new StringBuilder()));
        // }
            
        // return str.toString();

        StringBuilder arr[]= new StringBuilder [numRows];
        for(int i =0;i<numRows;i++){
            arr[i]=new StringBuilder();
        }
        int left =0;
        boolean temp = true;
        for(int i =0;i<n;i++){

            arr[left]=arr[left].append(s.charAt(i));
            if(temp){
                left++;
                if(left==numRows-1){
                    temp = false;
                }
            }else{
                left--;
                if(left==0){
                    temp = true;
                }
            }
            
        }
        
        for(StringBuilder string : arr){
            str.append(string);
        }
        return str.toString();

        
    }
}