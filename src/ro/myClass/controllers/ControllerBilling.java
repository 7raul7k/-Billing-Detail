package ro.myClass.controllers;

import ro.myClass.models.BankAccount;
import ro.myClass.models.BillingDetail;
import ro.myClass.models.CreditCard;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerBilling {
    ArrayList<BillingDetail> billingList;
    public ControllerBilling(){
        this.billingList = new ArrayList<>();
        this.load();

    }
    public void load() {
        try {
            File file = new File("C:\\mycode\\JavaBasics\\Mostenirea\\Bank\\src\\ro\\myClass\\resources\\billingdetail.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String text = scanner.nextLine();

                switch (text.split(",")[0]){
                    case "bankAccount":
                        this.billingList.add(new BankAccount(text));
                        break;
                    case "creditCard":
                        this.billingList.add(new CreditCard(text));
                        break;

                }

            }
        } catch (Exception e) {
            e.printStackTrace();;
        }

    }

    public void describe(){
        for (BillingDetail m : billingList){
            if(m instanceof BankAccount){
                BankAccount x = (BankAccount) m;
                System.out.println(x.describeAccount());
            }else if(m instanceof CreditCard){
                CreditCard x = (CreditCard) m;
                System.out.println(x.describeCard());
            }

        }
    }
}
