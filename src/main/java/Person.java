import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;

    private char sex;
    private int age;

    private Person mother;

    private Person father;

    private List<Person> siblings = new ArrayList<>();

    private List<Person> children = new ArrayList<>();

    private List<Pet> pets = new ArrayList<>();

    public Person(String name, String lastName, char sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, char sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addParents(Person mother, Person father){
        this.setMother(mother);
        this.setFather(father);
    }

    public void addPet(Pet pet){
        List<Pet> petList = this.getPets();
        petList.add(pet);
    }

    public void addChildren(Person child){
        List<Person> children = this.getChildren();
        children.add(child);
    }

    public void addSiblings(Person sibling){
        List<Person> siblings = this.getSiblings();
        siblings.add(sibling);
    }

    public List<List<Person>> getGrandChildren(){
        List<Person> children = this.getChildren();
        List<List<Person>> grandChildren = new ArrayList<>();
        for(Person child: children){
            grandChildren.add(child.getChildren());
        }
        return grandChildren;
    }
}
