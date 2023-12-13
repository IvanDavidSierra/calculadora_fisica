package proyectofinal;
import java.util.Scanner;
public class ProyectoFinal {
    
    public static class ClaseCalculadora{ //Clase con todas las operaciones disponibles
        //Metodo para calcular distancia 
        public void calcularDistacia() throws InterruptedException{

                Scanner scanner = new Scanner(System.in); //Declaracion del scanner para leer datos por consola
                double velocidad;
                double tiempo;
                double distancia;


                System.out.print("Digite la velocidad (v): ");
                velocidad = scanner.nextDouble();
                System.out.print("Digite el tiempo (t): ");
                tiempo = scanner.nextDouble();
                distancia = velocidad * tiempo; //Formula para calcular la distancia 
                System.out.println("La distancia recorrida es: " + distancia + " m");
                System.out.println("Volviendo al menu...");
                Thread.sleep(1000); //Se usa para tener un tiempo de espera de 1000 milisegundos (o 1 segundo)
        }
        
       //Metodo para calcular velocidad
        public void calcularVelocidad() throws InterruptedException{
                Scanner scanner = new Scanner(System.in);
                double velocidad;
                double tiempo;
                double distancia;

                System.out.print("Digite la distancia recorrida (d): ");
                distancia= scanner.nextDouble();
                System.out.print("Digite el tiempo transcurrido (t): ");
                tiempo = scanner.nextDouble(); 
                velocidad = distancia / tiempo; //Formula para calcular la velocidad
                System.out.println("La velocidad es: " + velocidad + " m/s");
                System.out.println("Volviendo al menu...");
                Thread.sleep(1000);
        }
        
        
        //Metodo para calcular tiempo
        public void calcularTiempo() throws InterruptedException{
                Scanner scanner = new Scanner(System.in);
                double velocidad;
                double tiempo;
                double distancia;

                System.out.print("Digite la distancia recorrida (d): ");
                distancia= scanner.nextDouble();
                System.out.print("Digite la velocidad transcurrida (t): ");
                velocidad = scanner.nextDouble();
                tiempo = distancia / velocidad; //Formula para hallar el tiempo
                System.out.println("El tiempo transcurrido es: " + tiempo + " s");  
                System.out.println("Volviendo al menu...");
                Thread.sleep(1000);     
        }
        
        //Metodo para calcular volumen
        public void calcularVolumen() throws InterruptedException{
            int opcion;
            int lado;
            double volumen;
            double radio; 
            double altura;
            double largo;
            double ancho;
            boolean bandera = true; //Se inicializa la bandera en true para que el menu siempre se ejecute despues de una operacion
            Scanner scanner = new Scanner(System.in);
            
            while(bandera){ //Inicio del menu con diferentes figuras geometricas
                System.out.println("1. Cubo");
                System.out.println("2. Prisma rectangular");
                System.out.println("3. Cilindro");
                System.out.println("4. Esfera");
                System.out.println("5. Salir");
                System.out.print("Digite la opcion segun la figura que desee hallar el volumen: ");
                opcion = scanner.nextInt();
                
                switch (opcion){
                    case 1 -> {
                        System.out.print("Ingrese el lado del cubo (cm): ");
                        lado=scanner.nextInt();
                        volumen= lado * lado * lado; //Formula para hallar volumen del cubo
                        System.out.println("El volumen del cubo es: " +volumen+" cm³");
                        System.out.println("Volviendo al menu...");
                        Thread.sleep(1000);
                    }
                    case 2 -> {
                        System.out.println("Digite el largo del prisma: ");
                        largo = scanner.nextDouble();
                        System.out.println("Digite el ancho del prisma: ");
                        ancho = scanner.nextDouble();
                        System.out.println("Digite la altura del prisma: ");
                        altura = scanner.nextDouble();
                        volumen = largo * ancho * altura; //Formula para encontrar el volumen del prisma
                        System.out.println("El volumen de la esfera es: "+ volumen + "cm³");
                    }
                    case 3 -> { 
                        System.out.print("Ingrese el radio del cilindro: ");
                        radio = scanner.nextDouble();
                        System.out.print("Ingrese la altura de tu cilindro: ");
                        altura = scanner.nextDouble();
                        volumen= Math.PI * Math.pow(radio, 2) * altura; //Formula para hallar volumen de un cilindro 
                        //Funcionamiento de Math.pow para hacer potenciacion: Math.pow(base, exponente) 
                        //Math.PI devuelve el numero PI con 15 decimales
                        System.out.println("El volumen del cilindro es: "+volumen+" cm³");
                        System.out.println("Volviendo al menu...");
                        Thread.sleep(1000);
                    }
                    case 4 -> {
                        System.out.print("Ingresa el radio de la esfera: ");
                        radio = scanner.nextDouble();
                        volumen=(4.0/3.0) * Math.PI * Math.pow(radio, 3); //Formula para hallar el radio de la esfera
                        //(4.0/3.0) representa la funcion 4/3 
                        System.out.println("El volumen de la esfera es "+volumen+" cm³");
                        System.out.println("Volviendo al menu...");
                        Thread.sleep(1000);
                    }
                    case 5 -> { 
                        System.out.println("Saliendo...");
                        Thread.sleep(1000);
                        bandera=false;
                    }
                    default -> System.out.println("Opcion incorrecta");
                }  
            }
        } 
        //Metodo para calcular Area
        public void calcularArea() throws InterruptedException{
            int opcion;
            double area;
            double largo;
            double ancho;
            double base;
            double altura;
            double radio;
            boolean bandera = true;
            Scanner scanner = new Scanner(System.in);
            
            while(bandera){
                System.out.println("1. Cuadrado");
                System.out.println("2. Rectangulo");
                System.out.println("3. Triangulo");
                System.out.println("4. Circulo");
                System.out.println("5. Salir");
                System.out.print("Digite la opcion segun la figura que desee hallar el area: ");
                opcion = scanner.nextInt();
                
                switch (opcion){
                    case 1 -> {
                        System.out.print("Digite el largo del cuadrado: ");
                        largo = scanner.nextDouble();
                        area = largo * largo; //Formula para calcular el area del cuadrado
                        System.out.println("El area del cuadrado es: "+area+"cm²");
                        System.out.println("Volviendo al menu...");
                        Thread.sleep(1000);
                    }
                    case 2 -> {
                        System.out.print("Digite el ancho del rectangulo: ");
                        ancho = scanner.nextDouble();
                        System.out.print("Digite el largo del rectangulo: ");
                        largo = scanner.nextDouble();
                        area = ancho * largo; //Formula para calcular el area del rectangulo 
                        System.out.println("El area del rectangulo es: "+area+"cm²");                        
                        Thread.sleep(1000);
                    }
                    case 3 -> {
                        System.out.print("Digite la base del triangulo: ");
                        base = scanner.nextDouble();
                        System.out.print("Digite la altura del triangulo: ");
                        altura = scanner.nextDouble();
                        area = 0.5 * base * altura; //Formula para calcular el area del triangulo (0.5 es equivalente a 1/2)
                        System.out.println("El area del triangulo es: "+area+"cm²");                        
                        Thread.sleep(1000);
                    }
                    case 4 -> {
                        System.out.print("Digite el radio del circulo: ");
                        radio = scanner.nextDouble();
                        area = Math.PI * Math.pow(radio, 2); //Formula para calcular el area del circulo
                        System.out.println("El area del circulo es: "+area+"cm²");
                        Thread.sleep(1000);
                    }
                    case 5 -> { 
                        System.out.println("Saliendo...");
                        Thread.sleep(1000);
                        bandera=false;
                    }
                    default -> System.out.println("Opcion incorrecta");
                }  
            }
        }
        
        //Metodo para calcular Masa
        public void calcularMasa() throws InterruptedException{
                Scanner scanner = new Scanner(System.in);
                double volumen;
                double densidad;
                double masa;
                
                System.out.print("Digite la densidad del cuerpo: ");
                densidad= scanner.nextDouble();
                System.out.print("Digite el volumen del cuerpo: ");
                volumen = scanner.nextDouble();
                masa = volumen * densidad; //Formula para hallar la masa de un cuerpo
                System.out.println("La masa del cuerpo es: " + masa + "kg");  
                System.out.println("Volviendo al menu...");
                Thread.sleep(1000);           
        }
    }
    public static void main(String[] args) throws InterruptedException {
            int opcion;
            boolean bandera = true;
            ClaseCalculadora instancia = new ClaseCalculadora(); //Se instancia la clase con las operaciones para llamarlas luego en el menu
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
                    case 1 -> instancia.calcularDistacia(); //Se instancia cada metodo dentro de la clase ClaseCalculadora
                    case 2 -> instancia.calcularVelocidad();
                    case 3 -> instancia.calcularTiempo();
                    case 4 -> instancia.calcularVolumen();
                    case 5 -> instancia.calcularArea();
                    case 6 -> instancia.calcularMasa();
                    case 7 -> {
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                    }
                    default -> System.out.println("Opción no válida");
            }  
        }
    }
}
