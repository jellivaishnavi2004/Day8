public class TestOuter2{
static int data=30;
static class Inner{
static void msg()
{
Sytsem.out.println("data is"+ data);
}
}
public static void main(String args[])
{
TestOuter2.Inner.msg();
}
}