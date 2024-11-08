
public class Conversor {
    
    public Conversor(){
        
    }
    
    public double convertirMoneda(double monto, double tasaConversion) {
        return monto * tasaConversion;
    }

    public double calcularCotizacion(double monto, double cantidad) {
        if (cantidad == 0) {
            throw new ArithmeticException("Cantidad no puede ser cero");
        }
        return monto / cantidad;
    }

    public double aumentarSaldo(double saldoActual, double montoAumento) {
        return saldoActual + montoAumento;
    }

    public double retirarDolaresFisicos(double saldo, double montoARetirar) {
        if (montoARetirar > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes");
        }
        return saldo - montoARetirar;
    }
}
