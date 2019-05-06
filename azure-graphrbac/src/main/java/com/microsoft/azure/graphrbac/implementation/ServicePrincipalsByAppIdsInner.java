/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.graphrbac.GraphErrorException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ServicePrincipalsByAppIds.
 */
public class ServicePrincipalsByAppIdsInner {
    /** The Retrofit service to perform REST calls. */
    private ServicePrincipalsByAppIdsService service;
    /** The service client containing this operation class. */
    private GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of ServicePrincipalsByAppIdsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServicePrincipalsByAppIdsInner(Retrofit retrofit, GraphRbacManagementClientImpl client) {
        this.service = retrofit.create(ServicePrincipalsByAppIdsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServicePrincipalsByAppIds to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServicePrincipalsByAppIdsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.ServicePrincipalsByAppIds get" })
        @GET("{tenantID}/servicePrincipalsByAppId/{applicationID}/objectId")
        Observable<Response<ResponseBody>> get(@Path("tenantID") String tenantID, @Path("applicationID") String applicationID, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets an object id for a given application id from the current tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws GraphErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServicePrincipalObjectResultInner object if successful.
     */
    public ServicePrincipalObjectResultInner get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets an object id for a given application id from the current tenant.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServicePrincipalObjectResultInner> getAsync(final ServiceCallback<ServicePrincipalObjectResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets an object id for a given application id from the current tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServicePrincipalObjectResultInner object
     */
    public Observable<ServicePrincipalObjectResultInner> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<ServicePrincipalObjectResultInner>, ServicePrincipalObjectResultInner>() {
            @Override
            public ServicePrincipalObjectResultInner call(ServiceResponse<ServicePrincipalObjectResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets an object id for a given application id from the current tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServicePrincipalObjectResultInner object
     */
    public Observable<ServiceResponse<ServicePrincipalObjectResultInner>> getWithServiceResponseAsync() {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.applicationID() == null) {
            throw new IllegalArgumentException("Parameter this.client.applicationID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.tenantID(), this.client.applicationID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServicePrincipalObjectResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ServicePrincipalObjectResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServicePrincipalObjectResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServicePrincipalObjectResultInner> getDelegate(Response<ResponseBody> response) throws GraphErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServicePrincipalObjectResultInner, GraphErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServicePrincipalObjectResultInner>() { }.getType())
                .registerError(GraphErrorException.class)
                .build(response);
    }

}