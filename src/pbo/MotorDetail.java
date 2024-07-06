package pbo;

// inheritance
public class MotorDetail extends Motor {
    // konstruktor
    public MotorDetail(String merk, String platNomor) {
        super(merk, platNomor);
    }

    // metode tambahan untuk tahun pembuatan berdasarkan plat nomor
    public int getTahunPembuatan() {
        return Integer.parseInt(getPlatNomor().substring(2, 4)) + 2000;
    }

    // metode untuk mendapatkan jenis motor berdasarkan kode plat
    public String getJenisMotor() {
        String kodeJenis = getPlatNomor().substring(0, 2);
        // seleksi switch
        switch(kodeJenis) {
            case "01":
                return "Motor Sport";
            case "02":
                return "Motor Bebek";
            case "03":
                return "Motor Matic";
            default:
                return "Jenis Lain";
        }
    }

    // metode untuk mendapatkan nomor registrasi
    public int getNoRegistrasi() {
        return Integer.parseInt(getPlatNomor().substring(4));
    }

    // polymorphism overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
               "\nTahun Pembuatan: " + getTahunPembuatan() +
               "\nJenis Motor: " + getJenisMotor() +
               "\nNo Registrasi: " + getNoRegistrasi();
    }
}
