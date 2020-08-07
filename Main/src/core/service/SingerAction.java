package core.service;

public interface SingerAction extends BasePersonAction {
    void singing(String name,String surname, String lastname);
    void playingGuitar(String name,String surname, String lastname);
}