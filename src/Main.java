import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //hello world

        String hexaInp;
        String hexaRe;
        int hexaInd;
        int added;
        long totalHex = 0;
        Scanner scanner = new Scanner(System.in);
        //.useDelimiter("\\s*0x\\s*");

        System.out.println("Enter a hexadecimal number: ");

        hexaInp = scanner.nextLine();


        if (hexaInp.length()>=2&&hexaInp.charAt(1)=='x') {

            hexaRe=hexaInp.substring(2);

        } else {

            hexaRe = hexaInp;

        }

        hexaInd = hexaRe.length()-1;

        for (int i=0; i<hexaInd+1; i++) {

            if (hexaRe.charAt(i)=='A'||hexaRe.charAt(i)=='a') {

                totalHex+=10*Math.pow(16, hexaInd-i);

            } else if (hexaRe.charAt(i)=='B'||hexaRe.charAt(i)=='b') {

                totalHex+=11*Math.pow(16, hexaInd-i);

            } else if (hexaRe.charAt(i)=='C'||hexaRe.charAt(i)=='c') {

                totalHex += 12 * Math.pow(16, hexaInd - i);

            }  else if (hexaRe.charAt(i)=='D'||hexaRe.charAt(i)=='d') {

                totalHex += 13 * Math.pow(16, hexaInd - i);

            } else if (hexaRe.charAt(i)=='E'||hexaRe.charAt(i)=='e') {

                totalHex += 14 * Math.pow(16, hexaInd - i);

            } else if (hexaRe.charAt(i)=='F'||hexaRe.charAt(i)=='f') {

                totalHex += 15 * Math.pow(16, hexaInd - i);

            } else {
                added=Integer.parseInt(hexaRe.charAt(i) + "");
                totalHex+=added*Math.pow(16, hexaInd-i);

            }
        }
        System.out.println("Your number is "+totalHex+" in decimal");
    }

}
