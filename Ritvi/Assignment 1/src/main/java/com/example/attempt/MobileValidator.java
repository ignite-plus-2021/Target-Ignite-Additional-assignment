package com.example.attempt;

import org.springframework.stereotype.Component;

        import java.util.function.Predicate;
        import java.util.regex.Pattern;

@Component
public class MobileValidator implements Predicate<String> {

    private static final Predicate<String> IS_MOBILE_VALID =
            Pattern.compile(
                    "^(\\d{3}[- .]?){2}\\d{4}$",
                    Pattern.CASE_INSENSITIVE
            ).asPredicate();

    @Override
    public boolean test(String mobile) {
        return IS_MOBILE_VALID.test(mobile);
    }
}
