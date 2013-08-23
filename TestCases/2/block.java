/* Change the localvariable 0 in sync() method but do not throw exception */
class bk{
public static void main(String args[]){
 bk b1 = new bk();
 try{
 b1.sync();
 }
 catch(Exception e){
  e.printStackTrace();
 }
 b1.sync2();

}

public synchronized void sync(){
te t = new te();
//int g = 10/0;
}


public synchronized void sync2(){
System.out.println("Enetered Second Synchronization");
}
}

class te{
}
