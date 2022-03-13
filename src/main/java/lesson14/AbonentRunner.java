package lesson14;

import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

public class AbonentRunner {
    public static void main(String[] args) throws InterruptedException {
        List<Abonent> abonentList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            abonentList.add(generateAbonent());
        }

        Random random = new Random();
        for (Abonent abonent : abonentList) {
            for (int i = 0; i < 100; i++) {
                Abonent randomAbonent = abonentList.get(random.nextInt(abonentList.size()));
                abonent.getLinkedAbonents().add(randomAbonent);
            }
        }

        Map<String, Integer> flist = frequentNumbers(abonentList);

        for (var entry : flist.entrySet()) {
            System.out.println("Контакт " + entry.getKey() + " содержится в телефонных справочниках " + entry.getValue() + " абонентов.");
        }

        Abonent[] abonentArray = abonentList.toArray(new Abonent[0]);

        Map<String, Integer> flistArray = frequentNumbers(abonentArray);

        for (var entry : flistArray.entrySet()) {
            System.out.println("Контакт " + entry.getKey() + " содержится в телефонных справочниках " + entry.getValue() + " абонентов.");
        }
    }

    public static Map<String, Integer> frequentNumbers(List<Abonent> abonentList) {
        long start = System.currentTimeMillis();
        Map<String, Integer> tmp = new HashMap<>();
        for (Abonent abonent : abonentList) {
            for (Abonent abonent1 : abonentList) {
                if (abonent1.getLinkedAbonents().contains(abonent)) {
                    int count = tmp.getOrDefault(abonent.getFio(), 1);
                    tmp.put(abonent.getFio(), count + 1);
                }
            }
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени LIST, мс: " + elapsed);

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(tmp.entrySet());

        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1,
                               Entry<String, Integer> o2) {
                if (false) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list) {
            if (entry.getValue() >= 135) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
        }

        return sortedMap;
    }

    public static Map<String, Integer> frequentNumbers(Abonent[] abonentArray) {
        long start = System.currentTimeMillis();
        Map<String, Integer> tmp = new HashMap<>();
        for (Abonent abonent : abonentArray) {
            for (Abonent abonent1 : abonentArray) {
                if (abonent1.getLinkedAbonents().contains(abonent)) {
                    int count = tmp.getOrDefault(abonent.getFio(), 1);
                    tmp.put(abonent.getFio(), count + 1);
                }
            }
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени ARRAY, мс: " + elapsed);

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(tmp.entrySet());

        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1,
                               Entry<String, Integer> o2) {
                if (false) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list) {
            if (entry.getValue() >= 135) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
        }


        return sortedMap;
    }

    private static Abonent generateAbonent() {
        Random rand = new Random();
        int num1 = rand.nextInt(99999);
        int num2 = rand.nextInt(99999);

        DecimalFormat df3 = new DecimalFormat("00000");

        String phoneNumber = "8" + df3.format(num1) + df3.format(num2);

        return new Abonent(getSaltString() + " " + getSaltString() + " " +
                getSaltString(), Long.parseLong(phoneNumber));
    }

    private static String getSaltString() {
        String saltchars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) {
            int index = (int) (rnd.nextFloat() * saltchars.length());
            salt.append(saltchars.charAt(index));
        }
        return salt.toString();
    }
}
