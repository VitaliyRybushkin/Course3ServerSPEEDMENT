package com.company.public_.course.public_.task;

import com.company.public_.course.public_.task.generated.GeneratedTaskEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named task.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class TaskEntityStoreSerializerImpl extends GeneratedTaskEntityStoreSerializerImpl {
    
    public TaskEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}