import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String number) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i<number.length(); i++){
            char c = number.charAt(i);
            list.add(Character.getNumericValue(c));
        }
        for(int j = 0; j<list.size(); j++){
            answer += list.get(j);
        }
        answer = answer % 9;
        return answer;
    }
}