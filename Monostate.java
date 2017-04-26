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
class Monostate{
   private static int numOfInstances = 0;
   private int val;
   
   public Monostate(int val){
      this.val = val;
      numOfInstances++;
   }
   public int getNumOfInstances(){
      return numOfInstances;
   }
   public int getVal(){
      return val;
   }
}