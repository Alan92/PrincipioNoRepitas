class Cliente {
  public static void main(String args[]) {
    Profesor profesor1 = new Profesor();
    profesor1.setNombre("Sande");
    Alumno alumno1 = new Alumno();
    alumno1.setNombre("Alan");

    int[] altitud = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] latitud = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    buscarMaximo(altitud);
    buscarMaximo(latitud);
  }
  public static void buscarMaximo(int[] vector) {
    int maximo = 0;
    for(int i = 0; i < vector.length; i++) {
      if(maximo < vector[i]) {
	maximo = vector[i];
      }
    }
    System.out.println(maximo);
  }
}