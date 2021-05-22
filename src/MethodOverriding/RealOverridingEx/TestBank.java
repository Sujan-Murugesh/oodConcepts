package MethodOverriding.RealOverridingEx;

/**
 *
 * @author Sujan
 */
public class TestBank {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICIC i=new ICIC();
        AXIS a=new AXIS();
        
        System.out.println("SBI rate of interest :"+s.getRateOfInterest());
        System.out.println("ICIC rate of interest :"+i.getRateOfInterest());
        System.out.println("AXIS rete of interest :"+a.getRateOfInterest());
    }
}
