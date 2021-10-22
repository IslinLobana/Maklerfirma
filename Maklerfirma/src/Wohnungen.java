public class Wohnungen{
int _preis;
int _quadratmeter;
String _beschreibung;
String _titel;


public Wohnungen(int preis, int quadratmeter, String beschreibung, String titel){
    this.setPreis(preis);
    this.setQuadratmeter(quadratmeter);
    this.setBeschreibung(beschreibung);
    this.setTitel(titel);
    
}

public void setPreis(int preis) {
    _preis = preis;
}
public void setQuadratmeter(int quadratemeter) {
    _quadratmeter = quadratemeter;
}
public void setBeschreibung(String beschreibung) {
    _beschreibung = beschreibung;
}
public void setTitel(String titel) {
    _titel = titel;
}


public int getPreis() {
    return _preis;
}
public int getQuadratmeter() {
    return _quadratmeter;
}
public String getBeschreibung() {
    return _beschreibung;
}
public String getTitel() {
    return _titel;
}

}