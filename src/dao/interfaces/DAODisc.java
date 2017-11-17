package dao.interfaces;


import model.Disc;

public interface DAODisc {

    void setDisc (Disc disc);
    void deleteDisc (int id);
    Disc[] getAllOfDiscs ();
    Disc getDisc (int id);
    Disc[] getDiscsByRuTitle (String ruTitle);
    Disc[] getDiscsByEnTitle (String enTitle);
    Disc[] getDiscsByReleaseYear (int year);
    Disc[] getDiscsByClient (int clientID);

    /*
    Disc[] getDiscsByInfo(int numberOfColumn,  String info); - как вариант объединения последних четырех методов в один
    Принимает номер колонки:
     1. Русское название
     ...
     4. ID клиента, взявшего диск.

     На усмотрение. Я хз как будет удобнее) Може вообще у кого будет другая идея реализации.
     */

}
