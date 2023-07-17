package com.citibank.main;
import java.util.Comparator;
import com.citibank.domain.Person;
import java.util.Arrays;


interface Condition {
    boolean test(Person p);
}


public class PersonMain  {

    public static void main(String[] args) {
        Person person1 = new Person("Vivek","Gohil", 33);
        Person person2 = new Person("Gurubux","Gill", 26);
        Person person3 = new Person("Samarth","patil", 12);
        Person person4 = new Person("Trupti","Acharekar", 38);

        Person persons[] = {person1, person2, person3, person4};

        System.out.println();
        System.out.println("Printing all the person of array..");
        Condition noCondition = (p) -> true;
        printAll(persons, noCondition);
        
        System.out.println();
        System.out.println("Sorting by Last Name..");
        Comparator<Person> lastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
        Arrays.sort(persons, lastName);
        printAll(persons,noCondition);

        System.out.println();
        System.out.println("Print last name starts with G");
        Condition startsWithG = (p) -> p.getLastName().startsWith("G");
        printAll(persons, startsWithG);
        // lastNameStartsWithG(persons);
        
        System.out.println();
        System.out.println("Print last name ends with l");
        Condition endsWithL = (p) -> p.getLastName().endsWith("l");
        printAll(persons, endsWithL);
        // lastNameEndsWithL(persons);

    }

    // @Override
    // public int compare(Person o1, Person o2) {
    //     return o1.getLastName().compareTo(o2.getLastName());
    // }  
    
    public static void printAll(Person [] persons, Condition condition) {
        for (Person person : persons) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }
    
    // public static void lastNameStartsWithG(Person[] persons) {
    //     for (Person person : persons) {
    //         if (person.getLastName().startsWith("G")) {
    //             System.out.println(person);
    //         }
    //     }
    // }

    // public static void lastNameEndsWithL(Person[] persons) {
    //     for (Person person : persons) {
    //         if (person.getLastName().endsWith("l")) {
    //             System.out.println(person);
    //         }
    //     }
    // }
    
}


    

