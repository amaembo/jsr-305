import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.Qualifier;
import javax.annotation.meta.QualifierChecker;
import javax.annotation.meta.When;

@Documented
@Qualifier(applicableTo=String.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface FixedLengthString {
	int value();

	ElementType[] applyTo() default {};

	class Checker implements QualifierChecker<FixedLengthString> {

		public When forConstantValue(FixedLengthString annotation, Object v) {
			if (!(v instanceof String))
				return When.NEVER;
			String s = (String) v;
			if (s.length() == annotation.value())
				return When.ALWAYS;
			return When.NEVER;
		}
	}
}