import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    @Test
    public void testGetAndSetName() {
        // Arrange
        Person person = new Person("peter", "jans", 'm', 34);
        Pet p1 = new Pet("fido", 3 , "dog", person);

        // Act
        p1.setName("fuwa");
        String testName = p1.getName();
        // Assert
        assertEquals(testName, "fuwa");
    }
    
    @Test
    public void testGetAndSetAge() {
        // Arrange
        Person person = new Person("peter", "jans", 'm', 34);
        Pet p1 = new Pet("fido", 3 , "dog", person);
    
        // Act
        p1.setAge(5);
        int testAge = p1.getAge();
        // Assert
        assertEquals(testAge, 5);
    }

    @Test
    public void testGetAndSetSpecies() {
        // Arrange
        Person person = new Person("peter", "jans", 'm', 34);
        Pet p1 = new Pet("fido", 3 , "dog", person);

        // Act
        p1.setSpecies("dog");
        String testSpecies = p1.getSpecies();
        // Assert
        assertEquals(testSpecies, "dog");
    }

    @Test
    public void testGetAndSetOwner() {
        // Arrange
        Person person = new Person("peter", "jans", 'm', 34);
        Person person2 = new Person("marcille", "jans", 'f', 23);
        Pet p1 = new Pet("fido", 3 , "dog", person);

        // Act
        p1.setOwner(person2);
        Person testOwner = p1.getOwner();
        // Assert
        assertEquals(testOwner, person2);
    }
}