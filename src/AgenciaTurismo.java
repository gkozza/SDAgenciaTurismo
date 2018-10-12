
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavosantos
 */
public interface AgenciaTurismo extends Remote{
    public String getDataHora() throws RemoteException;
    public String inverteString(String string) throws RemoteException;
    public void CompraPassagem (String data_ida, String data_volta, String origem, String destino,  int pessoas) throws RemoteException;
    public void CompraHospedagem (String data_entrada, String data_saida, int quartos,  int pessoas) throws RemoteException;
    public void CompraPacote (String data_ida, String data_volta, String data_entrada, String data_saida, int quartos,  int pessoas, String origem) throws RemoteException;
    public void RegistraInteresse (String evento_desejado, String destino_desejado, double preco_max, UnicastRemoteObject referencia_obj) throws RemoteException;
    public void RemoveInteresse (String evento, UnicastRemoteObject obj) throws RemoteException;
}
