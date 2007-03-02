package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.meta.Qualifier;
import javax.annotation.meta.When;

@Documented
public @interface PropertyKey {
	When when() default When.ALWAYS;
	ElementType[] applyTo() default {};
}
