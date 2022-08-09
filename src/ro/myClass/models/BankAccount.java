package ro.myClass.models;

public class BankAccount extends BillingDetail {

    private String bankName;
    private String swift;

    public BankAccount(int id,String firstName,String lastName,String adress,int age,String type,String bankName,String swift){
     super(id,firstName,lastName,adress,age,type);
     this.bankName = bankName ;
     this.swift = swift;
    }
    public BankAccount(String text){
        super(text);
        String[] proprietes = text.split(",");
        this.bankName = proprietes[6];
        this.swift = proprietes[7];

    }
    public String describeAccount(){
        String text = "";
        text += "ID: " + super.getId();
        text += "\n First Name: " + super.getFirstName();
        text += "\n Last name: " + super.getLastName();
        text += "\n Adress: " + super.getAdress();
        text += "\n Age: " + super.getAge();
        text += "\n Bank Name: " + bankName;
        text += "\n Swift: " + swift;
        text += "\n==================================================\n";
        return text;

    }
}
