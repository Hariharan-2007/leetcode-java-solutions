class Solution {
    public int maximumPopulation(int[][] logs) {
        

        int year[]= new int[101];
        
        for(int log[]:logs){
            int birth = log[0];
            int death = log[1];

            year[birth - 1950]++;
            year[death - 1950]--;
        }

        int maxpopulation =0;
        int current =0;
        int earliestyear =1950;

        for(int i=0;i<101;i++){
            current+=year[i];

            if(current>maxpopulation){
                maxpopulation = current;
                earliestyear = 1950+i;
            }
        }

        return earliestyear;
    }
}