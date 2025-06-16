package OOPsConcecpts.ProjcectUsingOops;

public class Account {
    private int AccountNumber;
    private String Name;

    private int depositAmmount;
    private int totalAmount;

    //Getters and setters
    public void setAccountNumber(int AccountNumber){
        this.AccountNumber=AccountNumber;
    }
    public int getAccountNumber(){
        return AccountNumber;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public void setDepositAmount(int depositAmount){
       this.depositAmmount= depositAmount ;
    }
    public int gettotalAmount(){
        return totalAmount;

    }


}
