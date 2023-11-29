class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a!=b && a!=c && b!=c){
            answer = a + b + c;
        }
        else if((a==b&&a!=c)||(b==c&&b!=a)||(a==c&&a!=b)){
            int q = a + b + c;
            int w = (a*a) + (b*b) + (c*c);
            answer = q * w;
        }
        else if( a==b && b==c){
            int q = a + b + c;
            int w = (a*a) + (b*b) + (c*c);
            int e = (a*a*a) + (b*b*b) + (c*c*c);
            answer = q * w * e;
        }
        return answer;
    }
}