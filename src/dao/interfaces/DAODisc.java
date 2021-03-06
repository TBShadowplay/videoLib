package dao.interfaces;


import model.Disc;

import java.util.ArrayList;

public interface DAODisc {

    void setDisc (Disc disc);
    void deleteDisc (int id);
    ArrayList<Disc> getDiscs();
    Disc getDisc (int id);
    ArrayList<Disc> getDiscsOnTheDataSet (String[] data); //Принимает массив значений всех полей Disc
    public void loadFromFile(String url);

}
