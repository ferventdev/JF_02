package t07;

import java.lang.annotation.*;

/**
 * Created by Aleksandr Shevkunenko on 22.06.2017.
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ExtraInfo {
    String value() default "N/A";
}
