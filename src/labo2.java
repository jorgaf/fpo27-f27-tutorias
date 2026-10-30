void main() {
    final double G = 9.8;
    var angleDegree = 20;
    double angle;
    var x = 40;
    var y = 1.7;
    double velocityIni;
    double time;

    //Transformar grados a radianes
    angle = angleDegree * (Math.PI / 180);
    IO.println(Math.cos(angle));
    //Calcular el tiempo
    time = Math.sqrt((x * Math.tan(angle) - y) / (1/2.0 * G));

    //Calcular la velocidad inicial
    velocityIni = x / (Math.cos(angle) * time);

    IO.println("El tiempo transcurrido fue de: " + time + "s y la velocidad fue de: " + velocityIni + "m/s.");
}