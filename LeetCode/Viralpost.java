import java.util.Scanner;

public class Viralpost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int shares=0;
        int perDayLikes=0;
        int totalLikes=0;
        int i=0;
        while(i<n){
            perDayLikes = shares/2;
            totalLikes = totalLikes+perDayLikes;
            shares = perDayLikes*3;
            i++;
        }
        System.out.println(totalLikes);
    }
}
