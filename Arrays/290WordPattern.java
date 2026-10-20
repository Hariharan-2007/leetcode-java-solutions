// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         HashMap<Character,String>mps1 = new HashMap<>();
//         HashMap<String,Character>mps2 = new HashMap<>();
//         String words[]= s.split(" ");
//         if(pattern.length()!=words.length){
//             return false;
//         }
//         for(int i =0;i<pattern.length();i++){
//             String word =words[i];
//             char ch = pattern.charAt(i);

//             if(mps1.containsKey(ch)){
//                 if(!mps1.get(ch).equals(word)){
//                     return false;
//                 }
//             }else{
//                 mps1.put(ch,word);
//             }
//             if(mps2.containsKey(word)){
//                 if(mps2.get(word)!=ch){
//                     return false;
//                 }
//             }else{
//                 mps2.put(word,ch);
//             }
//         }
//         return true;
        
//     }
// }
class Solution {
    
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map1 = new HashMap<>();
        HashMap<String,Character>map2 = new HashMap<>();
        String words[]=s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String str= words[i];
            if(map1.containsKey(c)){
                if(!map1.get(c).equals(str)){

                return false;
                }
            }else{
                map1.put(c,str);
            }
            if(map2.containsKey(str)){
                if(map2.get(str)!=c){

                return false;
                }
            }else{
                map2.put(str,c);
            }

        }
        return true;

    }
}