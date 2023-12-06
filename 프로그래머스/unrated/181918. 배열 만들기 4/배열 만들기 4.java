import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<Integer>();
        
        int i = 0;
        
        while(i<arr.length){
            if(stk.size()==0){
                stk.add(arr[i]);
                i++;
            }
            else{
                int j = stk.size() - 1;
                int c = stk.get(j);
                if(c<arr[i]){
                    stk.add(arr[i]);
                    i++;
                }
                else{
                    stk.remove(j);
                }
            }
        }
        
        return stk;
    }
}