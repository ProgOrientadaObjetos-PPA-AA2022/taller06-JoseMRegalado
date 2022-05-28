
package paquete1;
    import paquete2.Ciudad;
    import paquete2.Enfermero;
    import paquete2.Hospital;
    import paquete2.Medico;
    import java.util.Scanner;

public class Principal {
    
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombreH;
        String direccion;
        String ciudad;
        String provincia;
        Medico[] medicos;
        int numeroM;
        String nombreM;
        double sueldoM;
        String especialidadM;
        Enfermero[] enfermeros;
        int numeroE;
        String nombreE;
        double sueldoE;
        String tipoE;
        int numeroEs;

        System.out.println("Ingrese el nombre del Hospital");
        nombreH = entrada.nextLine();
        System.out.println("Ingrese la direccion del Hospital");
        direccion = entrada.nextLine();

        System.out.println("Ingrese el nombre de la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia");
        provincia = entrada.nextLine();
        
        Ciudad c1 = new Ciudad(ciudad, provincia);
        
        
        
        System.out.println("Ingrese el numero de médicos que tiene el hospital");
        numeroM = entrada.nextInt();
        medicos = new Medico[numeroM];
        entrada.nextLine();

        for (int i = 0; i < numeroM; i++) {
            
            System.out.printf("Ingrese el nombre del médico %d\n", i + 1);
            nombreM = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe");
            sueldoM = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese su especialidad");
            especialidadM = entrada.nextLine();

            Medico m1 = new Medico(nombreM, sueldoM, especialidadM);

            medicos[i] = m1;
        }

        System.out.println("Ingrese el número de enfermeros");
        numeroE = entrada.nextInt();
        enfermeros = new Enfermero[numeroE];
        
        entrada.nextLine();

        for (int i = 0; i < numeroE; i++) {
            System.out.printf("Ingrese el nombre del enfermero %d\n", i + 1);
            nombreE = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe");
            sueldoE = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el tipo de contrato");
            tipoE = entrada.nextLine();

            Enfermero e1 = new Enfermero(nombreE, sueldoE, tipoE);

            enfermeros[i] = e1;
            
        }
        numeroEs = numeroM + numeroE;
        
        Hospital eH = new Hospital (nombreH, direccion, c1, numeroEs, medicos, enfermeros);
        eH.calcularSueldo();
        
        
        System.out.printf("\n%s\n", eH);
    }
    
    
}
