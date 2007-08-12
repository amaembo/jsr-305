package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;


@Documented
@TypeQualifierNickname
@Nonnull(when=When.MAYBE_NOT)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckForNull {
    ElementType[] defaultFor() default {};

}
