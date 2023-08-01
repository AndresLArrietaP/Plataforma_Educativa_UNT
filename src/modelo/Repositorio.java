/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Repositorio {

    public static int EstuElim = 0;
    public static int ProfElim = 0;
    public static int CurElim = 0;
    public static int matriElim = 0;
    public static int retiroElim=0;

    public static void GuardarRepo() {
        String linea;
        File archivo = new File("repositorio.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            linea = String.valueOf(EstuElim) + ";" + 
                    String.valueOf(ProfElim) + ";" + 
                    String.valueOf(CurElim) + ";" + 
                    String.valueOf(matriElim) + ";" +
                    String.valueOf(retiroElim);
            salida.println(linea);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void CargarRepo() {
        try {
            BufferedReader br;
            String linea;
            String[] s;
            int elimEstu,elimProf, elimCur, elimMatri, elimRetiro;
            br = new BufferedReader(new FileReader("repositorio.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                elimEstu = Integer.parseInt(s[0].trim());
                elimProf = Integer.parseInt(s[1].trim());
                elimCur = Integer.parseInt(s[2].trim());
                elimMatri = Integer.parseInt(s[3].trim());
                elimRetiro = Integer.parseInt(s[4].trim());
                EstuElim = elimEstu;
                ProfElim = elimProf;
                CurElim = elimCur;
                matriElim = elimMatri;
                retiroElim = elimRetiro;
            }

            br.close();
        } catch (Exception e) {
        }
    }
}
