package javax.annotation.meta;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This qualifier is applied to an annotation to denote that the annotation
 * should be treated as a type qualifier.
 */

@Documented
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Qualifier {
	Class <?> applicableTo() default Object.class;
	boolean strict() default false;
	Class <? extends QualifierChecker> checker() 
            default  DefaultQualifierChecker.class;
}
