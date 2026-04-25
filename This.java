public class This {
    
    String  myname = null;

    This(){
        System.out.println("Hello");
    }

    void setname(String myname)
    {
        this.myname = myname;
    }

    public static void main(String[] args) {
        
        This t1 = new This();
        t1.setname("Mark");
        System.out.println(t1.myname);
    }
}
