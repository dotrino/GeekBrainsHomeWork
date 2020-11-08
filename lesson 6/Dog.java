public class Dog extends Animal {

    private int RunLength = 500;
    private int SwimLength = 10;
    private double JumpHeight = 0.5;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= RunLength)) System.out.println("run: true");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= SwimLength)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= JumpHeight)) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}