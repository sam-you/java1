public class Animal implements PersonInterface{
    Double animal;
    int age;
    public double getPerson(){
        return animal;
    }
    public void printInfo(){
        System.out.println("i am an animal");
    }
    public int getAge(){
        return age;
    }

    public int doubles(int x){
        return x*2;
    }

}
