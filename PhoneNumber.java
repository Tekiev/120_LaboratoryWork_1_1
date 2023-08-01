package DEV120_1_1_Tekiev;

import java.util.Objects;

public class PhoneNumber {
    private String codeOfRegion;

    private  String localNumber;

    public PhoneNumber(String codeOfRegion, String localNumber) {

        if (codeOfRegion!=null && localNumber!=null && codeOfRegion.matches("\\d+") && localNumber.matches("\\d+")) {

            this.codeOfRegion = codeOfRegion;
            this.localNumber = localNumber;
        }
        else {
            System.out.println("Введен некорректный номер телефона");
            System.exit(0);
        }
    }

    @Override
    public String toString() {

        String[] n = localNumber.split("");

        String sFormat1 = "";

        String sFormat2;

        if (n.length>1) {
            if (n.length % 2 == 0) {
                for (int i = 0; i < n.length - 1; i++) {
                    sFormat1 += n[i] + n[i + 1] + "-";
                    i++;
                }
            } else {
                sFormat1 = n[0] + n[1] + n[2] + "-";
                for (int i = 3; i < n.length - 1; i++) {
                    sFormat1 += n[i] + n[i + 1] + "-";
                    i++;
                }
            }
            sFormat2 = sFormat1.substring(0, sFormat1.length() - 1);
        }
        else {
            sFormat2 = n[0];
        }
        return "(" + codeOfRegion + ")" +sFormat2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(codeOfRegion, that.codeOfRegion) && Objects.equals(localNumber, that.localNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeOfRegion, localNumber);
    }

}