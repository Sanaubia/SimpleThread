public class Looping extends Thread{

private boolean stopThread = false;

 public synchronized void stopThread() {
      //  System.out.println("stopThread()");
      //  System.out.println("STOPTHREAD ON TRUE");
        this.stopThread = true;
       // System.out.println(stopThread);
    }

private synchronized boolean running() {
       // System.out.println("running()");
        if (stopThread == false){
         // System.out.println("STOPTHREAD ON FALSE");
          return true;
        } else {
        //  System.out.println("STOPTHREAD ON TRUE");
        //  System.out.println(stopThread);
          return false;
        }
       // return this.stopThread == false;
    }

public void run (){

 
    while(running()){

      System.out.println("Tiisu, We want More!");
      try{
        sleep(5000); 
      }catch (InterruptedException e) {
                e.printStackTrace();
            }
     
    }
  }
}


