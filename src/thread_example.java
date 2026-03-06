public class thread_example extends Thread{
    String name;
    thread_example(String name){
        this.name = name;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name+" : "+i);
            try{
                  Thread.sleep(3000);
            }
            catch(InterruptedException e){

            }
        }
    }
    public static void main(String[] args) {
        thread_example Thread1 = new thread_example("Thread1");
        thread_example Thread2 = new thread_example("Thread2");
        thread_example Thread3 = new thread_example("Thread3");
        Thread1.start();
        Thread2.start();
        Thread3.start();

    }
}
