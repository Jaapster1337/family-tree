import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testNameField() {
        // Arrange
        Person p = new Person("henk", "vries",'m', 20);
        
        // Act
        String name = p.getName();
        // Assert
        assertEquals("henk", name);
    }
    
    @Test
    public void tentMiddleNameField() {
        // Arrange
        Person p = new Person("henk", "de", "vries",'m', 20);
        // Act
        String middleName = p.getMiddleName();
        // Assert
        assertEquals("de", middleName);
    }
    
    @Test
    public void testLastNameField() {
        // Arrange
        Person p = new Person("henk", "vries",'m', 20);
        // Act
        String lastName = p.getLastName();
        // Assert
        assertEquals("vries", lastName);
    }
    
    @Test
    public void testSexField() {
        // Arrange
        Person p = new Person("henk", "vries",'m', 20);
        // Act
        char sex = p.getSex();
        // Assert
        assertEquals('m', sex);
    }

    @Test
    public void testAgeField() {
        // Arrange
        Person p = new Person("henk", "vries",'m', 20);
        // Act
        int age = p.getAge();
        // Assert
        assertEquals(20, age);
    }

    @Test
    public void testMotherField() {
        // Arrange
        Person p = new Person("henk", "vries",'m', 20);
        Person m = new Person("anita", "vries",'f', 50);
        // Act
        p.setMother(m);
        Person mother = p.getMother();
        // Assert
        assertEquals(m, mother);
    }

    @Test
    public void testFatherField() {
        // Arrange
        Person p = new Person("henk", "vries",'m', 20);
        Person f = new Person("hendrik", "vries",'m', 50);
        // Act
        p.setFather(f);
        Person father = p.getFather();
        // Assert
        assertEquals(father, f );
    }

    @Test
    public void testSiblingsField() {
        // Arrange
        Person p1 = new Person("henk", "vries",'m', 25);
        Person p2 = new Person("jan", "vries",'m', 30);
        Person p3 = new Person("lisa", "vries",'f', 20);
        // Act
        p1.addSiblings(p2);
        p1.addSiblings(p3);
        List<Person> siblings = p1.getSiblings();
        // Assert
        assertEquals(2, siblings.size());
        assertEquals(p2, siblings.get(0));
        assertEquals(p3, siblings.get(1));
    }
    
    //getter en setter tests
    @Test
    public void testGetAndSetName() {
        // Arrange
        Person p1 = new Person("henk", "vries",'m', 25);
        // Act
        p1.setName("klaas");
        String testName = p1.getName();
        // Assert
        assertEquals(testName, "klaas");
    }

    @Test
    public void testGetAndSetMiddleName() {
        // Arrange
        Person p = new Person("henk", "de", "vries",'m', 20);
        // Act
        p.setMiddleName("van");
        String testMiddleName = p.getMiddleName();
        // Assert
        assertEquals(testMiddleName, "van");
    }

    @Test
    public void testGetAndSetLastName() {
        // Arrange
        Person p1 = new Person("henk", "vries",'m', 25);
        // Act
        p1.setLastName("klaassen");
        String testLastName = p1.getLastName();
        // Assert
        assertEquals(testLastName, "klaassen");
    }

    @Test
    public void testGetAndSetSex() {
        // Arrange
        Person p1 = new Person("henk", "vries",'m', 25);
        // Act
        p1.setSex('f');
        char testSex = p1.getSex();
        // Assert
        assertEquals(testSex, 'f');
    }

    @Test
    public void testGetAndSetAge() {
        // Arrange
        Person p1 = new Person("henk", "vries",'m', 25);
        // Act
        p1.setAge(60);
        int testAge = p1.getAge();
        // Assert
        assertEquals(testAge, 60);
    }

    @Test
    public void testGetAndSetMother() {
        // Arrange
        Person p1 = new Person("henk", "vries",'m', 25);
        Person m1 = new Person("jose", "vries",'f', 50);
        // Act
        p1.setMother(m1);
        Person testMother = p1.getMother();
        // Assert
        assertEquals(testMother, m1);
    }

    @Test
    public void testGetAndSetFather() {
        // Arrange
        Person p1 = new Person("henk", "vries",'m', 25);
        Person f1 = new Person("henk", "vries",'m', 50);
        // Act
        p1.setFather(f1);
        Person testFather = p1.getFather();
        // Assert
        assertEquals(testFather, f1);
    }

    @Test
    public void testGetAndSetSiblings() {
        // Arrange
        Person p1 = new Person("henk", "vries",'m', 25);
        Person s1 = new Person("piet", "vries",'m', 20);
        Person s2 = new Person("sofie", "vries",'f', 17);

        List<Person> siblings = new ArrayList<>();
        siblings.add(s1);
        siblings.add(s2);
        // Act
        p1.setSiblings(siblings);
        List<Person> testSiblings = p1.getSiblings();
        // Assert
        assertEquals(testSiblings, siblings);
    }

    @Test
    public void testGetAndSetChildren() {
        // Arrange
        Person p1 = new Person("henk", "vries",'m', 35);
        Person c1 = new Person("piet", "vries",'m', 12);
        Person c2 = new Person("sofie", "vries",'f', 14);

        List<Person> children = new ArrayList<>();
        children.add(c1);
        children.add(c2);
        // Act
        p1.setChildren(children);
        List<Person> testChildren = p1.getChildren();
        // Assert
        assertEquals(testChildren, children);
    }

    @Test
    public void testGetAndSetPet() {
        // Arrange
        Person p1 = new Person("henk", "vries",'m', 25);
        Pet pet1 = new Pet("fido", 4, "dog", p1);
        Pet pet2 = new Pet("ceres", 5, "cat", p1);

        List<Pet> pets = new ArrayList<>();
        pets.add(pet1);
        pets.add(pet2);
        // Act
        p1.setPets(pets);
        List<Pet> testPets = p1.getPets();
        // Assert
        assertEquals(testPets, pets);
    }

    @Test
    public void testAddParents() {
        // Arrange
        Person child1 = new Person("anya", "forger",'f', 6);
        Person parent1 = new Person("loid", "forger",'m', 28);
        Person parent2 = new Person("yor", "forger",'f', 27);
        // Act
        child1.addParents(parent1, parent2);
        // Assert
        assertEquals(parent1, child1.getMother());
        assertEquals(parent2, child1.getFather());
    }

    @Test
    public void testAddPet() {
        // Arrange
        Person p1 = new Person("anya", "forger",'f', 6);
        Pet pet1 = new Pet("bond", 6,"dog", p1);
        // Act
        p1.addPet(pet1);
        // Assert
        assertEquals(pet1, p1.getPets().getFirst());
    }

    @Test
    public void testAddChildren() {
        // Arrange
        Person parent = new Person("yor", "forger",'f', 27);
        Person child = new Person("anya", "forger",'f', 6);
        Person child2 = new Person("fillian", "forger",'f', 14);
        // Act
        parent.addChildren(child);
        parent.addChildren(child2);
        // Assert
        assertEquals(child, parent.getChildren().getFirst());
        assertEquals(child2, parent.getChildren().get(1));
    }

    @Test
    public void testAddSiblings() {
        // Arrange
        Person sibling1 = new Person("shiori", "novella", 'f', 21);
        Person sibling2 = new Person("nerissa", "ravencroft", 'f', 28);
        Person sibling3 = new Person("koseki", "bijou", 'f', 17);
        // Act
        sibling1.addSiblings(sibling2);
        sibling1.addSiblings(sibling3);
        // Assert
        assertEquals(sibling2, sibling1.getSiblings().getFirst());
        assertEquals(sibling3, sibling1.getSiblings().get(1));
    }

    @Test
    void testGetPetOfGrandchild() {
        Person p1 = new Person("henk", "vries",'m', 25);
        Person person3 = new Person("Janny", "Klaasen", 'V', 41);
        Person person4 = new Person("Jan", "Klaasen", 'M', 6);
        Pet pet1 = new Pet("Fikkie", 6, "Hond", person4);
        p1.setMother(person3);
        p1.setChildren(List.of(person4));
        assertEquals("Fikkie", person3.getGrandChildren().getFirst().getPets().getFirst().getName());
    }





}