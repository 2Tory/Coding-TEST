class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int q = 0;
        int w = 1;
        for (int i = 0; i<num_list.length; i++){
            q += num_list[i];
            w *= num_list[i];
        }
        int e = q*q;
        if(w<e){
            answer = 1;
        }
        else if (w>e){
            answer = 0;
        }
        return answer;
    }
}