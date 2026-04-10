public abstract class WindowAdapter implements WindowListener {
    public void onOpen()
    {
        System.out.println("Method cannot be accessed from this class");
    }
    public void onClose(){
        System.out.println("Method cannot be accessed from this class");
    }
    public void onResize(){
        System.out.println("Method cannot be accessed from this class");
    }
}
