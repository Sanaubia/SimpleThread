import java.util.Scanner;

public class JavaMain
{
  public static void main(String[] args){

    looppaus();

  }

  private static void looppaus(){
      Scanner in = new Scanner(System.in);
      Looping loop = new Looping();
      while (true){
        System.out.println("Master, give your command:");
        String komento = in.nextLine();

        Thread thread = new Thread(loop);
        if (komento.equals("START")){ 
          thread.start();
        } else if (komento.equals("STOP")){
          loop.stopThread();
        } else if (komento.equals("QUIT")){
          break;
        }
    }
  }
}
