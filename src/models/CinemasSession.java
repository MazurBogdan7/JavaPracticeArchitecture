package models;
public class CinemasSession {
    private final String nameCinema;
    private final String nameFilm;
    private final String date;
    private final String time;
    private final int numberHoll;
    private final String typeSession;

    public CinemasSession(String nameCinema, String nameFilm, String date, String time, int numberHoll, String typeSession) {
        this.nameCinema = nameCinema;
        this.nameFilm = nameFilm;
        this.date = date;
        this.time = time;
        this.numberHoll = numberHoll;
        this.typeSession = typeSession;
    }

    public String getNameCinema() {
        return nameCinema;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getNumberHoll() {
        return numberHoll;
    }

    public String getTypeSession() {
        return typeSession;
    }
}
