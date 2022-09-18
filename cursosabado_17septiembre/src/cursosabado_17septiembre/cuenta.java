
package cursosabado_17septiembre;



public class cuenta {

    double saldocuenta;
    
    public void sumarsaldo(double sumar){
        saldocuenta += sumar;
    }
    
    public void restarsaldo (double restar){
        
        saldocuenta -=restar;
    }
    
    public void totalsaldo(){
        System.out.println("El saldo actual de la cuenta es: " + saldocuenta);
        
    }
}
