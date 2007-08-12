package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

@Documented
@TypeQualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Nonnull {
	When when() default When.ALWAYS;
	ElementType[] defaultFor() default {};
	static class Checker implements TypeQualifierValidator<Nonnull> {

		public When forConstantValue(Nonnull qualifierqualifierArgument,
				Object value) {
			if (value == null) return When.NEVER;
			return When.ALWAYS;
		}
	}
}
