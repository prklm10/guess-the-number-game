package academy.learnprogramming;


import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD}) // context in which annotation type is applicable i.e fields,parameter and methods;
@Retention(RetentionPolicy.RUNTIME) // how long retention is going to be.
@Qualifier // It is used to annotate another custom annotation
public @interface MinNumber {

    
}
