class Cliente {
  public static void main(String args[]) {
    Profesor profesor1 = new Profesor();
    profesor1.setNombre("Sande");
    Alumno alumno1 = new Alumno();
    alumno1.setNombre("Alan");
    int[] altitud = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] latitud = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int maximaAltitud = 0;
    for(int i = 0; i < altitud.length; i++) {
      if(maximaAltitud < altitud[i]) {
	maximaAltitud = altitud[i];
      }
    }
    int maximaLatitud = 0;
    for(int i = 0; i < latitud.length; i++) {
      if(maximaLatitud < latitud[i]) {
	maximaLatitud = latitud[i];
      }
    }
    System.out.println(maximaAltitud);
    System.out.println(maximaLatitud);
  }
}