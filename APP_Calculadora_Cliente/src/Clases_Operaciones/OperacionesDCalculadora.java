/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Operaciones;

import Interface.IOperacionesCalculadora;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ElJo
 */
public class OperacionesDCalculadora {
    private IOperacionesCalculadora obj_StubOperaciones;
    
    private void ReferenciaRemota(){
        try {
            String ipServer = "localhost";
            final int PUERTO = 2525;
            Registry obj_registroServer= LocateRegistry.getRegistry(ipServer, PUERTO);
            this.obj_StubOperaciones = (IOperacionesCalculadora)obj_registroServer.lookup("SKCalculadora");
        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private static OperacionesDCalculadora instaciaUnica = new OperacionesDCalculadora();
    private OperacionesDCalculadora(){
        this.ReferenciaRemota();
    }
    public static OperacionesDCalculadora getInstanciaUnica(){
        return instaciaUnica;
    }
    
     public double sumar(double num1, double num2) throws RemoteException
    {
        return this.obj_StubOperaciones.sumar(num1, num2);
    }
    public double restar(double num1, double num2) throws RemoteException
    {
        return this.obj_StubOperaciones.restar(num1, num2);
    }
    public double multiplicar(double num1, double num2) throws RemoteException
    {
        return this.obj_StubOperaciones.multiplicar(num1, num2);
    }    
    public double dividir(double num1, double num2) throws RemoteException
    {
        return this.obj_StubOperaciones.dividir(num1, num2);
    }
}
