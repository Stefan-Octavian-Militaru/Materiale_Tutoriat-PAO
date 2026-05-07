import org.w3c.dom.ls.LSOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class userService {
    String name;
    int age;

    public userService(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void validate(){
        if (age < 0) {
            throw new InValidDataException("Age must be positive.");
        }

        if (name == null){
            throw new InValidDataException("Name cannot be null.");
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Users.txt"))) {
            bw.append("Name: " + name + " Age: " + age + "\n");

        }
        catch(IOException e){
            System.out.println("Error writing users.txt");

        }
    }


}
