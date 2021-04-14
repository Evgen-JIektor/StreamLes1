package ru.stream;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 18));
        students.add(new Student("Mikhail", 21));
        students.add(new Student("Andrei", 25));
        students.add(new Student("Petr", 17));
        students.add(new Student("Ivan", 20));
        students.add(new Student("Nikolai", 21));
        students.add(new Student("Dasha", 26));
        students.add(new Student("Natasha", 25));
        students.add(new Student("Katia", 17));
        students.add(new Student("Lena", 19));


        System.out.println();

        students.stream().
                forEach( s -> System.out.printf("%s - %d \n", s.getName(), s.getAge()));

        System.out.println("------------------");

        students.stream().
                filter( s -> s.getAge() > 19).
                sorted( (s1, s2) -> s1.getAge().compareTo(s2.getAge())).
                map( s -> s.getAge()).
                forEach( s -> System.out.println(s));

        System.out.println("------------------");

        students.stream().
                filter( s -> s.getAge() > 21).
                sorted( (s1, s2) -> s1.getName().compareTo(s2.getName())).
                map( s -> s.getName()).
                forEach( s -> System.out.println(s));

    }
}
