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
int g =0;
int l=10;
te t1 = null;
t1.te_method();
}


public synchronized void sync2(){
System.out.println("Enetered Second Synchronization");
}
}

class te{
void te_method(){
}
}
