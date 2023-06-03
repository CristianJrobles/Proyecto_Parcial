
package com.mycompany.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArchivoPlano {
    File archivo = new File("Equipos.txt");
    File archivo2 = new File("Partidos.txt");
    
    //Apartado de gestion de equipos
    public void guardar(String fila){
        try {
            FileWriter fw = new FileWriter(archivo,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.append(fila);
            pw.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error de Archivo");
        }
    }//cierre de guardar
    
    public ArrayList<Object[]>leer(){
        ArrayList<Object[]> datos=new ArrayList();
        try {
            FileReader fr =new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea="";
            while ((linea=br.readLine())!=null) {                
                Object[] objlinea=linea.split(";");
                datos.add(objlinea);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    
        return datos;
    }//cierre de Array
    
    //Eliminar
    public boolean eliminar(String codigo){
        ArrayList<Object[]> temporal =this.leer();
        boolean bandera=false;
        this.vaciarArchivo();
        
        for (Object[] temp : temporal){
            if (!String.valueOf(temp[0]).equals(codigo)) {
                String archivoTemp = String.valueOf(temp[0])+";"
                        +String.valueOf(temp[1])+";"
                        +String.valueOf(temp[2])+"\n";
                this.guardar(archivoTemp);
            }
            else{
                bandera=true;
            }
        }
        return bandera;
    }//cierre de eliminar
    
    public void vaciarArchivo(){
        try {
            FileWriter fw=new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw =new PrintWriter(bw);
            pw.close();
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Archivo");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////
    //Apartado de guardar partidos
    public void guardarPartido(String fila2){
        try {
            FileWriter fw2 = new FileWriter(archivo2,true);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            PrintWriter pw2 = new PrintWriter(bw2);
            pw2.append(fila2);
            pw2.close();
            bw2.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//cierre de guardar
    
    public ArrayList<Object[]>leer2(){
        ArrayList<Object[]> partidos=new ArrayList();
        try {
            FileReader fr2 =new FileReader(archivo2);
            BufferedReader br2 = new BufferedReader(fr2);
            String linea="";
            while ((linea=br2.readLine())!=null) {                
                Object[] objlinea2=linea.split(";");
                partidos.add(objlinea2);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    
        return partidos;
    }//cierre de Array
    
    
}
