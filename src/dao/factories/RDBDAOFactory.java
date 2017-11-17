package dao.factories;


import dao.DAOFactory;
import dao.interfaces.*;
import dao.rdb.*;

public class RDBDAOFactory implements DAOFactory {

    public DAODisc getDAODisc() {
        return new RDBDAODisc();
    }

    public DAOClient getDAORenter() {
        return new RDBDAOClient();
    }

}