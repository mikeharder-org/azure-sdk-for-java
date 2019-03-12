/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Distcp settings.
 */
public class DistcpSettings {
    /**
     * Specifies the Yarn ResourceManager endpoint. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "resourceManagerEndpoint", required = true)
    private Object resourceManagerEndpoint;

    /**
     * Specifies an existing folder path which will be used to store temp
     * Distcp command script. The script file is generated by ADF and will be
     * removed after Copy job finished. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "tempScriptPath", required = true)
    private Object tempScriptPath;

    /**
     * Specifies the Distcp options. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "distcpOptions")
    private Object distcpOptions;

    /**
     * Get specifies the Yarn ResourceManager endpoint. Type: string (or Expression with resultType string).
     *
     * @return the resourceManagerEndpoint value
     */
    public Object resourceManagerEndpoint() {
        return this.resourceManagerEndpoint;
    }

    /**
     * Set specifies the Yarn ResourceManager endpoint. Type: string (or Expression with resultType string).
     *
     * @param resourceManagerEndpoint the resourceManagerEndpoint value to set
     * @return the DistcpSettings object itself.
     */
    public DistcpSettings withResourceManagerEndpoint(Object resourceManagerEndpoint) {
        this.resourceManagerEndpoint = resourceManagerEndpoint;
        return this;
    }

    /**
     * Get specifies an existing folder path which will be used to store temp Distcp command script. The script file is generated by ADF and will be removed after Copy job finished. Type: string (or Expression with resultType string).
     *
     * @return the tempScriptPath value
     */
    public Object tempScriptPath() {
        return this.tempScriptPath;
    }

    /**
     * Set specifies an existing folder path which will be used to store temp Distcp command script. The script file is generated by ADF and will be removed after Copy job finished. Type: string (or Expression with resultType string).
     *
     * @param tempScriptPath the tempScriptPath value to set
     * @return the DistcpSettings object itself.
     */
    public DistcpSettings withTempScriptPath(Object tempScriptPath) {
        this.tempScriptPath = tempScriptPath;
        return this;
    }

    /**
     * Get specifies the Distcp options. Type: string (or Expression with resultType string).
     *
     * @return the distcpOptions value
     */
    public Object distcpOptions() {
        return this.distcpOptions;
    }

    /**
     * Set specifies the Distcp options. Type: string (or Expression with resultType string).
     *
     * @param distcpOptions the distcpOptions value to set
     * @return the DistcpSettings object itself.
     */
    public DistcpSettings withDistcpOptions(Object distcpOptions) {
        this.distcpOptions = distcpOptions;
        return this;
    }

}
