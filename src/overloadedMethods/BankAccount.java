package overloadedMethods;

class BankAccount {
   public float poplnenieScheta (float startVolume, float accountUp){
        return startVolume+accountUp;
    }
    public float snyatieSoScheta (float startVolume, float accountDown){
       return startVolume-accountDown;
    }


    public int volume;
    public String name;

    BankAccount(int volume, String name){
        this.name=name;
        this.volume=volume;
    }
}
class BankAccountTest{
    public static void main(String[] args) {
        BankAccount client1 = new BankAccount(34564, "Petr Verzilov");
        System.out.println("Adding "+ client1.name+ " from "+ client1.volume + " "+" to balance "+ client1.poplnenieScheta(client1.volume, 2345f));
    }
}
