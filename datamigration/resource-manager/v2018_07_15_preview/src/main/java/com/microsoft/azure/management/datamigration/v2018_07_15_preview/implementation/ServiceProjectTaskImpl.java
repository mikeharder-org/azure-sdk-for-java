/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview.implementation;

import com.microsoft.azure.management.datamigration.v2018_07_15_preview.ServiceProjectTask;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.ProjectTaskProperties;

class ServiceProjectTaskImpl extends CreatableUpdatableImpl<ServiceProjectTask, ProjectTaskInner, ServiceProjectTaskImpl> implements ServiceProjectTask, ServiceProjectTask.Definition, ServiceProjectTask.Update {
    private final DataMigrationManager manager;
    private String groupName;
    private String serviceName;
    private String taskName;

    ServiceProjectTaskImpl(String name, DataMigrationManager manager) {
        super(name, new ProjectTaskInner());
        this.manager = manager;
        // Set resource name
        this.taskName = name;
        //
    }

    ServiceProjectTaskImpl(ProjectTaskInner inner, DataMigrationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.taskName = inner.name();
        // set resource ancestor and positional variables
        this.groupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "services");
        this.taskName = IdParsingUtils.getValueFromIdByName(inner.id(), "serviceTasks");
        //
    }

    @Override
    public DataMigrationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServiceProjectTask> createResourceAsync() {
        ServiceTasksInner client = this.manager().inner().serviceTasks();
        return client.createOrUpdateAsync(this.groupName, this.serviceName, this.taskName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServiceProjectTask> updateResourceAsync() {
        ServiceTasksInner client = this.manager().inner().serviceTasks();
        return client.updateAsync(this.groupName, this.serviceName, this.taskName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ProjectTaskInner> getInnerAsync() {
        ServiceTasksInner client = this.manager().inner().serviceTasks();
        return client.getAsync(this.groupName, this.serviceName, this.taskName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProjectTaskProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ServiceProjectTaskImpl withExistingService(String groupName, String serviceName) {
        this.groupName = groupName;
        this.serviceName = serviceName;
        return this;
    }

    @Override
    public ServiceProjectTaskImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public ServiceProjectTaskImpl withProperties(ProjectTaskProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
