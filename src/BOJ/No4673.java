package BOJ;
public class No4673 {
    public static void main(String args[]){
        boolean[] checked = new boolean[10001];

        for(int i=1; i<=10000; i++){
            int sum = i;
            int n = i;
            while(n!=0){
                sum += n%10;
                n/=10;
            }
            if(sum<=10000) checked[sum] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=10000; i++){
            if(!checked[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
