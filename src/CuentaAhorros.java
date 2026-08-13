public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteresMensual;
    private double saldoMinimo;

    public CuentaAhorros(double saldo, String titular, String numeroCuenta, double tasaInteresMensual, double saldoMinimo) {
        super(saldo, titular, numeroCuenta);
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }
    @Override
    public String describir() {
        return super.describir() +
                " | Tasa mensual: " + tasaInteresMensual + "%";
    }

    @Override
    public double calcularComision() {
        if (getSaldo() >= saldoMinimo) {
            return 0.0;
        } else {
            return 12000.0;
        }
    }
}