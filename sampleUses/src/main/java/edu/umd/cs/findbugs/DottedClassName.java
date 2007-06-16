package edu.umd.cs.findbugs;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.Qualifier;
import javax.annotation.meta.When;

@Documented
@Qualifier(applicableTo=String.class)
@DottedClassName(when = When.NEVER)
@Retention(RetentionPolicy.RUNTIME)
public @interface DottedClassName {
	When when() default When.ALWAYS;

	ElementType[] applyTo() default {};
}
