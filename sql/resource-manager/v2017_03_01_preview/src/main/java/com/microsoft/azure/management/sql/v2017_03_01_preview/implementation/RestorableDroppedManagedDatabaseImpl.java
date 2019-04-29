/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.RestorableDroppedManagedDatabase;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.Map;

class RestorableDroppedManagedDatabaseImpl extends IndexableRefreshableWrapperImpl<RestorableDroppedManagedDatabase, RestorableDroppedManagedDatabaseInner> implements RestorableDroppedManagedDatabase {
    private final SqlManager manager;
    private String resourceGroupName;
    private String managedInstanceName;
    private String restorableDroppedDatabaseId;

    RestorableDroppedManagedDatabaseImpl(RestorableDroppedManagedDatabaseInner inner,  SqlManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.managedInstanceName = IdParsingUtils.getValueFromIdByName(inner.id(), "managedInstances");
        this.restorableDroppedDatabaseId = IdParsingUtils.getValueFromIdByName(inner.id(), "restorableDroppedDatabases");
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<RestorableDroppedManagedDatabaseInner> getInnerAsync() {
        RestorableDroppedManagedDatabasesInner client = this.manager().inner().restorableDroppedManagedDatabases();
        return client.getAsync(this.resourceGroupName, this.managedInstanceName, this.restorableDroppedDatabaseId);
    }



    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String databaseName() {
        return this.inner().databaseName();
    }

    @Override
    public DateTime deletionDate() {
        return this.inner().deletionDate();
    }

    @Override
    public DateTime earliestRestoreDate() {
        return this.inner().earliestRestoreDate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}