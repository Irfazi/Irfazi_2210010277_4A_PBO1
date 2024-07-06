package pbo;

public class Motor {
    // atribut enkapsulasi
    private String merk;
    private String platNomor;

    // konstruktor
    public Motor(String merk, String platNomor) {
        this.merk = merk;
        this.platNomor = platNomor;
    }

    // mutator (setter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    // accessor (getter)
    public String getMerk() {
        return merk;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String displayInfo() {
        return "Merk: " + getMerk() +
               "\nPlat Nomor: " + getPlatNomor();
    }

    // polymorphism overloading
    public String displayInfo(String warna) {
        return displayInfo() + "\nWarna: " + warna;
    }
}
