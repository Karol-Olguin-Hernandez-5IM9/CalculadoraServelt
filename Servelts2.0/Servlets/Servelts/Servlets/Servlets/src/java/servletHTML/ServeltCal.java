/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletHTML;


import Clases.Operaciones;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class ServeltCal extends HttpServlet{
    private int num1;
    private int num2;
    private double res;
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
                        else{
                            if(ope.equals("Potencia"))
                                res=op.pow(num1, num2);
                            else{
                                if(ope.equals("Cos"))
                                    res=op.Cos(num1);
                                else{
                                    if(ope.equals("Sen"))
                                        res=op.Sen(num1);
                                    else{
                                        if(ope.equals("Tan"))
                                            res=op.Tan(num1);
                                        else{
                                            if(ope.equals("Log"))
                                                res=op.Log(num1);
                                            else{
                                                if(ope.equals("Exp"))
                                                    res=op.Exp(num1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        PrintWriter out= new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Respuesta hot</title></head>");
        out.println("<style type='text/css'>\n" +
"            @import url('Csshot.css');\n" +
"        </style>");
        out.println("<body class='Body2'><div><center>");
        out.println("<p class='p'>Tus numeros son:" + num1 + " y " + num2 +"<br>");
        out.println("Tu operación es:" + ope + "<br>");
        out.println("Tu resultado es:"+ res + "<br></p>");
        out.println("<h3>Gracias por usar Calculadora Hot </h3>");
        out.println("</center></div></body>");
        out.println("</html>");
        out.close();
    }   
    
    
}
