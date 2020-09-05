package cn.jjdcn.design.proxy;

public class Lawyer implements Speaker {

    private Marry marry = new Marry();

    @Override
    public void speak() {
        System.out.println("lawyer do something~");
        marry.speak();
    }
}
