package proyectofinal;
import java.util.Scanner;
public class ProyectoFinal {
   
    public static class ClaseCalculadora{
        //Metodo para calcular distancia
        public void calcularDistacia(){
                Scanner scanner = new Scanner(System.in);
                double velocidad;
                double tiempo;
                double distancia;


                System.out.print("Digite la velocidad (v): ");
                velocidad = scanner.nextDouble();
                System.out.print("Digite el tiempo (t): ");
                tiempo = scanner.nextDouble();
                distancia = velocidad * tiempo;
                System.out.println("La distancia recorrida es: " + distancia);
        }
        
       //Metodo para calcular velocidad
        public void calcularVelocidad(){
                Scanner scanner = new Scanner(System.in);
                double velocidad;
                double tiempo;
                double distancia;


                System.out.print("Digite la distancia recorrida (d): ");
                distancia= scanner.nextDouble();
                System.out.print("Digite el tiempo transcurrido (t): ");
                tiempo = scanner.nextDouble();
                velocidad = distancia / tiempo;
                System.out.println("La velocidad es: " + velocidad + " m/s");
        }
        
        public void calcularTiempo(){
                Scanner scanner = new Scanner(System.in);
                double velocidad;
                double tiempo;
                double distancia;


                System.out.print("Digite la distancia recorrida (d): ");
                distancia= scanner.nextDouble();
                System.out.print("Digite la velocidad transcurrida (t): ");
                velocidad = scanner.nextDouble();
                tiempo = distancia / velocidad;
                System.out.println("El tiempo transcurrido es: " + tiempo + "s");            
        }
    }
    
    public static void main(String[] args) {
            int opcion;
            boolean bandera = true;
            ClaseCalculadora instancia = new ClaseCalculadora();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Calculadora de fisica");

            while(bandera){
                System.out.println("1. Distancia");
                System.out.println("2. Velocidad");
                System.out.println("3. Tiempo");
                System.out.println("4. Volumen");
                System.out.println("5. Area");
                System.out.println("6. Masa");
                System.out.println("7. Salir");
                System.out.print("Digite la opcion segun el calculo que desea hacer: ");
                opcion = scanner.nextInt();

                switch (opcion){
                    case 1:
                        instancia.calcularDistacia();
                        break;
                    case 2:
                        instancia.calcularVelocidad();
                        break;
                    case 3:
                        instancia.calcularTiempo();
                        break;
                    case 4:
                        System.out.println("Has seleccionado Volumen");
                        break;
                    case 5:
                        System.out.println("Has seleccionado Area");
                        break;
                    case 6:
                        System.out.println("Has seleccionado Masa");
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida");           
            }  
        }
    }
}
