package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

@Documented
@TypeQualifier(applicableTo=String.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Pattern {
	@RegEx String value();
	int flags() default 0;
    ElementType[] defaultFor() default {};
	
	static class Checker implements TypeQualifierValidator<Pattern> {
		public When forConstantValue(Pattern annotation, Object value) {
			java.util.regex.Pattern p = java.util.regex.Pattern.compile(annotation.value(), annotation.flags());
			if (p.matcher(((String)value)).matches())
				return When.ALWAYS;
			return When.NEVER;
		}
		
	}
}
