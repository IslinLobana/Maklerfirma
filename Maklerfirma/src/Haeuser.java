public class Haeuser{
    int _preis;
    int _quadratmeter;
    int _stockwerke;
    String _beschreibung;
    String _titel;
    
    
    public Haeuser(int preis, int quadratmeter, int stockwerke, String beschreibung, String titel){
        this.setPreis(preis);
        this.setQuadratmeter(quadratmeter);
        this.setStockwerke(stockwerke);
        this.setBeschreibung(beschreibung);
        this.setTitel(titel);
        
    }
    
    public void setPreis(int preis) {
        _preis = preis;
    }
    public void setQuadratmeter(int quadratemeter) {
        _quadratmeter = quadratemeter;
    }
    public void setStockwerke(int stockwerke) {
        _stockwerke = stockwerke;
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
    public int getStockwerke() {
        return _stockwerke;
    }
    public String getBeschreibung() {
        return _beschreibung;
    }
    public String getTitel() {
        return _titel;
    }
    
    }