package HW4;

public @interface CommandLineOption {
    public String[] names() default "";
}
