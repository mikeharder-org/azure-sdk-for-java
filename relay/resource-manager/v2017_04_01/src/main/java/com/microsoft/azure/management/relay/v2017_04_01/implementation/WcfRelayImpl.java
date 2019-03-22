/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2017_04_01.implementation;

import com.microsoft.azure.management.relay.v2017_04_01.WcfRelay;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.relay.v2017_04_01.Relaytype;

class WcfRelayImpl extends CreatableUpdatableImpl<WcfRelay, WcfRelayInner, WcfRelayImpl> implements WcfRelay, WcfRelay.Definition, WcfRelay.Update {
    private final RelayManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String relayName;

    WcfRelayImpl(String name, RelayManager manager) {
        super(name, new WcfRelayInner());
        this.manager = manager;
        // Set resource name
        this.relayName = name;
        //
    }

    WcfRelayImpl(WcfRelayInner inner, RelayManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.relayName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.relayName = IdParsingUtils.getValueFromIdByName(inner.id(), "wcfRelays");
        //
    }

    @Override
    public RelayManager manager() {
        return this.manager;
    }

    @Override
    public Observable<WcfRelay> createResourceAsync() {
        WCFRelaysInner client = this.manager().inner().wCFRelays();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.relayName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<WcfRelay> updateResourceAsync() {
        WCFRelaysInner client = this.manager().inner().wCFRelays();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.relayName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<WcfRelayInner> getInnerAsync() {
        WCFRelaysInner client = this.manager().inner().wCFRelays();
        return client.getAsync(this.resourceGroupName, this.namespaceName, this.relayName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime createdAt() {
        return this.inner().createdAt();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isDynamic() {
        return this.inner().isDynamic();
    }

    @Override
    public Integer listenerCount() {
        return this.inner().listenerCount();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Relaytype relayType() {
        return this.inner().relayType();
    }

    @Override
    public Boolean requiresClientAuthorization() {
        return this.inner().requiresClientAuthorization();
    }

    @Override
    public Boolean requiresTransportSecurity() {
        return this.inner().requiresTransportSecurity();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime updatedAt() {
        return this.inner().updatedAt();
    }

    @Override
    public String userMetadata() {
        return this.inner().userMetadata();
    }

    @Override
    public WcfRelayImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    @Override
    public WcfRelayImpl withRelayType(Relaytype relayType) {
        this.inner().withRelayType(relayType);
        return this;
    }

    @Override
    public WcfRelayImpl withRequiresClientAuthorization(Boolean requiresClientAuthorization) {
        this.inner().withRequiresClientAuthorization(requiresClientAuthorization);
        return this;
    }

    @Override
    public WcfRelayImpl withRequiresTransportSecurity(Boolean requiresTransportSecurity) {
        this.inner().withRequiresTransportSecurity(requiresTransportSecurity);
        return this;
    }

    @Override
    public WcfRelayImpl withUserMetadata(String userMetadata) {
        this.inner().withUserMetadata(userMetadata);
        return this;
    }

}
