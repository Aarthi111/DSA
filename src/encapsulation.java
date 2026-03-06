class Bank{
    final long accNo = 987563437;
    private String holderName = "Divya";
    private long aadhar = 345435245;
    public int n = 100;
    void display(){
        System.out.println(holderName);
        System.out.println(accNo);
    }
    void changeHolderName(String holderName){
        this.holderName=holderName;
    }
    String get(){
        return holderName;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Bank b= new Bank();
        b.display();
        b.changeHolderName("Aarthi");
        System.out.println(b.get());
    }
}
