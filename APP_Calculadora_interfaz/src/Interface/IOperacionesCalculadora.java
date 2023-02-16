/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ElJo
 */
public interface IOperacionesCalculadora extends Remote{
    public double sumar(double num1, double num2) throws RemoteException;
    public double restar(double num1, double num2) throws RemoteException;
    public double multiplicar(double num1, double num2) throws RemoteException;
    public double dividir(double num1, double num2) throws RemoteException;
}
