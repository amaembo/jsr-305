package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.When;

/** Used to annotate a value that should only contain nonnegative values */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Nonnegative {
	When when() default When.ALWAYS;
	ElementType[] applyTo() default {};
}
