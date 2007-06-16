package java.sql;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.Qualifier;

@Documented
@Qualifier(strict = true,applicableTo=Integer.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ResultSetHoldability {

}
