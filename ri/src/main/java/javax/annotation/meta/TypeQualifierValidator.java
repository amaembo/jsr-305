package javax.annotation.meta;

import java.lang.annotation.Annotation;

import javax.annotation.Nonnull;

public interface TypeQualifierValidator<A extends Annotation> {
    /**
     * Given a type qualifier, check to see if a value is an instance of the
     * set of values denoted by the qualifier
     * @param annotation
     * @param annotationArgument
     * @param value
     * @return
     */
	public @Nonnull When forConstantValue(@Nonnull A qualifierqualifierArgument, Object value);
}
