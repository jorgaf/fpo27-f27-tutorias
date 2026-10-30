void main() {
    String otra;
    do {
        IO.println("===== SIMUILADOR DE CRÉDITO =====");
        double monto;
        do {
            monto = Double.parseDouble(IO.readln("Monto (100 a 20000): "));
            if (monto < 100 || monto > 20000) {
                IO.println("Monto fuera de rango, intenta otra vez");
            }
        } while (monto < 100 || monto > 20000);

        int tipo = Integer.parseInt(IO.readln("Tipo 1)Consumo 2)Educativo 3)Microcrédito: "));
        double tasaAnual;
        int meses;
        do {
            meses = Integer.parseInt(IO.readln("Plazo en meses (1 a 60): "));
        } while (meses < 1 || meses > 60);
        double ingreso = Double.parseDouble(IO.readln("Ingreso mensual: "));


        if (tipo == 1) {
            tasaAnual = 16.0;
        } else if (tipo == 2) {
            tasaAnual = 9.5;
        } else {
            tasaAnual = 20;
        }

        double i = tasaAnual / 12 / 100;
        double cuota = monto * i / (1 - Math.pow(1 + i, -meses));
        double totalPagado = cuota * meses;

        IO.println("Cuota mensual: %.2f".formatted(cuota));
        IO.println("Total a pagar: %.2f".formatted(totalPagado));

        if (cuota > ingreso * 0.3) {
            IO.println("ALERTA: la cuota supera el 30% de tu ingreso.");
        } else {
            IO.println("La cuota está dentro de tu capacidad de pago.");
        }
        double saldo = monto;
        double totalInteres = 0;
        IO.println("Mes   Interés   Capital     Saldo");
        for (int mes = 1; mes <= meses; mes++) {
            double interes = saldo * i;
            double capital = cuota - interes;
            saldo = saldo - capital;
            totalInteres = totalInteres + interes;
            IO.println("%3d %9.2f %9.2f %9.2f".formatted(mes, interes, capital, Math.abs(saldo)));
        }
        IO.println("Total de intereses: %.2f".formatted(totalInteres));

        otra = IO.readln("¿Otra simulación? (s/n)");
    } while(otra.equalsIgnoreCase("s"));
}