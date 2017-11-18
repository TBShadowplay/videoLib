package dao.io;


import dao.interfaces.DAOClient;
import model.Client;

import java.util.ArrayList;

public class IODAOClient implements DAOClient {
    @Override
    public void setClient(Client client) {

    }

    @Override
    public void deleteClient(int id) {

    }

    @Override
    public ArrayList<Client> getAllOfClients() {
        return null;
    }

    @Override
    public Client getClient(int id) {
        return null;
    }

    @Override
    public ArrayList<Client> getClientByName(String name) {
        return null;
    }

    @Override
    public ArrayList<Client> getClientBySurname(String name) {
        return null;
    }

    @Override
    public Client getClientByPhone(int phone) {
        return null;
    }
}
