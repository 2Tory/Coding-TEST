class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 7;
        for(int i = 1; i<=15; i++){
            if(i*7/n!=0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}