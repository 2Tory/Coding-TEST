class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        for(int i = 1; i<=200; i++){
            if(i*slice/n!=0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}