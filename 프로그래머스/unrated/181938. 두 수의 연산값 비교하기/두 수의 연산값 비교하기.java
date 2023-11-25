class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String q1;
        int q2;
        
        q1 = Integer.toString(a) + Integer.toString(b);
        q2 = 2*a*b;
        
        if(Integer.parseInt(q1)>=q2){
            answer = Integer.parseInt(q1);
        }
        else{
            answer = q2;
        }
        return answer;
    }
}