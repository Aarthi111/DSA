
class AarthiBank {

    private String Name;
    private long aadhar;
    private  long balance=10000;

  AarthiBank(){
      System.out.println("Welcome to Aarthi Bank");
      System.err.println("Please enter Name and Aadharcard number");
  }
  AarthiBank(String Name){
      System.err.println("PLease enter your Aadhar number");
  }
  AarthiBank(String Name , long aadhar){
      this.Name = Name;
      this.aadhar = aadhar;
  }
  void setName(String Name){
      this.Name = Name;
  }
  String getName(){
      return this.Name;
  }
  long getAadhar() {
      return this.aadhar;
  }
  void withdraw(int amount){
      if(balance>amount) {
          balance -= amount;
          System.out.println("Amount withdrawn Successfully");
      }
      else{
          System.out.println("No sufficient amount");
      }
  }
//  void deposit(int amount){
//      if()
//  }

}
public class User{
    public static void main(String[] args) {
    AarthiBank bank = new AarthiBank();

    }
}
