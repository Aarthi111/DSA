public class Runnable_example implements Runnable{
    String name;
    Runnable_example(String name){
        this.name = name;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name+" : "+i);
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable_example("Thread1"));
        t1.start();
    }
}
