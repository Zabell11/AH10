package api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Colegio {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion acceso = new conexion();

    public void listar() {

        String sql = "select * from listado";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getInt(4) + " - " + rs.getInt(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    
    public void crear(String nombre, String apellido, int edad, int nota_promedio) {

        String sql = "insert into listado(nombre,apellido,edad,nota_promedio) values (?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, edad);
            ps.setInt(4, nota_promedio);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    public void modificar(estudiante datos) {

        
        String sql = "update listado set nombre=?, apellido=?, edad=?, nota_promedio=? where id_estudiante=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, datos.getNombre());
            ps.setString(2, datos.getApellido());
            ps.setInt(3,datos.getEdad());
            ps.setInt(4, datos.getNota_promedio());
            ps.setInt(5, datos.getId_estudiante());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    public void eliminar(int id_estudiante) {
        String sql = "delete from listado where id_estudiante=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1,id_estudiante);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    
    
    
    
    
    
    
    
      public static void main(String[] args) {
        
      System.out.println("Bienvenido\n" + "deseas:");
      
      while (true) {
      
          System.out.println("---------------------");
          System.out.println(" (1) CREAR NUEVO ESTUDIANTE");
          System.out.println(" (2) MOSTRAR LISTA DE ESTUDIANTES");
          System.out.println(" (3) ACTUALIZAR DATOS DE ESTUDIANTE");
          System.out.println(" (4) ELIMINAR ESTUDIANTE");
          System.out.println(" (5) SALIR");
      
          System.out.println("\n");
          
          Scanner stu = new Scanner(System.in);
          
          
          switch (stu.nextInt()){
          
              case 1: {
                  
            System.out.println("Ingresa los siguientes datos:\n");
                  
                  System.out.println("Nombre");
                   String nom = stu.nextLine();
                   nom = stu.nextLine();

                  
                  System.out.println("Apellido");
                  String appe = stu.nextLine();
                  
                  
                  System.out.println("Edad numerica");
                  int eda = stu.nextInt();
                  

                  System.out.println("Nota promedio");                
                  int nota = stu.nextInt();
                  
                Colegio ud = new Colegio();
                ud.crear(nom,appe,eda,nota);
                ud.listar(); 
  
                break;
             
          }
          
              case 2: {
                Colegio ud = new Colegio();
                ud.listar();
               break;

              }
              
              case 3: {
                  
          System.out.println("Ingresa ID:");
          int id = stu.nextInt();

          System.out.println("Nombre");
                  String nom = stu.next();

                  System.out.println("Apellido");
                  String appe = stu.next();
                  
                  System.out.println("Edad numerica");
                  int eda = stu.nextInt();

                  System.out.println("Nota promedio");                
                  int nota = stu.nextInt(); 
                  
                  System.out.println(nom);
                  System.out.println(appe);
                  System.out.println(eda);
                  System.out.println(nota);
                  System.out.println(id);

                  Colegio ud = new Colegio();
        ud.modificar(new estudiante(id,nom,appe,eda,nota));
        ud.listar(); 

                break;

              }
              
              case 4: {
                  System.out.println("Ingresa ID:");
                  int id = stu.nextInt();

                  Colegio ud = new Colegio();
        ud.eliminar(id);
        ud.listar(); 
                  break;
              }
              
              case 5: {
                   System. exit(0);
                
              }
              default:
              
}
      }
  }


    
}

