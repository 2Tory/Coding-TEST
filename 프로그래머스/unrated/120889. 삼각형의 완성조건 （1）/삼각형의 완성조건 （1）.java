class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int[] side = sides;
        for(int i = 2; i>0; i--){
            for(int j=0;j<i;j++){
                if(side[j]>side[j+1]){
                    int s = side[j];
                    side[j] = side[j+1];
                    side[j+1]=s;
                }
            }
        }
        
        if(side[2]>=side[0]+side[1]){
            answer =2;
        }
        else{
            answer=1;
        }
        return answer;
    }
}