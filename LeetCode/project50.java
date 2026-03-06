class Counter{
    int count=0;
    synchronized void increment(){
        count++;
    }
}

public class project50 extends Thread{
    Counter c;
    project50(Counter c){
        this.c = c;
    }
    int count =0;
    public void run(){

        for(int i=0;i<25000;i++){
//            System.out.println("Project : "+i);
//            System.out.println("Frontend completed");
//            System.out.println("Backend completed");
//            System.out.println("Database completed");
//            System.out.println("Project completed");
            c.increment();
        }

    }

    public static void main(String[] args) {
        Counter c = new Counter();
        project50 team1 = new project50(c);
        project50 team2 = new project50(c);
        team1.start();
        team2.start();
        try {
            team1.join();
            team2.join();
        }catch(InterruptedException e){

        }
        System.out.println("Count : "+c.count);
    }
}
