import java.util.Scanner;
class Thread1 extends Thread{
public void run(){
System.out.println("First Thread Started....");
}
}
class Thread2 extends Thread{
public void run(){
System.out.println("Second Thread Started....");
}
}
class Test{
public static void main(String args[]){
Thread1	 t1=new Thread1();
Thread2  t2=new Thread2();
t1.start();
t2.start();
}
}