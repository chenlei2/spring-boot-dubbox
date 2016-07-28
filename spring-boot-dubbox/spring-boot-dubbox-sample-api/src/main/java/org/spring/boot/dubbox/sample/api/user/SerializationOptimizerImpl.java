package org.spring.boot.dubbox.sample.api.user;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

public class SerializationOptimizerImpl implements SerializationOptimizer {

	@SuppressWarnings("rawtypes")
	@Override
	public Collection<Class> getSerializableClasses() {
		
		List<Class> classes = new LinkedList<Class>();
		classes.add(User.class);
        return classes;
	}

}
