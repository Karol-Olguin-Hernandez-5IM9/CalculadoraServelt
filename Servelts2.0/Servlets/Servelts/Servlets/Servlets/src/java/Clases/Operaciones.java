/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.lang.Math.*;
public class Operaciones {
    
    public float Suma(int nume1,int nume2){
        float res= nume1+nume2;
        return res;
    }
    public float Resta(int nume1,int nume2){
        float res= nume1-nume2;
        return res;
    }
    public float Divi(int nume1,int nume2){
        float res= nume1/nume2;
        return res;
    }
    public float Multi(int nume1,int nume2){
        float res= nume1*nume2;
        return res;
    }
    public double pow(int nume1,int nume2){
        double res= Math.pow(nume1, nume2);
        return res;
    }
    public double Cos(double  nume1){
        double res=0;
        res= Math.cos(nume1);
        return res;
    }
    public double Sen(double  nume1){
        double res=0;
        res= Math.sin(nume1);
        return res;
    }
    public double Log(double  nume1){
        double res=0;
        res= Math.log(nume1);
        return res;
    }
    public double Tan(double  nume1){
        double res=0;
        res= Math.tan(nume1);
        return res;
    }
    public double Exp(double  nume1){
        double res=0;
        res= Math.exp(nume1);
        return res;
    }
}
