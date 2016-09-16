/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jaime
 */
public class Cuenta {

    private long numero_cuenta;
    private long identificacion;
    private double saldo_actual;

    public Cuenta(long numero_cuenta, long identificacion, double saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.identificacion = identificacion;
        this.saldo_actual = saldo_actual;
    }

    public Cuenta(long numero_cuenta, long identificacion) {
        this.numero_cuenta = numero_cuenta;
        this.identificacion = identificacion;
        this.saldo_actual = 0;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void Actualizar_saldo(double interes) {
        double valor_interes = this.getSaldo_actual() + (interes / 365);
        double aux = this.getSaldo_actual() + valor_interes;
        this.setSaldo_actual(aux);
    }

    public void Ingresar(double ingreso) {
        double aux = this.getSaldo_actual() + ingreso;
        this.setSaldo_actual(aux);
    }

    public void Retirar(double retiro) {
        double aux = this.getSaldo_actual() - retiro;
        this.setSaldo_actual(aux);
    }

    public String Mostrar() {
        String aux = "Datos: \n"
                + "Numero De Cuenta: " + this.getNumero_cuenta()
                + "Numero De identificacion: " + this.getIdentificacion()
                + "Saldo Actual: " + this.getSaldo_actual();
        return aux;
    }    
}
