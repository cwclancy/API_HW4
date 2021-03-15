package HW4;

public class Args {
   @CommandLineOption(names = {"a", "aa"})
   public boolean a; 

   @CommandLineOption(names = "name")
   public String someName;
}
