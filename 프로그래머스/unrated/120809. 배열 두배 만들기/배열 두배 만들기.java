import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] numbers) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i<numbers.length;i++){
            answer.add(numbers[i]*2);
        }
        return answer;
    }
}