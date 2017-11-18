package dao.interfaces;


import model.Client;

import java.util.ArrayList;

public interface DAOClient {

    void setClient (Client client);
    void deleteClient (int id); /*- метод должен выбрасывать исключение, если у клиента на руках есть диск???
                                    или лучше делать проверку? */
    ArrayList<Client> getAllOfClients ();
    Client getClient (int id);
    ArrayList<Client> getClientByName (String name);
    ArrayList<Client> getClientBySurname (String name);
    Client getClientByPhone (int phone);

    //Client[] getClientByInfo(int numberOfColumn,  String info); - аналогично описанному в интерфейсе DAODisc

}
