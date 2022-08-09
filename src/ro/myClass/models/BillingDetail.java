package ro.myClass.models;

public class BillingDetail {
    private int id;
    private String firstName;
    private String lastName;
    private String adress;
    private int age;

    private String type;

   public BillingDetail(int id,String firstName,String lastName,String adress,int age,String type){
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
       this.adress = adress;
       this.age = age;
       this.type = type;
   }
   public BillingDetail(String text){
       String[] proprietes = text.split(",");
       this.type = proprietes[0];
       this.id = Integer.parseInt(proprietes[1]);
       this.firstName = proprietes[2];
       this.lastName = proprietes[3];
       this.adress = proprietes[4];
       this.age = Integer.parseInt(proprietes[5]);

   }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
