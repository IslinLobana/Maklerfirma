public class Makler {
    String _vorname;
    String _nachname;


    public Makler(String vorname, String nachname){
        this.setVorname(vorname);
        this.setNachname(nachname);
    }
    
    public void setNachname(String nachname) {
        _nachname = nachname;
    }
    public void setVorname(String vorname) {
        _vorname = vorname;
    }
    
    
    public String getNachname() {
        return _nachname;
    }
    public String getNorname() {
        return _vorname;
    }
    
}