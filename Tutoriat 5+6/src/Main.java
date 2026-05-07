import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        try(FileProcessor obj = new FileProcessor()) {
//            int nr_of_lines = obj.readFile();
//            System.out.println("Number of lines: " + nr_of_lines);
//            obj.showFiles("Lion");
//        } catch (IOException e) {
//            System.out.println("File Exception Found!");
//            throw new RuntimeException(e);
//        }

//        userService us1 = new userService("John", 12);
////        userService us2 = new userService("Jane", -1);
////
////
////        try {
////            us2.validate();
////        } catch (InValidDataException e){
////            System.out.println(e.getMessage());
////        }


//        User user = new User("Chris", 20, "manager");
//        // Serializare
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/user.dat"));
//        oos.writeObject(user);
//        oos.close();
//
//
//        // Deserializare
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/user.dat"));
//        User u = (User) ois.readObject();
//        ois.close();
//        System.out.println(u.name + " " + u.age);
//        ObjectOutputStream oos = new ObjectOutputStream(new
//                FileOutputStream("user.dat"));
//        oos.writeObject(new User("Ion", 30));
//        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"));
        User u = (User) ois.readObject();
        System.out.println(u.name +  u.age);
        ois.close();

    }
}