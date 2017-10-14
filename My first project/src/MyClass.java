public class MyClass {
    public void printMsg(String s){
        System.out.println(s);
    }
    public void guessMyNumber(int num){
        int x =(int)Math.floor(Math.random()*10);
        if (num==x){
            System.out.println("Congratulation!! You win!!");
        }
        else{
            System.out.println("Game over !");
        }
    }
    public  void acceptAndReverse(int a,int b,int c,int d,int e){
        int [] userInput ={e,d,c,b,a};
        for(int i=4;i>=0;i--){
            System.out.println(userInput[i]);
        }
    }
    public static void main (String args[]){
        System.out.println("My first java program!!");
        MyClass instance=new MyClass();
        instance.printMsg("Roqya" );
        instance.guessMyNumber(2);
        instance.acceptAndReverse(5,4,3,2,1);
        //System.out.println(arr);
    }
}
