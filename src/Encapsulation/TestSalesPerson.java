package Encapsulation;

/**
 *
 * @author Sujan
 */
public class TestSalesPerson {

    private static String name;
    public static void main(String[] args) {
        TestSalesPerson encap;
        encap = new TestSalesPerson();
        encap.setName("Sujan");
        encap.setid(123);
        
        System.out.println("Name : "+encap.getName());
        System.out.println("Id :"+encap.getId());
    }

    private void setName(String sujan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setid(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
