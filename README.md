# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data motor menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merk dan plat nomor motor, dan memberikan output berupa informasi detail dari plat nomor tersebut seperti tahun pembuatan, jenis motor, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.
## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, Motor, MotorDetail, dan MotorBerasaksi adalah contoh dari class.
```bash
public class Motor {
    ...
}

public class MotorDetail extends Motor {
    ...
}

public class MotorBerasaksi {
    ...
}


2. **Object** adalah instance dari class. Pada kode ini, motors[i] = new MotorDetail(merk, platNomor); adalah contoh pembuatan object.
```bash
motors[i] = new MotorDetail(merk, platNomor);

```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, merk dan platNomor adalah contoh atribut.

```bash
private String merk;
private String platNomor;

```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Motor dan MotorDetail.

```bash
public Motor(String merk, String platNomor) {
    this.merk = merk;
    this.platNomor = platNomor;
}

public MotorDetail(String merk, String platNomor) {
    super(merk, platNomor);
}

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setMerk dan setPlatNomor adalah contoh method mutator.
```bash
public void setMerk(String merk) {
    this.merk = merk;
}

public void setPlatNomor(String platNomor) {
    this.platNomor = platNomor;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getMerk, getPlatNomor, getTahunPembuatan, getJenisMotor, dan getNoRegistrasi adalah contoh method accessor.
```bash
public String getMerk() {
    return merk;
}

public String getPlatNomor() {
    return platNomor;
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut merk dan platNomor dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk;
private String platNomor;

```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, MotorDetail mewarisi Motor dengan sintaks extends.

```bash
public class MotorDetail extends Motor {
    ...
}

```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method displayInfo(String) di Motor merupakan overloading method displayInfo dan displayInfo di MotorDetail merupakan override dari method displayInfo di Motor.

```bash
public String displayInfo(String warna) {
    return displayInfo() + "\nWarna: " + warna;
}

@Override
public String displayInfo() {
    ...
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if-else dalam method getJenisMotor dan seleksi switch dalam method getTahunPembuatan.
```bash
public String getJenisMotor() {
    if(getPlatNomor().substring(0, 2).equals("01")) {
        return "Motor Sport";
    } else if(getPlatNomor().substring(0, 2).equals("02")) {
        return "Motor Bebek";
    } else {
        return "Jenis lain";
    }
}

public String getTahunPembuatan() {
    switch(Integer.parseInt(getPlatNomor().substring(2, 4))) {
        case 20:
            return 2020;
        case 21:
            return 2021;
        default:
            return 2000 + Integer.parseInt(getPlatNomor().substring(2, 4));
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < motors.length; i++) {
    ...
}

```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.
```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan merk motor ke-" + (i + 1) + ": ");
String merk = scanner.nextLine();

System.out.println("\nData Motor:");
System.out.println(motor.displayInfo());

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, MotorDetail[] motors = new MotorDetail[2]; adalah contoh penggunaan array.

```bash
MotorDetail[] motors = new MotorDetail[2];
```

14. **Error Handling**digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try-catch untuk menangani error.

```bash
try {
    // kode yang mungkin menimbulkan exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}

```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Irfazi
NPM: 2210010277
