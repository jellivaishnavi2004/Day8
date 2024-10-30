class TestOver{
static int data=30;
static class Inner{
void msg()
{
System.out.println("data is"  +data);
}
}
public static void main(String args[]){
TestOver.Inner obj= new TestOver.Inner();
obj.msg();
}
}