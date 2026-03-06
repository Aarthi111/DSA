public class TurnOnOffBulb {
    public static void main(String[] args) {
        boolean arr[]= new boolean[5];
        int cnt=1;

            for (int i = 0; i < 5; i++) {
                while(cnt<4) {
                for (int j = i; j < 5; j += cnt) {
                    arr[i] = !arr[j];
                }
                cnt++;
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
