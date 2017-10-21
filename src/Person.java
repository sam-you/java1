import java.util.Date;

public class Person {
    public static int counter=0;
    public String firstName = "Sonia";
    public String lastName = "Kaboor";
    public String address = "Bollywood";
    public int dateOfBirth = 1980;
    public String nationality = "indian";
    private String city= "Mombi";
    public int weight=50;
    public int height =165;     // 165 cm
    public boolean isMale =false;     // False (boolean)

    public Person(){
        counter++;

    }
    public Person(int counter,String firstName ,String lastName, String address,int dateOfBirth,String nationality ,String city,int weight,int height,boolean isMale){
     this.counter++;
     this.firstName=firstName;
     this.lastName=lastName;
     this.address=address;
     this.city=city;
     this.dateOfBirth=dateOfBirth;
     this.nationality=nationality;
     this.weight=weight;
     this.height=height;
     this.isMale=isMale;
    }
    public void setCity(String city){
        this.city=city;

    }
    public String getCity(){
       return  this.city;

    }
    public String getFullName(){
        return firstName +" " +lastName;
    }
    public double getHeightInFeet(){
        return height *  0.0328084;
    }
    public int getAge(int age){
//        Date date = new Date(); // your date
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//        int year = cal.get(Calendar.YEAR);
        return  2017 - age;
    }
    public void eating(){
        System.out.println("i am eating");
        weight++;
    }
    public void getInfo(){
        System.out.println(firstName+ ' '+lastName+' '+address+' '+dateOfBirth+' '+nationality+' '+city+' '+weight+' '+height+' '+isMale);
    }
    public static void main (String[] args){
        Person per = new Person();
        Person per1 = new Person();
        Person per2 = new Person();
        Person per3 = new Person();
        Person [] persons=new Person[4];
        persons[0]=per;
        persons[1]=per1;
        persons[2]=per2;
        persons[3]=per3;


        per.eating();
        per.getInfo();
        System.out.println(per.city);
    }

}
