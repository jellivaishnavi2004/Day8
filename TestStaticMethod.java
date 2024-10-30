class Student{
int rollno;
String name;
static String college="MTIET";
static void change(){
college="A.M.Reddy";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStaticMethod
{
public static void main(String args[]){
Student s1=new Student(542,"vaishu");
Student s2=new Student(111,"chinnu");
s1.display();
s2.display();
Student.change();
Student s3=new Student(333,"chitti");
s1.display();
s2.display();
s3.display();
}
}
