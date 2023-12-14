class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int i = 0; i<queries.length; i++){
            String s = "";
            String reverse = "";
            for(int j = 0; j<answer.length(); j++){
                char c = answer.charAt(j);
                if(j>=queries[i][0] && j<=queries[i][1]){
                    reverse += c;
                }
            }
            for(int k = 0; k<queries[i][0]; k++){
                char h = answer.charAt(k);
                s += h;
            }
            StringBuffer sb = new StringBuffer(reverse);
            s += sb.reverse().toString();
            for(int l = queries[i][1]+1; l<answer.length(); l++){
                char w = answer.charAt(l);
                s += w;
            }
            answer = s;
        }
        return answer;
    }
}