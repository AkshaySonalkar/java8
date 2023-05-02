package optional;

import java.util.Optional;

public class OpetionalExample {
    public static void main(String[] args) throws Exception {
        Optional<String> opt = Optional.empty();
        System.out.println(opt.isPresent());

        Optional<String> opt1 = Optional.of(new String("Akshay"));
        System.out.println(opt1.get());

        Optional<String> opt2 = Optional.ofNullable(null);
        System.out.println(opt2.isPresent());

        Optional<String> opt3 = Optional.ofNullable("Sonalkar");
        System.out.println(opt3.get());

        String value = "value";
        Optional<String> valueOpt = Optional.ofNullable(value);
        String result = valueOpt.orElseThrow(Exception::new).toUpperCase();
        System.out.println(result);
     }
}
