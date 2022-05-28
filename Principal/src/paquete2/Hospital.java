
package paquete2;


public class Hospital {
    private String nombreHospital;
    private Ciudad ciudad;
    private int numeroEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;
    private double sueldos;
    private String direccion;

    public Hospital(String n, String d, Ciudad c, int ne, Medico[] m, Enfermero[] e) {
        nombreHospital = n;
        direccion = d;
        numeroEspecialidades = ne;
        ciudad = c;
        medicos = m;
        enfermeros = e;
    }

    

    public void establecerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public void calcularNumeroE() {
        numeroEspecialidades = obtenerMedicos().length + obtenerEnfermeros().length;
    }

    public void establecerMedicos(Medico[] n) {
        medicos = n;
    }

    public void establecerEnfermeros(Enfermero[] n) {
        enfermeros = n;
    }

    public void calcularSueldo() {
        for (int i = 0; i < obtenerMedicos().length; i++) {
            sueldos = sueldos + obtenerMedicos()[i].obtenerSueldo();
        }
        for (int j = 0; j < obtenerEnfermeros().length; j++) {
            sueldos = sueldos + obtenerEnfermeros()[j].obtenerSueldo();
        }
    }

    public void establecerDireccion(String n) {
        direccion = n;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroE() {
        return numeroEspecialidades;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerSueldo() {
        return sueldos;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("HOSPITAL %s\n"
                + "Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n",
                obtenerNombreHospital().toUpperCase(),
                obtenerDireccion(),
                obtenerCiudad().obtenerNombre(),
                obtenerCiudad().obtenerProvincia(),
                obtenerNumeroE());

        cadena = String.format("%s\nListado de médicos\n", cadena);

        for (int i = 0; i < obtenerMedicos().length; i++) {

            cadena = String.format("%s-%s \t - sueldo: %.2f \t - %s\n",
                    cadena,
                    obtenerMedicos()[i].obtenerNombre(),
                    obtenerMedicos()[i].obtenerSueldo(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }

        cadena = String.format("%s\nListado de enfermeros(as)\n", cadena);

        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s-%s \t - sueldo: %.2f \t - %s\n",
                    cadena,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSueldo(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }

        cadena = String.format("%s\n\nTotal de sueldos a pagar por mes: %.2f", cadena, obtenerSueldo());

        return cadena;

    }
}
