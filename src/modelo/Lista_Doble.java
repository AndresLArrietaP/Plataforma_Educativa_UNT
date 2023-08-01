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

    }
    
    public void insertarProf(Profesor prof) {
        if (inicio == null) {
            inicio = new Nodo(prof, null, null);
            fin = inicio;
        } else {
            Nodo nuevo = new Nodo(prof, null, inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }
    
    public void insertarEstu(Estudiante estu) {
        if (inicio == null) {
            inicio = new Nodo(estu, null, null);
            fin = inicio;
        } else {
            Nodo nuevo = new Nodo(estu, null, inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public Estudiante buscarEstudiante(int codigo) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getEstu() == null) {
            } else {
                if (temp.getEstu().getCodEstudiante() == codigo) {
                    break;
                }
            }
            temp = temp.getSiguiente();
        }
        return temp.getEstu();
    }
    
    public Profesor buscarProfesor(int codigo) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getProf() == null) {
            } else {
                if (temp.getProf().getCodprofesor() == codigo) {
                    break;
                }
            }
            temp = temp.getSiguiente();
        }
        return temp.getProf();
    }

    public void eliminarEstu(int codigo) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getEstu().getCodEstudiante() == codigo) {
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
                    return;
                } else {
                    temp.getSiguiente().setAnterior(temp.getAnterior());
                    temp.getAnterior().setSiguiente(temp.getSiguiente());
                    return;
                }
            }
            temp = temp.getSiguiente();
        }
    }

    public void eliminarProf(int codigo) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getProf().getCodprofesor() == codigo) {
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
                    return;
                } else {
                    temp.getSiguiente().setAnterior(temp.getAnterior());
                    temp.getAnterior().setSiguiente(temp.getSiguiente());
                    return;
                }
            }
            temp = temp.getSiguiente();
        }
    }
    
    public void cajaEstu(JComboBox caja) {
        Nodo temp = fin;
        while (temp != null) {
            if (temp.getEstu() != null) {
                caja.addItem(temp.getEstu().getCodEstudiante());
            }
            temp = temp.getAnterior();
        }
    }
    
    public void cajaProf(JComboBox cajp) {
        Nodo temp = fin;
        while (temp != null) {
            if (temp.getProf() != null) {
                cajp.addItem(temp.getProf().getCodprofesor());
            }
            temp = temp.getAnterior();
        }
    }

    public int codigoCorrelativoE() {
        Nodo temp = fin;
        int cont = 202010001;
        while (temp != null) {
            if (temp.getEstu() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont + Repositorio.EstuElim;
    }
    
    public int codigoCorrelativoP() {
        Nodo temp = fin;
        int cont = 202030001;
        while (temp != null) {
            if (temp.getProf() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont + Repositorio.ProfElim;
    }

    public int tamañoEstu() {
        Nodo temp = fin;
        int cont = 0;
        while (temp != null) {
            if (temp.getEstu() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont;
    }
    
    public int tamañoProf() {
        Nodo temp = fin;
        int cont = 0;
        while (temp != null) {
            if (temp.getProf() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont;
    }

    public boolean ValidarDniE(String DNI) {
        Nodo temp = fin;
        while (temp != null) {
            if (temp.getEstu().getDni().equals(DNI)) {
                return true;
            }
            temp = temp.getAnterior();
        }
        return false;
    }

    public boolean ValidarDniP(String DNI) {
        Nodo temp = fin;
        while (temp != null) {
            if (temp.getProf().getDni().equals(DNI)) {
                return true;
            }
            temp = temp.getAnterior();
        }
        return false;
    }
    
    public void Lista_Estudiantes(DefaultTableModel model) {
        Nodo temp = fin;
        if (fin == null && inicio == null) {

        } else {
            while (temp != null) {
                if (temp.getEstu() != null) {
                    Object[] estu = {String.valueOf(temp.getEstu().getCodEstudiante()),
                        temp.getEstu().getNombres(), temp.getEstu().getApellidos(),
                        temp.getEstu().getDni(), temp.getEstu().getEdad(),
                        String.valueOf(temp.getEstu().getCelular()), nombreEstado(temp.getEstu().getEstado())};
                    model.addRow(estu);

                }
                temp = temp.getAnterior();
            }
        }
    }
    
    public void Lista_Profesores(DefaultTableModel model) {
        Nodo temp = fin;
        if (fin == null && inicio == null) {

        } else {
            while (temp != null) {
                if (temp.getProf() != null) {
                    Object[] prof = {String.valueOf(temp.getProf().getCodprofesor()),
                        temp.getProf().getNombres(), temp.getProf().getApellidos(),
                        temp.getProf().getDni(), temp.getProf().getEdad(),
                        String.valueOf(temp.getProf().getCelular()), nombreEstadoP(temp.getProf().getEstado())};
                    model.addRow(prof);

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
    
    String nombreEstadoP(int i) {
        switch (i) {
            case 0:
                return "ACTIVO";
            case 1:
                return "ASIGNADO";
            case 2:
                return "INACTIVO";
            default:
                return null;
        }
    }

    public void GuardarEstudiantes() {
        Nodo temp = fin;
        String linea;
        File archivo = new File("estudiantes.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            while (temp != null) {
                if (temp.getEstu() != null) {
                    linea = temp.getEstu().getCodEstudiante() + ";"
                            + temp.getEstu().getNombres() + ";"
                            + temp.getEstu().getApellidos() + ";"
                            + temp.getEstu().getDni() + ";"
                            + temp.getEstu().getEdad() + ";"
                            + temp.getEstu().getCelular() + ";"
                            + temp.getEstu().getEstado();
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

    public void CargarEstudiante() {
        try {
            BufferedReader br;
            String linea, nombres, apellidos, dni;
            String[] s;
            int codEstudiante, edad, celular, estado;
            br = new BufferedReader(new FileReader("estudiantes.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                codEstudiante = Integer.parseInt(s[0].trim());
                nombres = s[1].trim();
                apellidos = s[2].trim();
                dni = s[3].trim();
                edad = Integer.parseInt(s[4].trim());
                celular = Integer.parseInt(s[5].trim());
                estado = Integer.parseInt(s[6].trim());
                Estudiante estudiante = new Estudiante(codEstudiante, nombres, apellidos, dni, edad, celular, estado);
                insertarEstu(estudiante);
            }
            br.close();
        } catch (Exception e) {
        }
    }

    public void GuardarProfesores() {
        Nodo temp = fin;
        String linea;
        File archivo = new File("profesores.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            while (temp != null) {
                if (temp.getProf() != null) {
                    linea = temp.getProf().getCodprofesor() + ";"
                            + temp.getProf().getNombres() + ";"
                            + temp.getProf().getApellidos() + ";"
                            + temp.getProf().getDni() + ";"
                            + temp.getProf().getEdad() + ";"
                            + temp.getProf().getCelular() + ";"
                            + temp.getProf().getEstado();
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

    public void CargarProfesor() {
        try {
            BufferedReader br;
            String linea, nombres, apellidos, dni;
            String[] s;
            int codAlumno, edad, celular, estado;
            br = new BufferedReader(new FileReader("profesores.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                codAlumno = Integer.parseInt(s[0].trim());
                nombres = s[1].trim();
                apellidos = s[2].trim();
                dni = s[3].trim();
                edad = Integer.parseInt(s[4].trim());
                celular = Integer.parseInt(s[5].trim());
                estado = Integer.parseInt(s[6].trim());
                Profesor profesor = new Profesor(codAlumno,edad, celular, estado, nombres, apellidos, dni);
                insertarProf(profesor);
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
        Espacio pa diferenciar jaja  
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

    public Curso buscarCurso(int cod) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getCurso() == null) {
            } else {
                if (temp.getCurso().getCodCurso() == cod) {
                    break;
                }
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
        return cont + Repositorio.CurElim;
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
        Nodo temp = inicio;
        if (fin == null && inicio == null) {
        } else {
            while (temp != null) {
                if (temp.getCurso() != null) {
                    Object[] fila = {String.valueOf(temp.getCurso().getCodCurso()),
                        temp.getCurso().getAsignatura(), nombreCiclo(temp.getCurso().getCiclo()),
                        temp.getCurso().getCreditos(), temp.getCurso().getHoras(), temp.getCurso().getVacantes()};
                    model.addRow(fila);
                }
                temp = temp.getSiguiente();
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
            case 6:
                return "SEPTIMO";
            case 7:
                return "OCTAVO";
            case 8:
                return "NOVENO";
            case 9:
                return "DECIMO";
            default:
                return null;
        }
    }

    public void eliminarCurso(int codigo) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getCurso().getCodCurso() == codigo) {
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

    public void GuardarCurso() {
        Nodo temp = fin;
        String linea;
        File archivo = new File("cursos.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            while (temp != null) {
                if (temp.getCurso() != null) {
                    linea = temp.getCurso().getCodCurso() + ";"
                            + temp.getCurso().getAsignatura() + ";"
                            + temp.getCurso().getCiclo() + ";"
                            + temp.getCurso().getCreditos() + ";"
                            + temp.getCurso().getHoras()+ ";"
                            + temp.getCurso().getVacantes()+ ";"
                            + temp.getCurso().getMatriculados();
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
            int codCurso, ciclo, creditos, horas,vacantes,matriculados;
            String asignatura, linea;
            String[] s;
            br = new BufferedReader(new FileReader("cursos.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                codCurso = Integer.parseInt(s[0].trim());
                asignatura = s[1].trim();
                ciclo = Integer.parseInt(s[2].trim());
                creditos = Integer.parseInt(s[3].trim());
                horas = Integer.parseInt(s[4].trim());
                vacantes = Integer.parseInt(s[5].trim());
                matriculados = Integer.parseInt(s[6].trim());
                Curso curso = new Curso(codCurso, asignatura, ciclo, creditos, horas,vacantes,matriculados);
                insertarCurso(curso);
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
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
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

    public Matricula buscarMatricula(int Num) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getMatricula() == null) {
            } else {
                if (temp.getMatricula().getNumeroMatricula() == Num) {
                    break;
                }
            }
            temp = temp.getSiguiente();
        }
        return temp.getMatricula();
    }

    public Matricula buscarMatriculaxAlum(int Num) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getMatricula() == null) {
            } else {
                if (temp.getMatricula().getCodigoEstudiante() == Num) {
                    break;
                }
            }
            temp = temp.getSiguiente();
        }
        return temp.getMatricula();
    }
    
    public Matricula buscarMatriculaxProf(int Num) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getMatricula() == null) {
            } else {
                if (temp.getMatricula().getCodigoProfesor() == Num) {
                    break;
                }
            }
            temp = temp.getSiguiente();
        }
        return temp.getMatricula();
    }

    public int buscarMatriculaxCurso(int Num) {
        Nodo temp = inicio;
        int cant = 0;
        while (temp != null) {
            if (temp.getMatricula() == null) {
            } else {
                if (temp.getMatricula().getCodigoCurso() == Num) {
                    if (buscarEstudiante(temp.getMatricula().getCodigoEstudiante()).getEstado() == 1) {
                        cant++;
                    }
                }
            }
            temp = temp.getSiguiente();
        }
        return cant;
    }

    public void Lista_Matricula(DefaultTableModel model) {
        Nodo temp = inicio;
        if (fin == null && inicio == null) {
        } else {
            while (temp != null) {
                if (temp.getMatricula() != null) {
                    Object[] fila = {temp.getMatricula().getNumeroMatricula(),
                        temp.getMatricula().getCodigoEstudiante(),
                        buscarEstudiante(temp.getMatricula().getCodigoEstudiante()).getNombres(),
                        buscarEstudiante(temp.getMatricula().getCodigoEstudiante()).getApellidos(),
                        temp.getMatricula().getCodigoCurso(),
                        buscarCurso(temp.getMatricula().getCodigoCurso()).getAsignatura(),
                        buscarProfesor(temp.getMatricula().getCodigoProfesor()).getApellidos(),
                        temp.getMatricula().getFecha(),
                        temp.getMatricula().getHora(),
                        activo(buscarEstudiante(temp.getMatricula().getCodigoEstudiante()).getEstado())};
                    model.addRow(fila);
                }
                temp = temp.getSiguiente();
            }
        }
    }

    String activo(int i) {
        return i == 1 ? "Sí" : "No";
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

    public void eliminarMatricula(int codigo) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getMatricula().getNumeroMatricula() == codigo) {
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

    public int codigoCorelativoMatri() {
        Nodo temp = fin;
        int cont = 100001;
        while (temp != null) {
            if (temp.getMatricula() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont + Repositorio.matriElim;
    }

    public void GuardarMatricula() {
        Nodo temp = fin;
        String linea;
        File archivo = new File("matriculas.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            while (temp != null) {
                if (temp.getMatricula() != null) {
                    linea = temp.getMatricula().getNumeroMatricula() + ";"
                            + temp.getMatricula().getCodigoEstudiante() + ";"
                            + temp.getMatricula().getCodigoProfesor() + ";"
                            + temp.getMatricula().getCodigoCurso() + ";"
                            + temp.getMatricula().getFecha() + ";"
                            + temp.getMatricula().getHora();
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

    public void CargarMatricula() {
        try {
            BufferedReader br;
            int numMatricula, codAlumno, codProfesor, codCurso;
            String fecha, hora, linea;
            String[] s;
            br = new BufferedReader(new FileReader("matriculas.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                numMatricula = Integer.parseInt(s[0].trim());
                codAlumno = Integer.parseInt(s[1].trim());
                codProfesor = Integer.parseInt(s[2].trim());
                codCurso = Integer.parseInt(s[3].trim());
                fecha = s[4].trim();
                hora = s[5].trim();
                Matricula matricula = new Matricula(numMatricula, codAlumno, codProfesor, codCurso, fecha, hora);
                insertarMatricula(matricula);
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
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
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

    public Retiro buscarRetiro(int Num) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getRetiro() == null) {

            } else {
                if (temp.getRetiro().getNumRetiro() == Num) {
                    break;
                }
            }

            temp = temp.getSiguiente();
        }
        return temp.getRetiro();
    }

    public int codigoCorelativoRetiro() {
        Nodo temp = fin;
        int cont = 200001;
        while (temp != null) {
            if (temp.getRetiro() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont + Repositorio.retiroElim;
    }

    public void eliminarRetiro(int codigo) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getRetiro().getNumRetiro() == codigo) {

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

    public int tamañoRetiro() {
        Nodo temp = fin;
        int cont = 0;
        while (temp != null) {
            if (temp.getRetiro() != null) {
                cont++;
            }
            temp = temp.getAnterior();
        }
        return cont;
    }

    public void cajaRetiro(JComboBox caja) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getRetiro() != null) {
                caja.addItem(temp.getRetiro().getNumRetiro());
            }
            temp = temp.getSiguiente();
        }
    }

    public void Lista_Retiro(DefaultTableModel model) {
        Nodo temp = inicio;
        if (fin == null && inicio == null) {
        } else {
            while (temp != null) {
                if (temp.getRetiro() != null) {
                    Object[] fila = {temp.getRetiro().getNumRetiro(),
                        temp.getRetiro().getNumMatricula(),
                        buscarEstudiante(buscarMatricula(temp.getRetiro().getNumMatricula()).getCodigoEstudiante()).getNombres(),
                        buscarEstudiante(buscarMatricula(temp.getRetiro().getNumMatricula()).getCodigoEstudiante()).getApellidos(),
                        buscarCurso(buscarMatricula(temp.getRetiro().getNumMatricula()).getCodigoCurso()).getAsignatura(),
                        buscarProfesor(buscarMatricula(temp.getRetiro().getNumMatricula()).getCodigoProfesor()).getApellidos(),
                        temp.getRetiro().getFecha(), temp.getRetiro().getHora()};
                    model.addRow(fila);
                }
                temp = temp.getSiguiente();
            }
        }
    }

    public void GuardarRetiro() {
        Nodo temp = fin;
        String linea;
        File archivo = new File("Retiros.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            while (temp != null) {
                if (temp.getRetiro() != null) {
                    linea = temp.getRetiro().getNumRetiro() + ";"
                            + temp.getRetiro().getNumMatricula() + ";"
                            + temp.getRetiro().getFecha() + ";"
                            + temp.getRetiro().getHora();
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

    public void CargarRetiro() {
        try {
            BufferedReader br;
            int numRetiro, numMatricula;
            String fecha, hora, linea;
            String[] s;
            br = new BufferedReader(new FileReader("Retiros.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                numRetiro = Integer.parseInt(s[0].trim());
                numMatricula = Integer.parseInt(s[1].trim());
                fecha = s[2].trim();
                hora = s[3].trim();
                Retiro retiro = new Retiro(numRetiro, numMatricula, fecha, hora);
                insertarRetiro(retiro);
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
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
    Espacio pa diferenciar jaja  
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
    public String MostrarEstuVigente() {
        Nodo temp = fin;
        String estudiantes = "";
        while (temp != null) {

            if (temp.getEstu() != null) {
                if (temp.getEstu().getEstado() == 1) {
                    estudiantes = estudiantes + "\n CÓDIGO    : " + temp.getEstu().getCodEstudiante()
                            + "\n NOMBRES   : " + temp.getEstu().getNombres()
                            + "\n APELLIDOS : " + temp.getEstu().getApellidos()
                            + "\n DNI       : " + temp.getEstu().getDni()
                            + "\n EDAD      : " + temp.getEstu().getEdad()
                            + "\n CELULAR   : " + temp.getEstu().getCelular()
                            + "\n ESTADO    : " + nombreEstado(temp.getEstu().getEstado())
                            + "\n-------------------------------------------------------------------------";
                }

            }

            temp = temp.getAnterior();
        }
        return estudiantes;
    }

    public String MostrarEstuPendiente() {
        Nodo temp = fin;
        String estudiantes = "";
        while (temp != null) {

            if (temp.getEstu() != null) {
                if (temp.getEstu().getEstado() == 0) {
                    estudiantes = estudiantes + "\n CÓDIGO    : " + temp.getEstu().getCodEstudiante()
                            + "\n NOMBRES   : " + temp.getEstu().getNombres()
                            + "\n APELLIDOS : " + temp.getEstu().getApellidos()
                            + "\n DNI       : " + temp.getEstu().getDni()
                            + "\n EDAD      : " + temp.getEstu().getEdad()
                            + "\n CELULAR   : " + temp.getEstu().getCelular()
                            + "\n ESTADO    : " + nombreEstado(temp.getEstu().getEstado())
                            + "\n-------------------------------------------------------------------------";
                }

            }

            temp = temp.getAnterior();
        }
        return estudiantes;
    }
    
    public String MostrarEstuRetirado() {
        Nodo temp = fin;
        String estudiantes = "";
        while (temp != null) {

            if (temp.getEstu() != null) {
                if (temp.getEstu().getEstado() == 2) {
                    estudiantes = estudiantes + "\n CÓDIGO    : " + temp.getEstu().getCodEstudiante()
                            + "\n NOMBRES   : " + temp.getEstu().getNombres()
                            + "\n APELLIDOS : " + temp.getEstu().getApellidos()
                            + "\n DNI       : " + temp.getEstu().getDni()
                            + "\n EDAD      : " + temp.getEstu().getEdad()
                            + "\n CELULAR   : " + temp.getEstu().getCelular()
                            + "\n ESTADO    : " + nombreEstado(temp.getEstu().getEstado())
                            + "\n-------------------------------------------------------------------------";
                }

            }

            temp = temp.getAnterior();
        }
        return estudiantes;
    }

    public void Eliminar_Retirados(){
        Nodo temp = fin;
        while (temp != null) {

            if (temp.getEstu() != null) {
                if (temp.getEstu().getEstado() == 2) {
                    Matricula mat=buscarMatriculaxAlum(temp.getEstu().getCodEstudiante());
                    eliminarMatricula(mat.getNumeroMatricula());
                    Estudiante est = buscarEstudiante(mat.getCodigoEstudiante());
                    est.setEstado(0);
                }

            }

            temp = temp.getAnterior();
        }
    
    }
    
    public String MostrarMatriculadosCurso() {
        Nodo temp = fin;
        String curso = "";
        boolean x = false;
        while (temp != null) {

            if (temp.getCurso() != null) {
                curso = curso + "\n------------------------------------------------\n"
                        + "Curso:  " + temp.getCurso().getAsignatura() + "\n";
                int codcurso = temp.getCurso().getCodCurso();
                Nodo aux = fin;
                while (aux != null) {

                    if (aux.getMatricula() != null) {
                        Matricula m = buscarMatricula(aux.getMatricula().getNumeroMatricula());
                        if (m.getCodigoCurso() == codcurso) {
                            int estado = buscarEstudiante(m.getCodigoEstudiante()).getEstado();
                            if (estado == 1) {
                                if (!x) {
                                    x = true;
                                }
                                curso = curso + "\nESTUDIANTE : " + buscarEstudiante(m.getCodigoEstudiante()).getNombres()
                                        + " " + buscarEstudiante(m.getCodigoEstudiante()).getApellidos() + "\n";
                            }
                        }

                    }
                    aux = aux.getAnterior();

                }

            }

            temp = temp.getAnterior();
        }
        return curso;
    }
    
    public String MostrarMatriculadosProfesor() {
        Nodo temp = fin;
        String profesor = "";
        boolean x = false;
        while (temp != null) {

            if (temp.getProf() != null) {
                profesor = profesor + "\n------------------------------------------------\n"
                        + "Profesor:  " + temp.getProf().getNombres() + "\n";
                int codprof = temp.getProf().getCodprofesor();
                Nodo aux = fin;
                while (aux != null) {

                    if (aux.getMatricula() != null) {
                        Matricula m = buscarMatricula(aux.getMatricula().getNumeroMatricula());
                        if (m.getCodigoProfesor() == codprof) {
                            int estado = buscarEstudiante(m.getCodigoEstudiante()).getEstado();
                            if (estado == 1) {
                                if (!x) {
                                    x = true;
                                }
                                profesor = profesor + "\nESTUDIANTE : " + buscarEstudiante(m.getCodigoEstudiante()).getNombres()
                                        + " " + buscarEstudiante(m.getCodigoEstudiante()).getApellidos() + "\n";
                            }
                        }

                    }
                    aux = aux.getAnterior();

                }

            }

            temp = temp.getAnterior();
        }
        return profesor;
    }
    
    public String CursosdeProfesor(int codprof) {
        Nodo temp = fin;
        String profesor = "";
        boolean x = false;
        while (temp != null) {

            if (temp.getProf() != null) {
                //int codprof = temp.getProf().getCodprofesor();
                //int num = temp.getMatricula().getNumeroMatricula();
                Nodo aux = fin;
                while (aux != null) {

                    if (aux.getMatricula() != null) {
                        Matricula m = buscarMatricula(aux.getMatricula().getNumeroMatricula());
                        if (m.getCodigoProfesor() == codprof ) {
                            //int estado = buscarEstudiante(m.getCodigoEstudiante()).getEstado();
                            //if (estado == 1) {
                                if (!x) {
                                    x = true;
                                }
                                profesor = profesor + "\nASIGNATURA           : " + buscarCurso(m.getCodigoCurso()).getAsignatura() + "\n"
                                                    + "\nCICLO                : " + buscarCurso(m.getCodigoCurso()).getCiclo() + "\n"
                                                    + "\nCANTIDAD DE CRÉDITOS : " + buscarCurso(m.getCodigoCurso()).getCreditos() + "\n"
                                                    + "\nHORAS                : " + buscarCurso(m.getCodigoCurso()).getHoras() + "\n"
                                                    + "\nVACANTES             : " + buscarCurso(m.getCodigoCurso()).getVacantes() + "\n"
                                                    + "\nMATRICULADOS         : " + buscarCurso(m.getCodigoCurso()).getMatriculados() + "\n";
                            //}
                        }

                    }
                    aux = aux.getAnterior();

                }

            }

            temp = temp.getAnterior();
        }
        return profesor;
    }
}
