package com.company.public_.course.public_.task.generated;

import com.company.public_.course.public_.task.Task;
import com.company.public_.course.public_.task.TaskEntityStoreSerializerImpl;
import com.company.public_.course.public_.task.TaskManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfInt;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfString;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache;
import com.speedment.enterprise.datastore.runtime.fieldcache.MultiFieldCache;
import com.speedment.enterprise.datastore.runtime.statistic.Statistics;
import com.speedment.enterprise.datastore.runtime.util.DataStoreHolderUtil;
import com.speedment.enterprise.datastore.runtime.util.StatisticsUtil;
import com.speedment.runtime.bulk.PersistOperation;
import com.speedment.runtime.bulk.RemoveOperation;
import com.speedment.runtime.bulk.UpdateOperation;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.ColumnLabel;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.StreamSupplierComponent;
import com.speedment.runtime.field.Field;
import com.speedment.runtime.field.trait.HasIdentifier;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/**
 * A holder class for the various caches that are used to speed up the {@link
 * TaskManager}.
 * 
 * Generated by
 * com.speedment.enterprise.datastore.generator.internal.code.GeneratedEntityCacheHolderTranslator
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public final class GeneratedTaskCacheHolder implements EntityStoreHolder<Task> {
    
    private final EntityStore<Task> entityStore;
    private final OfInt fieldIdCache;
    private final OfString fieldInfoCache;
    private final OfString fieldAnswerCache;
    
    public GeneratedTaskCacheHolder(
            EntityStore<Task> entityStore,
            OfInt fieldIdCache,
            OfString fieldInfoCache,
            OfString fieldAnswerCache) {
        
        this.entityStore      = requireNonNull(entityStore);
        this.fieldIdCache     = requireNonNull(fieldIdCache);
        this.fieldInfoCache   = requireNonNull(fieldInfoCache);
        this.fieldAnswerCache = requireNonNull(fieldAnswerCache);
    }
    
    @Override
    public EntityStore<Task> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Task> columnId) {
        if (columnId instanceof Task.Identifier) {
            final Task.Identifier _id = (Task.Identifier) columnId;
            switch (_id) {
                case ID     : return (CACHE) fieldIdCache;
                case INFO   : return (CACHE) fieldInfoCache;
                case ANSWER : return (CACHE) fieldAnswerCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "id"     : return (CACHE) fieldIdCache;
                case "info"   : return (CACHE) fieldInfoCache;
                case "answer" : return (CACHE) fieldAnswerCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Task> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedTaskCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            TaskEntityStoreSerializerImpl::new,
            TableIdentifier.of("Course", "public", "task")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Task> recycleAndPersist(PersistOperation<Task> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Task> recycleAndRemove(RemoveOperation<Task> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Task> recycleAndUpdate(UpdateOperation<Task> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Task> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Task>, FieldCache<?>>>of(
            Tuples.of(Task.ID,    fieldIdCache),
            Tuples.of(Task.INFO,  fieldInfoCache),
            Tuples.of(Task.ANSWER,fieldAnswerCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Task>> columnIdentifiers = Stream.<HasIdentifier<Task>>of(
            Task.ID,
            Task.INFO,
            Task.ANSWER
        )
            .map(HasIdentifier::identifier)
            .collect(toSet());
        return EntityStoreHolder.of(
            entityStore,
            fieldCaches,
            multiFieldCaches,
            columnIdentifiers
        );
    }
    
    public static CompletableFuture<GeneratedTaskCacheHolder> reload(CompletableFuture<EntityStore<Task>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfInt> fieldIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Task.ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfString> fieldInfoCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Task.INFO, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldAnswerCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Task.ANSWER, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedTaskCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldInfoCacheFuture.get(),
                    fieldAnswerCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldIdCache.close();
        fieldInfoCache.close();
        fieldAnswerCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Task.Identifier.ID,
                Task.Identifier.INFO,
                Task.Identifier.ANSWER
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}