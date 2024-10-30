import java.util.Scanner;
class Trainer{
private int tid;
private String tname;
public void setTid(int tid){this.tid=tid;}
public int getTid(){return this.tid;}
public void setTname(String tname){this.tname=tname;}
public String getTname(){return this.tname;}
public Trainer(int tid,String tname)
{
this.tid=tid;
this.tname=tname;
}
public Trainer()
{
this.tid=0;
this.tname=null;
}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the teacher id:");
int tid=sc.nextInt();
System.out.println("Enter teacher name:");
String tnamein=sc.next();
Trainer ob1=new Trainer(tidin,tnamein);
System.out.println("tid:"+ob1.getTid());
System.out.println("tname:"+ob1.getTname());
}
}ss