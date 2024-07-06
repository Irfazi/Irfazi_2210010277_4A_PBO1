package pbo;

import java.util.Scanner;

public class MotorBerasaksi {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // array
            MotorDetail[] motors = new MotorDetail[2];

            for(int i = 0; i < motors.length; i++) {
                System.out.print("Masukkan merk motor " + (i + 1) + ": ");
                String merk = scanner.nextLine();
                System.out.print("Masukkan plat nomor motor " + (i + 1) + ": ");
                String platNomor = scanner.nextLine();

                // objek
                motors[i] = new MotorDetail(merk, platNomor);
            }

            for(MotorDetail motor : motors) {
                System.out.println("============");
                System.out.println("Data motor:");
                System.out.println(motor.displayInfo());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format plat nomor: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}

