/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.consumption.v2018_01_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2018_01_31.ReservationsSummaries;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.consumption.v2018_01_31.ReservationSummaries;
import com.microsoft.azure.management.consumption.v2018_01_31.Datagrain;

class ReservationsSummariesImpl extends WrapperImpl<ReservationsSummariesInner> implements ReservationsSummaries {
    private final ConsumptionManager manager;

    ReservationsSummariesImpl(ConsumptionManager manager) {
        super(manager.inner().reservationsSummaries());
        this.manager = manager;
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ReservationSummaries> listByReservationOrderAsync(final String reservationOrderId, final Datagrain grain) {
        ReservationsSummariesInner client = this.inner();
        return client.listByReservationOrderAsync(reservationOrderId, grain)
        .flatMapIterable(new Func1<Page<ReservationSummariesInner>, Iterable<ReservationSummariesInner>>() {
            @Override
            public Iterable<ReservationSummariesInner> call(Page<ReservationSummariesInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ReservationSummariesInner, ReservationSummaries>() {
            @Override
            public ReservationSummaries call(ReservationSummariesInner inner) {
                return new ReservationSummariesImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ReservationSummaries> listByReservationOrderAndReservationAsync(final String reservationOrderId, final String reservationId, final Datagrain grain) {
        ReservationsSummariesInner client = this.inner();
        return client.listByReservationOrderAndReservationAsync(reservationOrderId, reservationId, grain)
        .flatMapIterable(new Func1<Page<ReservationSummariesInner>, Iterable<ReservationSummariesInner>>() {
            @Override
            public Iterable<ReservationSummariesInner> call(Page<ReservationSummariesInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ReservationSummariesInner, ReservationSummaries>() {
            @Override
            public ReservationSummaries call(ReservationSummariesInner inner) {
                return new ReservationSummariesImpl(inner, manager());
            }
        });
    }

}