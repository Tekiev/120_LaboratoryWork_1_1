package DEV120_1_1_Tekiev;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        PhoneNumber phone1 = new PhoneNumber("981", "0234567");

        PhoneNumber phone2 = new PhoneNumber("7890", "654321");

        PhoneNumber phone3 = new PhoneNumber("7890", "654321");

        System.out.println(phone1);

        System.out.println(phone2);

        HashSet<PhoneNumber> phoneNumberHashSet = new HashSet<>();

        phoneNumberHashSet.add(phone1);

        phoneNumberHashSet.add(phone2);

        phoneNumberHashSet.add(phone3);

        System.out.println(phoneNumberHashSet);

        HashMap<PhoneNumber, String> phoneNumberHashMap = new HashMap<>();

        phoneNumberHashMap.put(phone1, "Ivan");

        phoneNumberHashMap.put(phone2, "Pavel");

        phoneNumberHashMap.put(phone3, "Sasha");

        System.out.println(phoneNumberHashMap);

    }

}
