package dao.interfaces;


import model.Client;

public interface DAOClient {

    void setClient (Client client);
    void deleteClient (int id); /*- метод должен выбрасывать исключение, если у клиента на руках есть диск???
                                    или лучше делать проверку? */
    Client[] getAllOfClients ();
    Client getClient (int id);
    Client[] getClientByName (String name);
    Client[] getClientBySurname (String name);
    Client[] getClientByReleaseYear (int year);

    //Client[] getClientByInfo(int numberOfColumn,  String info); - аналогично описанному в интерфейсе DAODisc

}
