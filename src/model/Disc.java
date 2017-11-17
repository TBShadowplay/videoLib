package model;

public class Disc {

    private int diskID;
    private String russianTitle;
    private String originalTitle;
    private short releaseYear;
    private int clientID;

    public int getDiskID() {
        return diskID;
    }

    public void setDiskID(int diskID) {
        this.diskID = diskID;
    }

    public String getRussianTitle() {
        return russianTitle;
    }

    public void setRussianTitle(String russianTitle) {
        this.russianTitle = russianTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public short getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(short releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }
}
