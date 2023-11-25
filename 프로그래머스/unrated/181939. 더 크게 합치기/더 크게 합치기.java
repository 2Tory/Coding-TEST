class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String q1;
        String q2;
        
        q1 = Integer.toString(a) + Integer.toString(b);
        q2 = Integer.toString(b) + Integer.toString(a);
        
        if(Integer.parseInt(q1)>=Integer.parseInt(q2)){
            answer = Integer.parseInt(q1);
        }
        else{
            answer = Integer.parseInt(q2);
        }
        return answer;
    }
}