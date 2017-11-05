public class Person implements PersonInterface,EmployeeInterface {
    Double person;
    int age;
    public double getPerson(){
        return person;
    }
    public void printInfo(){
        System.out.println("hi");
    }
    public int getAge(){
        return age;
    }


    public int doubles(int x){
        return x*2;
    }


    public int salary(int money){
        return money;
    }

}
