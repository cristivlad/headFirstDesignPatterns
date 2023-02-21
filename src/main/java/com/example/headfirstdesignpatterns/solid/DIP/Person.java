package com.example.headfirstdesignpatterns.solid.DIP;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}

/**
 * fix for DIP
 */
interface RelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}
/**
 * low-level module
 */
class Relationships implements RelationshipBrowser {
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream().filter(p -> p.getValue0().name.equals("John") && p.getValue1() == Relationship.PARENT)
                .map(Triplet::getValue2).collect(Collectors.toList());
    }
}

class Research { // high-level module
    /**
     * this breaks the DIP since in the 'high level module' we make changes to the low level
     * @param relationships
     */
//    public Research(Relationships relationships) {
//        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
//        relations.stream().filter(p -> p.getValue0().name.equals("John") && p.getValue1() == Relationship.PARENT)
//                .forEach(p -> System.out.println("John has a child called " + p.getValue2().name));
//    }

    public Research(RelationshipBrowser browser) {
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children)
            System.out.println("John has a child called " + child.name);
    }
}

enum Relationship {
    PARENT, CHILD, SIBLING;
}

class Demo {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);
    }
}