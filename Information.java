package Lesson;

import java.util.Arrays;

public class Information {
    public String name;
    public String surname;
    public String [] phones;
    public String [] sites;
    public Adress address;

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", sites=" + Arrays.toString(sites) +
                ", address=" + address +
                '}';
    }
}

