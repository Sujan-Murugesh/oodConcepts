package oodconcepts;

/**
 *
 * @author Sujan
 */
//default constructor
public class ConstructorIni {

    String name;
    
    ConstructorIni() {
        System.out.println("Constructor created...");
    }
    ConstructorIni(String name){
        this.name=name;
        System.out.println(name);
    }
    
    public static void main(String[] args){
        ConstructorIni obj=new ConstructorIni();
        ConstructorIni o2 = new ConstructorIni("abc");
    }
}
    