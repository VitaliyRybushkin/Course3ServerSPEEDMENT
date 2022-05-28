package com.company.public_.course.public_.student.generated;

import com.company.public_.course.public_.student.Student;
import com.company.public_.course.public_.student.StudentEntityStoreSerializerImpl;
import com.company.public_.course.public_.student.StudentManager;
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
 * StudentManager}.
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
public final class GeneratedStudentCacheHolder implements EntityStoreHolder<Student> {
    
    private final EntityStore<Student> entityStore;
    private final OfInt fieldIdCache;
    private final OfString fieldLoginCache;
    private final OfString fieldPasswordCache;
    private final OfString fieldInfoCache;
    private final OfString fieldFullnameCache;
    
    public GeneratedStudentCacheHolder(
            EntityStore<Student> entityStore,
            OfInt fieldIdCache,
            OfString fieldLoginCache,
            OfString fieldPasswordCache,
            OfString fieldInfoCache,
            OfString fieldFullnameCache) {
        
        this.entityStore        = requireNonNull(entityStore);
        this.fieldIdCache       = requireNonNull(fieldIdCache);
        this.fieldLoginCache    = requireNonNull(fieldLoginCache);
        this.fieldPasswordCache = requireNonNull(fieldPasswordCache);
        this.fieldInfoCache     = requireNonNull(fieldInfoCache);
        this.fieldFullnameCache = requireNonNull(fieldFullnameCache);
    }
    
    @Override
    public EntityStore<Student> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Student> columnId) {
        if (columnId instanceof Student.Identifier) {
            final Student.Identifier _id = (Student.Identifier) columnId;
            switch (_id) {
                case ID       : return (CACHE) fieldIdCache;
                case LOGIN    : return (CACHE) fieldLoginCache;
                case PASSWORD : return (CACHE) fieldPasswordCache;
                case INFO     : return (CACHE) fieldInfoCache;
                case FULLNAME : return (CACHE) fieldFullnameCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "id"       : return (CACHE) fieldIdCache;
                case "login"    : return (CACHE) fieldLoginCache;
                case "password" : return (CACHE) fieldPasswordCache;
                case "info"     : return (CACHE) fieldInfoCache;
                case "fullname" : return (CACHE) fieldFullnameCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Student> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedStudentCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            StudentEntityStoreSerializerImpl::new,
            TableIdentifier.of("Course", "public", "student")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Student> recycleAndPersist(PersistOperation<Student> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Student> recycleAndRemove(RemoveOperation<Student> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Student> recycleAndUpdate(UpdateOperation<Student> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Student> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Student>, FieldCache<?>>>of(
            Tuples.of(Student.ID,      fieldIdCache),
            Tuples.of(Student.LOGIN,   fieldLoginCache),
            Tuples.of(Student.PASSWORD,fieldPasswordCache),
            Tuples.of(Student.INFO,    fieldInfoCache),
            Tuples.of(Student.FULLNAME,fieldFullnameCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Student>> columnIdentifiers = Stream.<HasIdentifier<Student>>of(
            Student.ID,
            Student.LOGIN,
            Student.PASSWORD,
            Student.INFO,
            Student.FULLNAME
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
    
    public static CompletableFuture<GeneratedStudentCacheHolder> reload(CompletableFuture<EntityStore<Student>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfInt> fieldIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Student.ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfString> fieldLoginCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Student.LOGIN, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldPasswordCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Student.PASSWORD, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldInfoCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Student.INFO, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldFullnameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Student.FULLNAME, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedStudentCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldLoginCacheFuture.get(),
                    fieldPasswordCacheFuture.get(),
                    fieldInfoCacheFuture.get(),
                    fieldFullnameCacheFuture.get()
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
        fieldLoginCache.close();
        fieldPasswordCache.close();
        fieldInfoCache.close();
        fieldFullnameCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Student.Identifier.ID,
                Student.Identifier.LOGIN,
                Student.Identifier.PASSWORD,
                Student.Identifier.INFO,
                Student.Identifier.FULLNAME
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}