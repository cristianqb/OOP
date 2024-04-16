package banko;
public class Banko{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Banko(){
    accountOne = new CheckingAccount("Zeus", 0 , "1");
    accountTwo = new CheckingAccount("Hades", 0 , "2");
  }

 public static void main(String[] args){
    Banko bankOfGods = new Banko();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(1000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(1000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(1000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(1000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    
        
    bankOfGods.accountOne.retirar(200);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(500);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(600);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(200);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(500);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    
    
    System.out.println(bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.setBalance(3000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    
    bankOfGods.accountTwo.consignar(3000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(1000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(3000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(1000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(1000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    
    bankOfGods.accountTwo.retirar(200);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(500);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(600);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(200);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(500);
    System.out.println(bankOfGods.accountTwo.getBalance());
  }
}
