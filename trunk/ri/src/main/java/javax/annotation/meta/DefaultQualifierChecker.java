package javax.annotation.meta;

import java.lang.annotation.Annotation;


public class DefaultQualifierChecker<A extends Annotation> 
   implements QualifierChecker<A> {

	public When forConstantValue(A annotation, Object value) {
		String name = annotation.getClass().getName();
		String defaultCheckerName = name +"$Checker";
		try {
			Class<?> checkerClass = Class.forName(defaultCheckerName);
			QualifierChecker<A> checker = (QualifierChecker<A>) checkerClass.newInstance();
			return checker.forConstantValue(annotation, value);
		} catch (ClassNotFoundException e) {
			return When.UNKNOWN;
		} catch (ClassCastException e) {
			return When.UNKNOWN;
		} catch (InstantiationException e) {
			return When.UNKNOWN;
		} catch (IllegalAccessException e) {
			return When.UNKNOWN;
		}
	}

}
