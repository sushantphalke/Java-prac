public class RomanTOInt {
  public static void main(String[] args) {
    String s = "MCCCCCMMMMMMCMCMXCIV";
    int number = 0;
    for (int i = s.length() - 1; i >= 0; i--) {

      if (s.charAt(i) == 'I') {
        // System.out.println("iam in I");
        number += 1;
      }

      if (s.charAt(i) == 'V') {
        if (i >= 1 && s.charAt(i - 1) == 'I') {
          // System.out.println("iam in IV");
          number += 4;
          i = i - 1;
        } else {
          number += 5;
        }
        continue;

      }

      if (s.charAt(i) == 'L') {

        if (i >= 1 && s.charAt(i - 1) == 'X') {
          number += 40;
          i = i - 1;
        } else {
          number += 50;
        }
        continue;

      }
      if (s.charAt(i) == 'C') {
        if (i >= 1 && s.charAt(i - 1) == 'X') {
          // System.out.println("in c before is x");
          number += 90;
          i = i - 1;
        } else {
          number += 100;
        }
        continue;

      }
      if (s.charAt(i) == 'D') {
        if (i >= 1 && s.charAt(i - 1) == 'C') {
          number += 400;
          i = i - 1;
        } else {
          number += 500;
        }
        continue;

      }
      if (s.charAt(i) == 'M') {
        if (i >= 1 && s.charAt(i - 1) == 'C') {
          number += 900;
          i = i - 1;
        } else {
          number += 1000;
        }
        continue;

      }
      if (s.charAt(i) == 'X') {
        if (i >= 1 && s.charAt(i - 1) == 'I') {

          number += 9;
          i = i - 1;
        } else {
          // System.out.println("iami in ten");
          number += 10;
        }
        continue;
      }

    }
    System.out.println(number);

  }
}
