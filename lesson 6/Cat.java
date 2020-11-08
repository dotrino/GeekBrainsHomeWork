public class Cat extends Animal {

    private int RunLength = 200;
    private double JumpHeight = 2;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= RunLength)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("swim: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= JumpHeight)) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}