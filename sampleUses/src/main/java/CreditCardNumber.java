import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.Pattern;
import javax.annotation.meta.Qualifier;
import javax.annotation.meta.QualifierChecker;
import javax.annotation.meta.When;

@Documented
@Qualifier
@Pattern("[0-9]{16}")
@Retention(RetentionPolicy.RUNTIME)
public @interface CreditCardNumber {
	ElementType[] applyTo() default {};

	class Checker implements QualifierChecker<CreditCardNumber> {

		public When forConstantValue(CreditCardNumber annotation, Object v) {
			if (!(v instanceof String))
				return When.NEVER;
			String s = (String) v;
			if (LuhnVerification.checkNumber(s))
				return When.ALWAYS;
			return When.NEVER;
		}
	}
}
