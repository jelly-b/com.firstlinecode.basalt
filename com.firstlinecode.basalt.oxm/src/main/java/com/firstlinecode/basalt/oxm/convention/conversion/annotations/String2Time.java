package com.firstlinecode.basalt.oxm.convention.conversion.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.firstlinecode.basalt.oxm.convention.conversion.Converter;
import com.firstlinecode.basalt.oxm.conversion.converters.String2TimeConverter;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Converter(String2TimeConverter.class)
public @interface String2Time {

}