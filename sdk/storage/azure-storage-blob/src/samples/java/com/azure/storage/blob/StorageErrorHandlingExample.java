// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob;

import com.azure.core.http.HttpResponse;
import com.azure.storage.blob.models.StorageErrorCode;

/**
 * This example shows how to handle errors thrown by various XxxURL methods. Any client-side error will be
 * propagated unmodified. However, any response from the service with an unexpected status code will be wrapped in a
 * StorageException. If the pipeline includes the RequestRetryFactory, which is the default, some of these errors
 * will be automatically retried if it makes sense to do so. The StorageException type exposes rich error
 * information returned by the service.
 */
public class StorageErrorHandlingExample {

    /**
     * Entry point into error handling example for Storage blobs.
     * @param args Unused. Arguments to the program.
     */
    public static void main(String[] args) {
        ContainerClient containerClient = new ContainerClientBuilder().endpoint("https://account.blob.core.windows.net/mycontainer")
            .buildClient();

        try {

            /*
             * An error occurred while creating the container.
             */
            containerClient.create();
        } catch (StorageException e) {

            /*
             * StorageErrorCode defines constants corresponding to all error codes returned by the service.
             */
            if (e.errorCode() == StorageErrorCode.RESOURCE_NOT_FOUND) {

                /*
                 * Log more detailed information.
                 */
                System.out.println("Extended details: " + e.getMessage());

                /*
                 * Examine the raw response.
                 */
                HttpResponse response = e.response();
                System.out.println("Error creating the container with status code: " + response.statusCode());
            } else if (e.errorCode() == StorageErrorCode.CONTAINER_BEING_DELETED) {

                /*
                 * Log more detailed information.
                 */
                System.out.println("Extended details: " + e.getMessage());

            } else if (e.errorCode() == StorageErrorCode.CONTAINER_ALREADY_EXISTS) {

                /*
                 * Process the error.
                 */
                System.out.println("The container url is " + containerClient.toString());
            }
        }
    }
}
