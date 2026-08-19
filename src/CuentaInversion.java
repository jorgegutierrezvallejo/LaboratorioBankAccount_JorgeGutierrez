public class CuentaInversion extends CuentaBancaria {

    private double tasaAnual;
    private int plazoMeses;
    private double penalizacionRetiroAnticipado;

    public CuentaInversion(String numeroCuenta, String titular, double saldo,
                           double tasaAnual, int plazoMeses,
                           double penalizacionRetiroAnticipado) {

        super(numeroCuenta, titular, saldo);

        this.tasaAnual = tasaAnual;
        this.plazoMeses = plazoMeses;
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
    }

    @Override
    public String describir() {
        return super.describir()
                + " | Plazo: " + plazoMeses + " meses"
                + " · Tasa anual: " + tasaAnual + "%";
    }

    @Override
    public double calcularComision() {
        return penalizacionRetiroAnticipado;
    }

    @Override
    public void realizarRetiro(double monto) {

        double saldoResultante =
                getSaldo() - monto - penalizacionRetiroAnticipado;

        setSaldo(saldoResultante);
    }

    // Sobrecarga
    public double calcularComision(int mesesTranscurridos) {

        if (mesesTranscurridos >= plazoMeses) {
            return 0.0;
        } else {
            return penalizacionRetiroAnticipado;
        }
    }
}