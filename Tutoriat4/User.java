public class User implements Auditable {
    String name;
    int id;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
