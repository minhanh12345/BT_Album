package Model;

public class Album {
    private String nameSong;
    private String actor;
    private String typeSong;
    private String linkSong;
    public Album(){}

    public Album(String nameSong, String actor, String typeSong, String linkSong) {
        this.nameSong = nameSong;
        this.actor = actor;
        this.typeSong = typeSong;
        this.linkSong = linkSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getTypeSong() {
        return typeSong;
    }

    public void setTypeSong(String typeSong) {
        this.typeSong = typeSong;
    }

    public String getLinkSong() {
        return linkSong;
    }

    public void setLinkSong(String linkSong) {
        this.linkSong = linkSong;
    }
}
