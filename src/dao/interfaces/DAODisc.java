package dao.interfaces;


import model.Disc;

import java.util.ArrayList;

public interface DAODisc {

    void setDisc (Disc disc);
    void deleteDisc (int id);
    ArrayList<Disc> getAllOfDiscs ();
    Disc getDisc (int id);
    ArrayList<Disc> getDiscsByRuTitle (String ruTitle);
    ArrayList<Disc> getDiscsByEnTitle (String enTitle);
    ArrayList<Disc> getDiscsByReleaseYear (int year);
    ArrayList<Disc> getDiscsByClient (int clientID);

    /*
    Disc[] getDiscsByInfo(int numberOfColumn,  String info); - как вариант объединения последних четырех методов в один
    Принимает номер колонки:
     1. Русское название
     ...
     4. ID клиента, взявшего диск.

     На усмотрение. Я хз как будет удобнее) Може вообще у кого будет другая идея реализации.
     */

}
