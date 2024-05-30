import ex1.StackLab;

public class Main {
    public static void main(String[] args) {
        StackLab stackLab = new StackLab();
        stackLab.push(10);
        stackLab.push(20);
        stackLab.push(40);
        stackLab.push(2);
        System.out.println(stackLab.toString());
        stackLab.sortStack();
        System.out.println(stackLab.toString());
    }
}