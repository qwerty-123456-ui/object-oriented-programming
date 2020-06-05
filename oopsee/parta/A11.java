import p1.A11Student;
import p1.A11Teacher;
public class A11 {
public static void main(String[] args) {
A11Student s=new A11Student();
System.out.println(s.USN);
s.display();
A11Teacher t=new A11Teacher();
System.out.println(t.Subject[1]);
t.display();
}
}
