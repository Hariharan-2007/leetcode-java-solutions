class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String>list = new ArrayList<>();
        int n = words.length;
        int left =0;
        while(left<n){
            int right = left;
            int letters =0;
            while(right<n && letters+words[right].length()+(right-left)<=maxWidth){
                letters+=words[right].length();
                right++;

            }
            StringBuilder str = new StringBuilder();
            
            int gaps = right -left -1;
            if(right==n||gaps ==0){
                for(int i = left;i<right;i++){
                    str.append(words[i]);
                    if(i!=right-1){
                        str.append(" ");
                    }
                }
            while(str.length()<maxWidth){
                str.append(" ");

            }
            }else{
                int total = maxWidth - letters;
                int space = total/gaps;
                int extra = total % gaps;
                for(int i=left;i<right;i++){
                    str.append(words[i]);
                    if(i!=right-1){
                        for(int j =0;j<space;j++){
                            str.append(" ");
                        }
                    if(extra>0){
                        str.append(" ");
                        extra--;
                    }
                    }
                }
            }
            
            list.add(str.toString());
            left = right;



        }
        return list;
    }
}