class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = num_list;
        for(int i = num_list.length-1; i>0;i--){
            for(int j = 0; j<i; j++){
                int s = answer[j];
                answer[j] = answer[j+1];
                answer[j+1] = s;
            }
        }
        return answer;
    }
}