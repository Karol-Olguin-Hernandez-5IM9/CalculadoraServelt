/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Clases.Operaciones;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class Servelt1 extends HttpServlet{
    private int num1;
    private int num2;
    private float res;
    private String ope;
    
    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException
    {
        num1= Integer.parseInt(peticion.getParameter("Num1"));
        num2= Integer.parseInt(peticion.getParameter("Num2"));
        ope=peticion.getParameter("Operaciones");
        Operaciones op= new Operaciones();
        
            if(ope.equals("Suma")){
                res=op.Suma(num1, num2);
            }
            else{
                if(ope.equals("Resta"))
                    res=op.Resta(num1, num2);
                else{
                    if(ope.equals("Division"))
                        res=op.Divi(num1, num2);
                    else{
                        if(ope.equals("Multiplicacion"))
                            res=op.Multi(num1, num2);
                    }
                }
            }
        PrintWriter out= new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Respuesta hot</title></head>");
        out.println("<div><center>");
        out.println("Tus numeros son:" + num1 + " " + num2);
        out.println("Tu operación es:" + ope);
        out.println("Tu resultado es:"+ res);
        out.println("<h2>Gracias por usar Calculadora Hot </h2>");
        out.println("</center></div>");
        out.println("</html>");
        
    }   
    
    
}
