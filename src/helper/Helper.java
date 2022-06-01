package helper;

import java.util.Random;

public class Helper {
  public static int hitungHargaTotal(int hargaSatuan, int kuantitas,
                                     int diskon) {
    return (int)(hargaSatuan * kuantitas * (double)(100 - diskon) /
                 (double)100);
  }

  public static String getRandomId() {
    String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    base += base.toLowerCase();
    base += "0123456789";

    StringBuilder sb = new StringBuilder();

    Random random = new Random();

    int length = 10;

    for (int i = 0; i < length; i++) {

      int index = random.nextInt(base.length());

      char randomChar = base.charAt(index);

      sb.append(randomChar);
    }

    return sb.toString();
  }
}
