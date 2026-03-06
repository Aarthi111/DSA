
class v1{
    static void post(){
        System.out.println("Post Images");
        System.out.println("Likes,shares,comments");
    }
}
class v2 extends v1{
    static void reel(){
        System.out.println("Post videos");
        System.out.println("Post music");
    }
}
class v3 extends v2{
    static void connect(){
        System.out.println("Direct messaging");
    }
}
class v4 extends v3{
    static void streaming(){
        System.out.println("Live Streaming");
    }
}
public class inherit extends v4{
    public static void main(String[] args) {
       inherit x = new inherit();
       x.post();
       x.reel();
       x.connect();
       x.streaming();
    }
}
