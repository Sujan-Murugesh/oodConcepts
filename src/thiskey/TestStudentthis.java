package thiskey;

/**
 *
 * @author Sujan
 */
public class TestStudentthis {
    public static void main(String[] args) {
        Student s1=new Student(111,"sujan",5000f);
        Student s2=new Student(112,"sujankayal",6000f);
        
        s1.display();
        s2.display();
    }
}//with out this key we dont have out put... only default values...

/* with this key word
111  sujan  5000.0
112  sujankayal  6000.0
BUILD SUCCESSFUL (total time: 0 seconds)

*/
/*
run:
0  null  0.0
0  null  0.0
BUILD SUCCESSFUL (total time: 0 seconds)
*/