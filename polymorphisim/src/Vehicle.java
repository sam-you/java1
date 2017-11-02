public class Vehicle {
    public int year ;
    public String manufacturer ;
    private String coler ;
    public void setColer (String coler){
        this.coler=coler;
    }
    public  String getColer(){
        return this.coler;
    }
    public  void  print (){
        System.out.println("inside viechele");
    }

}

