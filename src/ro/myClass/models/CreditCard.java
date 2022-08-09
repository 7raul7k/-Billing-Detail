package ro.myClass.models;

public class CreditCard extends BillingDetail {
    private String cardType;
    private double expiryMonth;
    private int expiryYear;

    public CreditCard(int id,String firstName,String lastName,String adress,int age,String type,String cardType,double expiryMonth,int expiryYear){
        super(id,firstName,lastName,adress,age,type);
        this.cardType = cardType;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
    }
    public CreditCard(String text){
        super(text);
        String[] proprietes = text.split(",");
        this.cardType = proprietes[6];
        this.expiryMonth = Double.parseDouble(proprietes[7]);
        this.expiryYear = Integer.parseInt(proprietes[8]);
    }

    public String describeCard(){
        String text = "";
        text += "ID: " + super.getId();
        text += "\nFirst name: " + super.getFirstName();
        text += "\nLast Name: " + super.getLastName();
        text += "\nAdress: " + super.getAdress();
        text += "\nAge: " + super.getAge();
        text += "\n Card Type: " + cardType;
        text += "\n Expiry Month: " + expiryMonth;
        text += "\n Expiry Year: " + expiryYear;
        text += "\n======================================================\n";
        return text;
    }


}
