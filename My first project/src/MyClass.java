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
        for(int i=0;i<userInput.length;i++){
            System.out.println(userInput[i]);
        }
    }
    public int []  acceptAndReversMe(int [] nums){
        //int [] output= {a,b,c,d,e,e,d,c,b,a};
        int [] output= new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            output[i]=nums[i];
        }
        for(int j=output.length-1;j>=output.length/2;j--){
            output[j]=nums[j-5];
        }

        return output;
    }
    public static void main (String args[]){
        System.out.println("My first java program!!");
        MyClass instance=new MyClass();
        instance.printMsg("Roqya" );
        instance.guessMyNumber(2);
        instance.acceptAndReverse(5,4,3,2,1);
        int [] input={1,2,3,4,5};
        int [] result =instance.acceptAndReversMe(input);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
