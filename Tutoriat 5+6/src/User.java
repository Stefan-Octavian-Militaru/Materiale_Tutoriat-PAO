import java.io.*;

class User implements Externalizable {

    String name;
    int age;

    public User() {}


    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(age);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException {
        name = in.readUTF();
        age = in.readInt();
    }

}
