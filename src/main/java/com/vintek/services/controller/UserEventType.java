package com.vintek.services.controller;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

@Qualifier
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
public @interface UserEventType {
	String eventType();
}
