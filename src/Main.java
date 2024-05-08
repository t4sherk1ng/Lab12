import ex1.StackLab;

public class Main {
    public static void main(String[] args) {
        StackLab stackLab = new StackLab();
        stackLab.push(10);
        stackLab.push(20);
        System.out.println(stackLab.toString());
        System.out.println(stackLab.pop());
        System.out.println(stackLab.pop());
    }
}