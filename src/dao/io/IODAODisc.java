package dao.io;

import dao.interfaces.DAODisc;
import model.Disc;

import java.util.ArrayList;

public class IODAODisc implements DAODisc {
    @Override
    public void setDisc(Disc disc) {

    }

    @Override
    public void deleteDisc(int id) {

    }

    @Override
    public ArrayList<Disc> getAllOfDiscs() {
        return null;
    }

    @Override
    public Disc getDisc(int id) {
        return null;
    }

    @Override
    public ArrayList<Disc> getDiscsByRuTitle(String ruTitle) {
        return null;
    }

    @Override
    public ArrayList<Disc> getDiscsByEnTitle(String enTitle) {
        return null;
    }

    @Override
    public ArrayList<Disc> getDiscsByReleaseYear(int year) {
        return null;
    }

    @Override
    public ArrayList<Disc> getDiscsByClient(int clientID) {
        return null;
    }
}
