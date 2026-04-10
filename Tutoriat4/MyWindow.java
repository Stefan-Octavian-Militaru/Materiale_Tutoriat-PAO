public class MyWindow extends WindowAdapter {
    public MyWindow() {
        System.out.println("MyWindow has been created");
    }

    @Override
    public void onOpen(){
        System.out.println("MyWindow has been opened");
    }
    @Override
    public void onClose(){
        System.out.println("MyWindow has been closed");
    }

}
