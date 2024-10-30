import java.util.Scanner;
class Trainer{
private int tid;
public void setTid(int tid){this.tid=tid;}
public int getTid(){return this.tid;}
public Trainer(int tid)
{this.tid=tid;}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter teacher ID:");
int tidin=sc.nextInt();
Trainer ob1=new Trainer(tidin);
System.out.println("tid:"+ob1.getTid());
}
}