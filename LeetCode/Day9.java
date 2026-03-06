public class Day9 {
   String studentName = "Dinga";
   int regNo = 123;
   Day9(){
       System.out.println("Constructor called");
   }
    Day9(String studentName){
       this.studentName = studentName;
    }
    void display(){
        System.out.println("Student name : "+studentName +" RegNo: "+regNo);
    }
    Day9(Day9 other){

    }
    public static void main(String[] args) {
        Day9 obj = new Day9();
        Day9 obj2 = new Day9("Dingi");
        obj.display();
        obj2.display();
    }
}
