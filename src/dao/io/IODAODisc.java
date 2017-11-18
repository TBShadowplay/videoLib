package dao.io;

import dao.interfaces.DAODisc;
import model.Disc;

import java.io.*;
import java.util.ArrayList;

public class IODAODisc implements DAODisc {

    private ArrayList<Disc> discs = new ArrayList<>();

    public IODAODisc() {
        try {
            discs = readDiscs();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    private void recDiscs(ArrayList<Disc> discs) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data\\discs"))){
            oos.writeObject(discs);
        }
    }

    private ArrayList<Disc> readDiscs() throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data\\discs"))){
            return (ArrayList<Disc>) ois.readObject();
        }
    }

    @Override
    public void setDisc(Disc disc) {
        try {
            discs = readDiscs();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        disc.setDiskID(discs.size());
        discs.add(disc);
        try {
            recDiscs(discs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDisc(int id) {
        try {
            discs = readDiscs();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        discs.remove(id);
        try {
            recDiscs(discs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Disc> getAllOfDiscs() {
        try {
            discs = readDiscs();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return discs;
    }

    @Override
    public Disc getDisc(int id) {
        try {
            discs = readDiscs();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return discs.get(id);
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
