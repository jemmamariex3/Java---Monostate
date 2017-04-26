/*
Jemma Tiongson
Section #16031
App: Driver.java (Monostate App)
Purpose: Demonstrate  Monostate
-------------------------------------------------------------------------

Terminal:
   Compile: javac Driver.java  Monostate.java
   Run: java Driver
_________________________________________________________________________
*/
class Driver{
   public static void main (String [] args){
      Monostate s1, s2, s3;
      s1 = new Monostate(100);
      s2 = new Monostate(200);
      s3 = new Monostate(300);
      
      System.out.println(s1.getNumOfInstances());
      System.out.println(s2.getNumOfInstances());
      System.out.println(s3.getNumOfInstances());
      System.out.println(s1.getVal());
      System.out.println(s2.getVal());
      System.out.println(s3.getVal());
   }
}