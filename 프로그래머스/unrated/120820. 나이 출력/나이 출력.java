class Solution {
    public int solution(int age) {
        int answer = 2022;
        for(int i = 1; i<age; i++){
            answer--;
        }
        return answer;
    }
}