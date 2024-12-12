/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.ArrayList;
import java.util.Objects;


/**
 *
 * @author George Vogas
 */
public class Bank implements IBank{
    private String address;
    private String bankNumber;
    private ArrayList<Client> clientList ;
    
    public Bank(){
        this.bankNumber = "";
        this.address = "";
        this.clientList =new ArrayList<Client>();
    }
    
    public Bank(String bankNumber, String address){
        this.bankNumber = bankNumber;
        this.address = address;
        this.clientList = new ArrayList<Client>();
    }
    
    public String getBankNumber(){
        return this.bankNumber;
    }
    
     public void setBankNumber(String bankNumber){
        this.bankNumber = bankNumber;
    }
    
    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bank other = (Bank) obj;
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.bankNumber, other.bankNumber);
    }

    @Override
    public String toString() {
        return "The bank address is " + this.address + " and your bank number is " + this.bankNumber;
    }

    
    @Override
    public void addClient(Client newClient) {
        clientList.add(newClient);
    }

    
    @Override
    public void displayClientAccounts(int clientId) {
        Client client = getClient(clientId); 
        if(client != null){
            client.displayAccounts();
        }
        else{ 
            System.out.println("There is no client what client ID " + clientId);
        }
    }
    
    
    @Override
    public void displayClientList() {
        if(clientList.isEmpty()){
            System.out.println("No client have been found.");
            System.out.println("---------------------------");
        }
        else{
            for (int i = 0; i < clientList.size(); i++) {
                System.out.println(clientList.get(i));
                System.out.println("---------------------");
            }
        } 
    }
    
    
    @Override
    public Client getClient(int id) {
        for(Client client : clientList){
            if(client.getId() == id){
                return client;
            }
        }
        return null;
    }
      
   
    @Override
    public Account getClientAccount(int clientId, int accountNumber) {    
        Client client = getClient(clientId);
            if(client != null){
                return client.getAccount(accountNumber);
            }
        return null;
    }
   
    
}
