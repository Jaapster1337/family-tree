public class Main {


    public static void main(String[] args) {
        Person p = new Person("henk", "de", "vries",'m', 24);
        Person f = new Person("piet", "de", "vries",'m', 50);
        Person m = new Person("marie", "de", "vries",'f', 47);
        p.addParents(m,f);
        System.out.println("parents of "+p.getName()+" are"+ p.getMother().getName() +" and"+p.getFather().getName());
        Pet dog = new Pet("fido", 3, "dog", p);
//        p.addPet(dog);
        System.out.println(p.getPets());
    }

}
