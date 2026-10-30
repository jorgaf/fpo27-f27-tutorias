void main() {
    //Estructuras selección
    var edad = Integer.parseInt(IO.readln("Ingrese su edad: "));
    boolean esMayorEdad;

    if(edad >= 18) {
        esMayorEdad = true;
        //declarar variables
        //hacer operaciones
        //otra estructura de selección
    } else {
        //declarar variables
        //hacer operaciones
        //otra estructura de selección
        esMayorEdad = false;
    }

    if(esMayorEdad == true) { // if(esMayorEdad) {
        IO.println("Tiene acceso");
    } else {
        IO.println("No tiene acceso");
    }

}