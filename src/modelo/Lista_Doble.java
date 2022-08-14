package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Lista_Doble {

    private Nodo inicio;
    private Nodo fin;

    public Lista_Doble() {
        inicio = null;
        fin = null;
        CargarAlumno();

    }

    // Inserta alumno al inicio de la lista doble
    public void insertarAlum(Alumno alum) {
        if (inicio == null) {
            inicio = new Nodo(alum, null, null);
            fin = inicio;
        } else {
            Nodo nuevo = new Nodo(alum, null, inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    // Impresion del final al inicio
    public String MostrarAlum() {
        Nodo temp = fin;
        String alumnos = "";
        while (temp != null) {
            if (temp.getAlum() != null) {
                alumnos = alumnos + temp.getAlum();
            }
            temp = temp.getAnterior();
        }
        return alumnos;
    }

    
    public Alumno buscarAlumno(int codigo) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getAlum().getCodAlumno() == codigo) {
                return temp.getAlum();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }

    
    public void eliminarAlum(int codigo) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getAlum().getCodAlumno() == codigo) {
                
                if (temp == inicio && temp == fin) {
                    temp = null;
                    inicio = temp;
                    fin = temp;
                    return;
                } else if (temp == inicio) {
                    temp = temp.getSiguiente();
                    temp.setAnterior(null);
                    inicio = temp;
                    return;
                } else if (temp == fin) {
                    temp = temp.getAnterior();
                    temp.setSiguiente(null);
                    fin = temp;                    
                } else {
                    temp.getSiguiente().setAnterior(temp.getAnterior());
                    temp.getAnterior().setSiguiente(temp.getSiguiente());
                    return;
                }  
            }
            temp = temp.getSiguiente();
        }
    }

    public void cajaAlum(JComboBox caj) {
        Nodo temp = fin;
        while (temp != null) {
            if (temp.getAlum() != null) {
                caj.addItem(temp.getAlum().getCodAlumno());

            }
            temp = temp.getAnterior();
        }
    }

    public int codigoCorrelativo() {
        Nodo temp = fin;
        int cont = 202010001;
        while (temp != null) {
            if (temp.getAlum() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont;
    }

    public int tamañoAlum() {
        Nodo temp = fin;
        int cont = 0;
        while (temp != null) {
            if (temp.getAlum() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont;
    }

    public boolean ValidarDni(String DNI) {
        Nodo temp = fin;
        while (temp != null) {
            if (temp.getAlum().getDni().equals(DNI)) {
                return true;
            }
            temp = temp.getAnterior();
        }
        return false;
    }

    public void Lista_Alumnos(DefaultTableModel model) {
        Nodo temp = fin;
        if (fin == null && inicio == null) {
            
        } else {
            while (temp != null) {
                if (temp.getAlum() != null) {
                    Object[] alum = {String.valueOf(temp.getAlum().getCodAlumno()),
                        temp.getAlum().getNombres(), temp.getAlum().getApellidos(),
                        temp.getAlum().getDni(), temp.getAlum().getEdad(),
                        String.valueOf(temp.getAlum().getCelular()), nombreEstado(temp.getAlum().getEstado())};
                    model.addRow(alum);

                }
                temp = temp.getAnterior();
            }
        }

    }

    String nombreEstado(int i) {
        switch (i) {
            case 0:
                return "REGISTRADO";
            case 1:
                return "MATRICULADO";
            case 2:
                return "RETIRADO";
            default:
                return null;
        }
    }

    public void GuardarAlumnos() {
        Nodo temp = fin;
        String linea;
        File archivo = new File("alumnos.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            while (temp != null) {
                if (temp.getAlum() != null) {
                    linea = temp.getAlum().getCodAlumno() + ";"
                            + temp.getAlum().getNombres() + ";"
                            + temp.getAlum().getApellidos() + ";"
                            + temp.getAlum().getDni() + ";"
                            + temp.getAlum().getEdad() + ";"
                            + temp.getAlum().getCelular() + ";"
                            + temp.getAlum().getEstado();
                    salida.println(linea);
                }
                temp = temp.getAnterior();
            }
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void CargarAlumno() {
        try {
            BufferedReader br;
            String linea, nombres, apellidos, dni;
            String[] s;
            int codAlumno, edad, celular, estado;
            br = new BufferedReader(new FileReader("alumnos.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                codAlumno = Integer.parseInt(s[0].trim());
                nombres = s[1].trim();
                apellidos = s[2].trim();
                dni = s[3].trim();
                edad = Integer.parseInt(s[4].trim());
                celular = Integer.parseInt(s[5].trim());
                estado = Integer.parseInt(s[6].trim());
                Alumno alumno = new Alumno(codAlumno, nombres, apellidos, dni, edad, celular, estado);
                insertarAlum(alumno);
            }
            br.close();
        } catch (Exception e) {
        }
    }

    /*
        Espacio pa diferenciar jaja  
        Espacio pa diferenciar jaja  
        Espacio pa diferenciar jaja  
        Espacio pa diferenciar jaja  
        Espacio pa diferenciar jaja  
        Espacio pa diferenciar jaja  
        Espacio pa diferenciar jaja  
     */
    //Curso
    public void insertarCurso(Curso curso) {
        if (inicio == null) {
            inicio = new Nodo(curso, null, null);
            fin = inicio;
        } else {
            Nodo nuevo = new Nodo(curso, null, inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public String MostrarCurso() {
        Nodo temp = fin;
        String Cursos = "";
        while (temp != null) {
            if (temp.getCurso() != null) {
                Cursos = Cursos + temp.getCurso();
            }
            temp = temp.getAnterior();
        }
        return Cursos;
    }

    public Curso buscarCurso(int cod) {
        Nodo temp = inicio;

        while (temp != null) {
            if (temp.getCurso().getCodCurso() == cod) {

                break;
            }
            temp = temp.getSiguiente();
        }
        return temp.getCurso();
    }

    public void cajaCurso(JComboBox caja) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getCurso() != null) {
                caja.addItem(temp.getCurso().getCodCurso());
            }
            temp = temp.getSiguiente();
        }
    }

    public int codigoCorelativoCur() {
        Nodo temp = fin;
        int cont = 101;
        while (temp != null) {
            if (temp.getCurso() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont;
    }

    public int tamañoCurso() {
        Nodo temp = fin;
        int cont = 0;
        while (temp != null) {
            if (temp.getCurso() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont;
    }

    public void Lista_Cursos(DefaultTableModel model) {
        Nodo temp = fin;
        if (fin == null && inicio == null) {
        } else {
            while (temp != null) {
                if (temp.getCurso() != null) {
                    Object[] fila = {String.valueOf(temp.getCurso().getCodCurso()),
                        temp.getCurso().getAsignatura(), nombreCiclo(temp.getCurso().getCiclo()),
                        temp.getCurso().getCreditos(), temp.getCurso().getHoras()};
                    model.addRow(fila);
                }
                temp = temp.getAnterior();
            }
        }
    }

    public String nombreCiclo(int i) {
        switch (i) {
            case 0:
                return "PRIMERO";
            case 1:
                return "SEGUNDO";
            case 2:
                return "TERCERO";
            case 3:
                return "CUARTO";
            case 4:
                return "QUINTO";
            case 5:
                return "SEXTO";
            default:
                return null;
        }
    }

    public void GuardarCurso() {
        Nodo temp = fin;
        String linea;
        File archivo = new File("alumnos.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            while (temp != null) {
                if (temp.getAlum() != null) {
                    linea = temp.getAlum().getCodAlumno() + ";"
                            + temp.getAlum().getNombres() + ";"
                            + temp.getAlum().getApellidos() + ";"
                            + temp.getAlum().getDni() + ";"
                            + temp.getAlum().getEdad() + ";"
                            + temp.getAlum().getCelular() + ";"
                            + temp.getAlum().getEstado();
                    salida.println(linea);
                }
                temp = temp.getAnterior();
            }
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void CargarCurso() {
        try {
            BufferedReader br;
            String linea, nombres, apellidos, dni;
            String[] s;
            int codAlumno, edad, celular, estado;
            br = new BufferedReader(new FileReader("alumnos.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                codAlumno = Integer.parseInt(s[0].trim());
                nombres = s[1].trim();
                apellidos = s[2].trim();
                dni = s[3].trim();
                edad = Integer.parseInt(s[4].trim());
                celular = Integer.parseInt(s[5].trim());
                estado = Integer.parseInt(s[6].trim());
                Alumno alumno = new Alumno(codAlumno, nombres, apellidos, dni, edad, celular, estado);
                insertarAlum(alumno);
            }
            br.close();
        } catch (Exception e) {
        }
    }

    /*
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja 
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
     */
    //matricula
    public void insertarMatricula(Matricula matri) {
        if (inicio == null) {
            inicio = new Nodo(matri, null, null);
            fin = inicio;
        } else {
            Nodo nuevo = new Nodo(matri, null, inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public String MostrarMatricula() {
        Nodo temp = fin;
        String Matricula = "";
        while (temp != null) {
            if (temp.getMatricula() != null) {
                Matricula = Matricula + temp.getAlum();
            }
            temp = temp.getAnterior();
        }
        return Matricula;
    }

    public Matricula buscarMatricula(int Num) {
        Nodo temp = inicio;

        while (temp != null) {
            if (temp.getMatricula().getNumeroMatricula() == Num) {

                break;
            }
            temp = temp.getSiguiente();
        }
        return temp.getMatricula();
    }

    public void Lista_Matricula(DefaultTableModel model) {
        Nodo temp = fin;
        if (fin == null && inicio == null) {
        } else {
            while (temp != null) {
                if (temp.getMatricula() != null) {
                    Object[] fila = {String.valueOf(temp.getCurso().getCodCurso()),
                        temp.getCurso().getAsignatura(), nombreCiclo(temp.getCurso().getCiclo()),
                        temp.getCurso().getCreditos(), temp.getCurso().getHoras()};
                    model.addRow(fila);
                }
                temp = temp.getAnterior();
            }
        }
    }

    public void cajaMatricula(JComboBox caja) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getMatricula() != null) {
                caja.addItem(temp.getMatricula().getNumeroMatricula());
            }
            temp = temp.getSiguiente();
        }
    }

    public int tamañoMatricula() {
        Nodo temp = fin;
        int cont = 0;
        while (temp != null) {
            if (temp.getMatricula() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont;
    }

    //retiro
    public void insertarRetiro(Retiro retiro) {
        if (inicio == null) {
            inicio = new Nodo(retiro, null, null);
            fin = inicio;
        } else {
            Nodo nuevo = new Nodo(retiro, null, inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public String MostrarRetiro() {
        Nodo temp = fin;
        String Retiro = "";
        while (temp != null) {
            if (temp.getMatricula() != null) {
                Retiro = Retiro + temp.getAlum();
            }
            temp = temp.getAnterior();
        }
        return Retiro;
    }

    public boolean buscarRetiro(int Num) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getRetiro().getNumRetiro() == Num) {
                System.out.println(temp.getRetiro());
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false;
    }

}
