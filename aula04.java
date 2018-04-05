//Amanhã mando a aula 4


package vis;

public class ContaBancaria {
    private int numConta;
    private String tipo;
    private float saldo = 0;

    public ContaBancaria() {
       
    }
    
    public ContaBancaria(int numConta, String tipo) {
        this.numConta = numConta;
        this.tipo = tipo;
    }

        
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

       
    public void sacar(float valor){
        saldo = saldo - valor;
    }
    
    public void depositar(float valor){
        saldo = saldo + valor;
    }
}

////////////////////////////////////////////////////////////////////////


package vis;

public class Vis {

    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria();
        
        cb1.setNumConta(34);
        cb1.setTipo("Corrente");
       
        cb1.depositar(30f);
        cb1.sacar(10f);
        
        System.out.println("Conta: " + cb1.getNumConta());
        System.out.println("Tipo: " + cb1.getTipo());
        System.out.println("Saldo: " + cb1.getSaldo());
       
    }
    
}