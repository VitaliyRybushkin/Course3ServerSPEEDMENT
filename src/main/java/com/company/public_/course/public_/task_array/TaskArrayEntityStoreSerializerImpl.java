package com.company.public_.course.public_.task_array;

import com.company.public_.course.public_.task_array.generated.GeneratedTaskArrayEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named task_array.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class TaskArrayEntityStoreSerializerImpl extends GeneratedTaskArrayEntityStoreSerializerImpl {
    
    public TaskArrayEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}