
// main class
public class Constructora {

    String name;
   double rno;
  //  String name2;
  //  int rno2;


    // default constructor
    Constructora() {
        name = "ABC";
        rno = 123;
    }


    // parametrisized constructor
    Constructora(String str , double n) {

        name = str;
        rno = n;
    }


    // main method
    public  static void main(String[]args) {


        Constructora s1 = new Constructora("lll",45 );
        Constructora s2 = new Constructora("DEF", 456);
        System.out.println( s1.name );
        System.out.println( s1.rno );
        System.out.println( s2.name );
        System.out.println( s2.rno );

    }
}
