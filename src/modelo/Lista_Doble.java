package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Lista_Doble {

    private Nodo inicio;
    private Nodo fin;

    public Lista_Doble() {
        inicio = null;
        fin = null;

    }

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
                System.out.println(temp.getAlum());
                break;
            }
            temp = temp.getSiguiente();
        }
        return temp.getAlum();
    }

    public void eliminarAlum(int codigo) {
        Nodo temp = inicio;
        boolean encontrado = false;
        while (temp != null && !encontrado) {
            encontrado = (temp.getAlum().getCodAlumno() == codigo);
            if (!encontrado) {
                temp = temp.getSiguiente();
            }
        }
        if (encontrado) {
            if (temp == inicio) {
                inicio = temp.getSiguiente();
            } else {
                temp.getAnterior().setSiguiente(temp.getSiguiente());
                if (temp.getSiguiente() != null) {
                    temp.getSiguiente().setAnterior(temp.getAnterior());
                }
            }
            temp = null;
        }
    }

    public void caja(JComboBox caj) {
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
            temp.getAnterior();
        }
        if (cont == 0) {
            return 202010001;
        }
        return cont;
    }

    public int tamaño() {
        Nodo temp = inicio;
        int cont = 0;
        while (temp != null) {
            if (temp.getAlum() != null) {
                cont++;
            }
        }
        return cont;
    }

    public void GuardarAlumnos() {
        try {
            PrintWriter pw;
            String linea;
            Alumno x;
            Nodo temp = inicio;
            pw = new PrintWriter(new FileWriter("alumnos.txt"));
            while (temp != null) {
                linea = temp.getAlum().toString() + "\n";
                temp = temp.getSiguiente();
                pw.println(linea);
            }
            pw.close();
        } catch (Exception e) {
        }
    }

    public boolean ValidarDni(String DNI) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getAlum().getDni().equals(DNI)) {
                return true;
            }
        }
        return false;
    }

    public void Lista_Alumnos(DefaultTableModel model) {
        Nodo temp = fin;
        while (temp != null) {
            if (temp.getAlum() != null) {
                Object[] alum = {String.valueOf(temp.getAlum().getCodAlumno()),
                    temp.getAlum().getNombres(), temp.getAlum().getApellidos(),
                    temp.getAlum().getDni(), temp.getAlum().getEdad(),
                    String.valueOf(temp.getAlum().getCelular()), nombreEstado(temp.getAlum().getEstado())};
                model.addRow(alum);
                
            }
            temp=temp.getAnterior();
            
        }
    }

    String nombreEstado(int i) {
        switch (i) {
            case 1:
                return "REGISTRADO";
            case 2:
                return "MATRICULADO";
            case 3:
                return "RETIRADO";
            default:
                return null;
        }
    }

    /*public void CargarAlumno() {
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
                
            }
            br.close();
        } catch (Exception e) {
        }
    }*/
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

    public boolean buscarCurso(int cod) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getCurso().getCodCurso() == cod) {
                System.out.println(temp.getCurso());
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false;
    }

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

    public boolean buscarMatricula(int Num) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getMatricula().getNumeroMatricula() == Num) {
                System.out.println(temp.getMatricula());
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false;
    }

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
