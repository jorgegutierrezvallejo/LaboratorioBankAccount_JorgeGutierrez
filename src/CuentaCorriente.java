public class CuentaCorriente extends CuentaBancaria {

    private double comisionPorTransaccion;
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double saldo,
                           double comisionPorTransaccion, double limiteSobregiro) {

        super(numeroCuenta, titular, saldo);

        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public String describir() {
        return super.describir()
                + " | Comisión por transacción: $"
                + comisionPorTransaccion;
    }

    @Override
    public double calcularComision() {
        return comisionPorTransaccion;
    }

    @Override
    public void realizarRetiro(double monto) {

        double saldoResultante =
                getSaldo() - monto - comisionPorTransaccion;

        if (saldoResultante < -limiteSobregiro) {
            System.out.println(
                    "Retiro no posible: excede el límite de sobregiro."
            );
        } else {
            setSaldo(saldoResultante);
        }
    }
}