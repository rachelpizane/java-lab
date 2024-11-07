package POO.aula04;

public abstract class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    protected boolean checkWord(String word){
        if (word == null){
            throw new IllegalArgumentException("Cannot be null.");
        }

        if (word.isBlank()){
            throw new IllegalArgumentException("Cannot be empty.");
        }

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(checkWord(name)){
            this.name = name;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(checkWord(lastName)){
            this.lastName = lastName;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Cannot be zero or negative");
        }
        this.age = age;
    }
}
