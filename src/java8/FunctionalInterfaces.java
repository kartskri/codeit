package java8;

@FunctionalInterface
interface Foo {
    String appender(String string);
}


public class FunctionalInterfaces {
    public String add(String string, Foo foo) {
        return foo.appender(string);
    }

    public static void main(String[] args) {
        // Foo foo = parameter -> parameter + " from Lambda";
        Foo fooByIC = new Foo() {
            @Override
            public String appender(String string) {
                return string + " from Foo";
            }
        };
        System.out.println(new FunctionalInterfaces().add("Test", fooByIC));
    }
}
