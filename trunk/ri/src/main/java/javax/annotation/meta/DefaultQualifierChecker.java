package javax.annotation.meta;

import java.lang.annotation.Annotation;


public class DefaultQualifierChecker<A extends Annotation> 
   implements QualifierChecker<A> {

	public When forConstantValue(A annotation, Object value) {
		return When.UNKNOWN;
	}

}
