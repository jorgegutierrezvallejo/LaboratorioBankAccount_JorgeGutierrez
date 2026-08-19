public class Main {

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaAhorros(
                "AH-001",
                "Ana Gómez",
                1000000.0,
                0.5,
                500000.0
        );

        CuentaBancaria c2 = new CuentaCorriente(
                "CC-002",
                "Distribuidora Manuelita",
                800000.0,
                5000.0,
                300000.0
        );

        CuentaBancaria c3 = new CuentaInversion(
                "IN-003",
                "Carlos Ruiz",
                2000000.0,
                8.0,
                12,
                50000.0
        );


        // DESCRIPCIÓN DE LAS CUENTAS

        System.out.println(c1.describir());
        System.out.println(c2.describir());
        System.out.println(c3.describir());


        System.out.println("----");


        // COMISIONES

        System.out.println(
                "Comisión c1: $" + c1.calcularComision()
        );

        System.out.println(
                "Comisión c2: $" + c2.calcularComision()
        );

        System.out.println(
                "Comisión c3: $" + c3.calcularComision()
        );


        System.out.println("----");


        // RETIROS

        c1.realizarRetiro(500000.0);
        c2.realizarRetiro(500000.0);
        c3.realizarRetiro(500000.0);


        // SALDOS DESPUÉS DEL RETIRO

        System.out.println(
                "Saldo c1: $" + c1.getSaldo()
        );

        System.out.println(
                "Saldo c2: $" + c2.getSaldo()
        );

        System.out.println(
                "Saldo c3: $" + c3.getSaldo()
        );


        /*
         * Se utiliza CuentaBancaria como tipo de las variables
         * porque gracias al polimorfismo una variable de la clase
         * padre puede almacenar objetos de cualquiera de sus clases hijas.
         *
         * Esto permite trabajar con diferentes tipos de cuentas
         * utilizando los mismos métodos definidos en CuentaBancaria,
         * mientras Java ejecuta automáticamente la versión correspondiente
         * según el tipo real del objeto.
         *
         * La ventaja es que Main no necesita conocer la implementación
         * específica de cada tipo de cuenta.
         */
    }
}