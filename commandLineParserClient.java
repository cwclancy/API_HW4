package HW4;

public class commandLineParserClient {
    public static void main(String[] args) {
        int ch;
        CommandLineParser parser = new CommandLineParser(args, "abc:");
        parser.setOptErr(1);
        parser.setPosixlyCorrect(true);
        while((ch = parser.getNext(args, "abc:")) != -1) {
            switch(ch) {
                case 'a':
                    System.out.println("Encountered option a");
                    break;

                case 'b':
                    System.out.println("Encountered option b");
                    break;
                case 'c':
                    System.out.println("This option requires an argument and " +
                            "the value is %s" + parser.getOptArg());
                    break;
                case '?':
                    System.out.println("Unknown option character encountered");
                    break;
                default:
                    break;
            }
        }
    }
}
