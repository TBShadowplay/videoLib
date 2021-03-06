package dao.io;


import dao.interfaces.DAOClient;
import model.Client;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import static dao.tools.WorkWithStrings.ifContainsSplit;

public class IODAOClient implements DAOClient {

    private ArrayList<Client> clients = new ArrayList<>();

    public IODAOClient() {
        try {
            clients = readClients();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveClients (ArrayList<Client> discs) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data\\discs"))){
            oos.writeObject(discs);
        }
    }

    private ArrayList<Client> readClients() throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data\\discs"))){
            return (ArrayList<Client>) ois.readObject();
        }
    }


    @Override
    public void setClient(Client client) {
        client.setClientID(clients.get(clients.size()-1).getClientID()+1);
        clients.add(client);
        try {
            saveClients(clients);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteClient(int id) {
        clients.remove(id);
        try {
            saveClients(clients);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Client> getClients() {
        return clients;
    }

    @Override
    public Client getClient(int id) {
        return clients.get(id);
    }

    @Override
    public ArrayList<Client> getClientsOnTheDataSet(String[] data) {

        ArrayList<Client> result = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            data[i] = data[i].trim();
        }

        for (Client client : clients){
            boolean b = !data[2].isEmpty() && data[2].equals(client.getPhone());
            b = b && !data[0].isEmpty() && ifContainsSplit(client.getName(), data[0]);
            b = b && !data[1].isEmpty() && ifContainsSplit(client.getSurname(), data[1]);
            if(b){
                result.add(client);
            }
        }

        return result;
    }

    public void loadFromFile(String url) {

        LinkedHashSet<Client> updatedClients = new LinkedHashSet<>(clients);
        ArrayList<Client> newClients = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(url))){
            newClients = (ArrayList<Client>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Client client : newClients){
            client.setClientID(client.getClientID()+clients.size());
            updatedClients.add(client);
        }

        clients = new ArrayList<>(updatedClients);
        try {
            saveClients(clients);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
