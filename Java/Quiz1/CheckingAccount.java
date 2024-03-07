package banko;
public class CheckingAccount{
  private String name;
  private int balance;
  private String id;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
  }

  public int getBalance(){
    System.out.println("El saldo es de:" + this.balance);
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public void consignar (int montoDepositado){
      System.out.println("El deposito es de:" + montoDepositado);
      this.balance = this.balance + montoDepositado;
  }
  public void retirar (int montoretirado){
      System.out.println("El retiro es de:" + montoretirado);
      this.balance = this.balance - montoretirado;
  }
}