/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Skeleton;

import Interface.IOperacionesCalculadora;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ElJo
 */
public class SKOperaciones extends UnicastRemoteObject implements IOperacionesCalculadora{

    public SKOperaciones() throws RemoteException{
    }

   
    @Override
    public double sumar(double num1, double num2) throws RemoteException {
       return num1 + num2;
    }

    @Override
    public double restar(double num1, double num2) throws RemoteException {
        return num1 - num2;    
    }

    @Override
    public double multiplicar(double num1, double num2) throws RemoteException {
        return num1 * num2;    
    }

    @Override
    public double dividir(double num1, double num2) throws RemoteException {
        return num1 / num2;    
    }
    
}
