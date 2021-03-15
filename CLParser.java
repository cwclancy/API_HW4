package HW4;

public class CLParser {
    public CLParser(Object command) {}


    public void parse(String[] args) {}

    public static void main(String[] args) {
        Args argsClass = new Args();
        new CLParser(argsClass).parse(args);
        if (argsClass.a) {
            System.out.println(argsClass.someName);
        }
    }
}