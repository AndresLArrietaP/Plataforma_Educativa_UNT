
package modelo;


public class App {
    public static void main(String[] args) {
        //Lista doble enlazada
        Lista_Doble ld= new Lista_Doble();
        //Clase alumno en la que se almacenara
        Alumno alum1 = new Alumno(0001, "Juan", "Iparraguire", "123456789", 12, 123789456, 1);
        Alumno alum2 = new Alumno(0002, "Pepe", "Mago", "213456789", 15, 123456879, 1);
        Alumno alum3 = new Alumno(0003, "Maria", "La del barrio", "312456789", 16, 987654321, 1);
        
        
        //ld.insertarAlum(alum1);
       //ld.insertarAlum(alum2);
        //ld.insertarAlum(alum3);
        
        //ld.GuardarAlumnos();
        //System.out.println(ld.buscarAlumno(0004).toString());
        //ld.eliminarAlum(0003);
        //ld.eliminarAlum(0002);
        //ld.Mostrar();
        //Alumno alum4 = new Alumno(0004, "Ramon", "Ramos", "412356789", 10, 456789132, 1);
        //ld.insertarAlum(alum4);
        //ld.Mostrar();
        //ld.Mostrar();
        //Crea el Curso
        Curso curso1 = new Curso(0001, "Literatura", 3, 5, 8);
        Curso curso2 = new Curso(0002, "Matematicas", 1, 4, 7);
        Curso curso3 = new Curso(0003, "Programacion", 4, 3, 2);
        Curso curso4 = new Curso(0004, "Razonamiento Matematico", 5, 2, 4);
        
        ld.insertarCurso(curso1);
        ld.insertarCurso(curso2);
        ld.insertarCurso(curso3);
        ld.insertarCurso(curso4);
        //ld.buscarCurso(0003);
        System.out.println(ld.MostrarCurso());
        
        //Crea la Matricula
        
        Matricula matricula1 = new Matricula(1, 1, 1, "01/05/2022", "05:02:25");
        Matricula matricula2 = new Matricula(2, 2, 1, "01/05/2022", "06:25:24");
        Matricula matricula3 = new Matricula(3, 3, 2, "01/05/2022", "01:30:20");
        Matricula matricula4 = new Matricula(4, 4, 3, "01/05/2022", "02:25:02");
        
        ld.insertarMatricula(matricula1);
        ld.insertarMatricula(matricula2);
        ld.insertarMatricula(matricula3);
        ld.insertarMatricula(matricula4);
        
        //System.out.println(ld.MostrarMatricula());
        
        //Crea el retiro
        Retiro retiro1 = new Retiro(1, 1, "02/05/2022", "02:02:24");
        Retiro retiro2 = new Retiro(1, 1, "02/05/2022", "02:02:24");
        Retiro retiro3 = new Retiro(1, 1, "02/05/2022", "02:02:24");
        Retiro retiro4 = new Retiro(1, 1, "02/05/2022", "02:02:24");
        
        ld.insertarRetiro(retiro1);
        ld.insertarRetiro(retiro2);
        ld.insertarRetiro(retiro3);
        ld.insertarRetiro(retiro4);
        
        //System.out.println(ld.MostrarRetiro());
        
        
    }
}
