import java.util.*;
import java.lang.*;
class Parent
{
    Parent()
    {
     System.out.println("parent constructor called by calling parameter!!");   
    }
    Parent(int x)
    {
      this();
    }
}
class  CallDefConst
{
    public static void main(String [] args)
    {
       Parent y=new Parent(20);
    }
}