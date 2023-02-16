/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import Interface.IOperacionesCalculadora;
import Skeleton.SKOperaciones;
import java.net.InetAddress;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.UnknownHostException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ElJo
 */
public class Main {

    private final int PUERTO = 2525;
    private SKOperaciones obj_SKOperaciones;
    
    
    //CONSTRUCTOR DEL MAIN
    public Main() throws RemoteException{
        this.obj_SKOperaciones = new SKOperaciones();
    }
    
    private void iniciarServidor() throws RemoteException{
        try {
            String ipServer = InetAddress.getLocalHost().toString();
            System.out.println("Server: " + ipServer + "Escuchando en puerto: " + PUERTO);
            Registry obj_registro = LocateRegistry.createRegistry(PUERTO);
            obj_registro.bind("SKCalculadora",(IOperacionesCalculadora)obj_SKOperaciones);
        } catch (java.net.UnknownHostException | AlreadyBoundException | RemoteException ex) {
            System.out.println(ex.getMessage());
        } 
    }
    
    public static void main(String[] args) throws RemoteException {
        (new Main()).iniciarServidor();
    }
    
}
