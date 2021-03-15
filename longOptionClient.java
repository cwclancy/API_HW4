package HW4;


// This class demonstrates the usage of longOption command for the command
// line parser
public class longOptionClient {
    public static void main(String[] args) {
        int ch;
        LongOptionsObject[] options = {new LongOptionsObject(
                "longOption1", NO_ARGUMENT, null, 'a') };

        new CommandLineParser(args, "abc:", options);
        parser.setPosixlyCorrect(true);
        while((ch = parser.next()) != -1) {
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
