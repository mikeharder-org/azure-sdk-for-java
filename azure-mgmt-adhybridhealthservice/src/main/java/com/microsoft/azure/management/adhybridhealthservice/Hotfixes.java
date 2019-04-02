/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of hotfixes installed in the server.
 */
public class Hotfixes {
    /**
     * The value returned by the operation.
     */
    @JsonProperty(value = "value")
    private List<Hotfix> value;

    /**
     * Get the value returned by the operation.
     *
     * @return the value value
     */
    public List<Hotfix> value() {
        return this.value;
    }

    /**
     * Set the value returned by the operation.
     *
     * @param value the value value to set
     * @return the Hotfixes object itself.
     */
    public Hotfixes withValue(List<Hotfix> value) {
        this.value = value;
        return this;
    }

}