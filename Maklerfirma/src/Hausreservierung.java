public class Hausreservierung {
    Makler[] _makler;
    Makler _Makler;
    Kaeufer[] _kaeufer;
    Kaeufer _Kaeufer;
    Haeuser[] _haus;
    Haeuser _Haus;

    public Hausreservierung(Makler Makler, Kaeufer Kaeufer, Haeuser Haus){
        this.setMakler(Makler);
        this.setKaeufer(Kaeufer);
        this.setHaeuser(Haus);
    }
    public void setMakler(Makler Makler) {
        _Makler = Makler;
    }
    public void setKaeufer(Kaeufer Kaeufer) {
        _Kaeufer = Kaeufer;
    }
    public void setHaeuser(Haeuser Haus) {
        _Haus = Haus;
    }
    
    
    public Makler getMakler() {
        return _Makler;
    }
    public Kaeufer getKaeufer() {
        return _Kaeufer;
    }
    public Haeuser getHaeuser() {
        return _Haus;
    }

    
}
