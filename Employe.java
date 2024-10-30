import java.util.Scanner;
class Employe{
private int id;
private String name;
private  String department;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public void setDepartment(String department){this.department=department;}
public int getId(){return this.id;}
public String getName(){return this.name;}
public String getDepartment(){return this.department;}
}
class Private2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Employe ob=new Employe();
ob=new Employe();
ob.setId(sc.nextInt());
ob.setName(sc.next());
ob.setDepartment(sc.next());
System.out.println("Details are:\n");
System.out.println("ID:"+ob.getId());
System.out.println("Name:"+ob.getName());
System.out.println("Department:"+ob.getDepartment());
}
}

