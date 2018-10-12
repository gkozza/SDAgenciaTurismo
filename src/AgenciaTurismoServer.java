
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavosantos
 */
public class AgenciaTurismoServer extends UnicastRemoteObject implements AgenciaTurismo{
    public AgenciaTurismoServer() throws RemoteException{
        //Construtor da classe UnicastRemoteObject
        super(); 
    }
    
    
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        try{ 
            AgenciaTurismoServer ats = new AgenciaTurismoServer();
            String localizacao = "//localhost/agenciaturismo";
             Naming.rebind(localizacao, ats);
            
        }catch (RemoteException re){
            System.out.println("Erro: " + re.getMessage());
        }
    }

    @Override
    public String getDataHora() throws RemoteException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        return sdf.format(Calendar.getInstance().getTime());
    }

    @Override
    public String inverteString(String string) throws RemoteException {
        String retorno = "";
        StringBuffer strb = new StringBuffer(string);
        retorno = strb.reverse().toString();
        return retorno;     
    }
    
    @Override
    public void CompraPassagem (String data_ida, String data_volta, String origem, String destino,  int pessoas){
        
        
    }
    
    @Override
    public void CompraHospedagem (String data_entrada, String data_saida, int quartos,  int pessoas){
        
        
    }
    
    @Override
    public void CompraPacote (String data_ida, String data_volta, String data_entrada, String data_saida, int quartos,  int pessoas, String origem){
        
        
    }
    
    @Override
    public void RegistraInteresse (String evento_desejado, String destino_desejado, double preco_max, UnicastRemoteObject referencia_obj) {
        
    }
    
    @Override
    public void RemoveInteresse (String evento, UnicastRemoteObject obj) {
        
    }
    
}
