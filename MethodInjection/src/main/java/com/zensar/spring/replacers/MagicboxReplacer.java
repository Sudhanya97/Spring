package com.zensar.spring.replacers;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MagicboxReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return "a beautiful girl";
	}

}
