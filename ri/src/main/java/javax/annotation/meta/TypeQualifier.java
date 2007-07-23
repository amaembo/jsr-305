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
public @interface TypeQualifier {
	/** Describes the kinds of values the qualifier can be applied to. If a numeric class is provided (e.g., Number.class or Integer.class) 
	 * then the annotation can also be applied to the corresponding primitive numeric types. */
	Class <?> applicableTo() default Object.class;
	/** defines which When values the annotation is strict with respect to */
	When [] strict() default {};
	/** If this qualifier defines a value, are the distinct values mutually exclusive?
	 * 
	 * For example, the following defines a type qualifier such that if you know
	 * a value is  @Foo(Color.Red), then the value cannot be @Foo(Color.Blue) or @Foo(Color.Green).
	 *  
	 * <code>
	 * @TypeQualifier(exclusive=true) @interface Foo {
	 *     enum Color {RED, BLUE, GREEN};
	 *     Color value();
	 *     }
	 *  </code>
	 *   
	 *  */
	
	boolean exclusive() default false;
	/** If this qualifier defines an enum value, are the distinct values exhaustive?
	 * For example, the following defines a type qualifier such that if you know
	 * a value is neither @Foo(Color.Red) or @Foo(Color.Blue), then the value must be
	 * @Foo(Color.Green).
	 *  
	 * <code>
	 * @TypeQualifier(exhaustive=true) @interface Foo {
	 *     enum Color {RED, BLUE, GREEN};
	 *     Color value();
	 *     }
	 *  </code>
	 *   
	 *  */
	boolean exhaustive() default false;
	

}

