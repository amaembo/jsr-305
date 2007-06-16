import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.Pattern;
import javax.annotation.meta.QualifierNickname;

@Documented
@QualifierNickname
@Pattern("[0-9]{3}-[0-9]{2}-[0-9]{4}")
@Retention(RetentionPolicy.RUNTIME)
public @interface SocialSecurityNumber {
	ElementType[] applyTo() default {};
}
