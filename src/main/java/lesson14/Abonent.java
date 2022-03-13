package lesson14;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Abonent {
    private final String fio;
    private final long phoneNumber;
    private final Set<Abonent> linkedAbonents = new HashSet<>();

    public Abonent(String fio, long phoneNumber) {
        this.fio = fio;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "fio='" + fio + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonent abonent = (Abonent) o;
        return phoneNumber == abonent.phoneNumber && fio.equals(abonent.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, phoneNumber);
    }

    public String getFio() {
        return fio;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Set<Abonent> getLinkedAbonents() {
        return linkedAbonents;
    }
}
