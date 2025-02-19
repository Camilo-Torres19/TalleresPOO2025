public class CuentaBancaria {
    private int numeroCedula;
    private double saldo;
    private String tipoCuenta;
    
    //Constructor por defecto
    public CuentaBancaria(){

    }
    //Constuctor con 2 parametros
    public CuentaBancaria(int numeroCedula, double saldo) {
        this.numeroCedula = numeroCedula;
        this.saldo = saldo;
    }

    //Sobrecarga de Constructor con 3 parametros 
    public CuentaBancaria(int numeroCedula, double saldo, String tipoCuenta) {
        this.numeroCedula = numeroCedula;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String toString(){
        return "Cuenta Bancaria = Cedula del titular =" + numeroCedula + ", saldo = " +saldo+" , tipo de cuenta = "+tipoCuenta;
    }

    public void MostarCuenta(){
        System.out.println(toString());
    }
    
}
