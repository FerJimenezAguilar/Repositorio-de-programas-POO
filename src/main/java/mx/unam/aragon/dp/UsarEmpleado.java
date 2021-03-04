/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.dp;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fernando
 */
public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1=new Empleado(1, "Sistemas", 45000.0f, 15);
        emp1.setNombre("Fernando");
        emp1.setApPaterno("Jiménez");
        emp1.setApMaterno("Aguilar");
        emp1.setEdad(19);
        emp1.setCurp("JIAF020221GTCMSE2");
        
        System.out.println("Info: "+ emp1);
        
    }
}
