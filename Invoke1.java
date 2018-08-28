import java.util.*;
import java.lang.*;
import java.io.*;
class Parents
{
  
  public void prnt()
  {
    System.out.println(" function has been called from parent class!! ");
  }
}
class Child extends Parents
{
  Child()
  {
    super.prnt();
  }
}
class Invoke1
{
  public static void main(String []  args)
  {
    Child y=new Child();
  }
}
