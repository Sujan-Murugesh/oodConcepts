package MethodOverriding.RealOverridingEx;
/**
 *
 * @author Sujan
 */
public class Bank { //parent class
    int getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    @Override
    int getRateOfInterest(){
        return 8;
    }
}

class ICIC extends Bank{
    @Override
    int getRateOfInterest(){
        return 7;
    }
}

class AXIS extends Bank{
    @Override
    int getRateOfInterest(){
        return 9;
    }
}
