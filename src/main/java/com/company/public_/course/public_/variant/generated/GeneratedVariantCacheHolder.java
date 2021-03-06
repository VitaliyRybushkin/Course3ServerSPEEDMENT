package com.company.public_.course.public_.variant.generated;

import com.company.public_.course.public_.variant.Variant;
import com.company.public_.course.public_.variant.VariantEntityStoreSerializerImpl;
import com.company.public_.course.public_.variant.VariantManager;
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
 * VariantManager}.
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
public final class GeneratedVariantCacheHolder implements EntityStoreHolder<Variant> {
    
    private final EntityStore<Variant> entityStore;
    private final OfInt fieldIdCache;
    private final OfString fieldInfoCache;
    
    public GeneratedVariantCacheHolder(
            EntityStore<Variant> entityStore,
            OfInt fieldIdCache,
            OfString fieldInfoCache) {
        
        this.entityStore    = requireNonNull(entityStore);
        this.fieldIdCache   = requireNonNull(fieldIdCache);
        this.fieldInfoCache = requireNonNull(fieldInfoCache);
    }
    
    @Override
    public EntityStore<Variant> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Variant> columnId) {
        if (columnId instanceof Variant.Identifier) {
            final Variant.Identifier _id = (Variant.Identifier) columnId;
            switch (_id) {
                case ID   : return (CACHE) fieldIdCache;
                case INFO : return (CACHE) fieldInfoCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "id"   : return (CACHE) fieldIdCache;
                case "info" : return (CACHE) fieldInfoCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Variant> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedVariantCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            VariantEntityStoreSerializerImpl::new,
            TableIdentifier.of("Course", "public", "variant")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Variant> recycleAndPersist(PersistOperation<Variant> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Variant> recycleAndRemove(RemoveOperation<Variant> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Variant> recycleAndUpdate(UpdateOperation<Variant> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Variant> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Variant>, FieldCache<?>>>of(
            Tuples.of(Variant.ID,  fieldIdCache),
            Tuples.of(Variant.INFO,fieldInfoCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Variant>> columnIdentifiers = Stream.<HasIdentifier<Variant>>of(
            Variant.ID,
            Variant.INFO
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
    
    public static CompletableFuture<GeneratedVariantCacheHolder> reload(CompletableFuture<EntityStore<Variant>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfInt> fieldIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Variant.ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfString> fieldInfoCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Variant.INFO, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedVariantCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldInfoCacheFuture.get()
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
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Variant.Identifier.ID,
                Variant.Identifier.INFO
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}