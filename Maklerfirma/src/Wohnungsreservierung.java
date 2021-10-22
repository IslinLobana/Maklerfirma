public class Wohnungsreservierung {
    Makler[] _makler;
    Makler _Makler;
    Kaeufer[] _kaeufer;
    Kaeufer _Kaeufer;
    Wohnungen[] _wohnung;
    Wohnungen _Wohnung;

    public Wohnungsreservierung(Makler Makler, Kaeufer Kaeufer, Wohnungen Wohnung){
        this.setMakler(Makler);
        this.setKaeufer(Kaeufer);
        this.setWohnungen(Wohnung);
    }
    public void setMakler(Makler Makler) {
        _Makler = Makler;
    }
    public void setKaeufer(Kaeufer Kaeufer) {
        _Kaeufer = Kaeufer;
    }
    public void setWohnungen(Wohnungen Wohnung) {
        _Wohnung = Wohnung;
    }
    
    
    public Makler getMakler() {
        return _Makler;
    }
    public Kaeufer getKaeufer() {
        return _Kaeufer;
    }
    public Wohnungen getWohnung() {
        return _Wohnung;
    }

    
}
