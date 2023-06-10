
package learntable;

public class User {
    
    private String name;
    private int age;
    private String program;
    
    public User(String name, int age, String program){
        this.name = name;
        this.age = age;
        this.program = program;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProgram() {
        return program;
    }

}
