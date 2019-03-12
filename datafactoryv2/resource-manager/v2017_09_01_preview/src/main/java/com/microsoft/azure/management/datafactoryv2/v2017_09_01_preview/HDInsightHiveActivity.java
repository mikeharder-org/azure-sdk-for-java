/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * HDInsight Hive activity type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HDInsightHive")
@JsonFlatten
public class HDInsightHiveActivity extends ExecutionActivity {
    /**
     * Storage linked service references.
     */
    @JsonProperty(value = "typeProperties.storageLinkedServices")
    private List<LinkedServiceReference> storageLinkedServices;

    /**
     * User specified arguments to HDInsightActivity.
     */
    @JsonProperty(value = "typeProperties.arguments")
    private List<Object> arguments;

    /**
     * Debug info option. Possible values include: 'None', 'Always', 'Failure'.
     */
    @JsonProperty(value = "typeProperties.getDebugInfo")
    private HDInsightActivityDebugInfoOption getDebugInfo;

    /**
     * Script path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.scriptPath")
    private Object scriptPath;

    /**
     * Script linked service reference.
     */
    @JsonProperty(value = "typeProperties.scriptLinkedService")
    private LinkedServiceReference scriptLinkedService;

    /**
     * Allows user to specify defines for Hive job request.
     */
    @JsonProperty(value = "typeProperties.defines")
    private Map<String, Object> defines;

    /**
     * Get storage linked service references.
     *
     * @return the storageLinkedServices value
     */
    public List<LinkedServiceReference> storageLinkedServices() {
        return this.storageLinkedServices;
    }

    /**
     * Set storage linked service references.
     *
     * @param storageLinkedServices the storageLinkedServices value to set
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withStorageLinkedServices(List<LinkedServiceReference> storageLinkedServices) {
        this.storageLinkedServices = storageLinkedServices;
        return this;
    }

    /**
     * Get user specified arguments to HDInsightActivity.
     *
     * @return the arguments value
     */
    public List<Object> arguments() {
        return this.arguments;
    }

    /**
     * Set user specified arguments to HDInsightActivity.
     *
     * @param arguments the arguments value to set
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withArguments(List<Object> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get debug info option. Possible values include: 'None', 'Always', 'Failure'.
     *
     * @return the getDebugInfo value
     */
    public HDInsightActivityDebugInfoOption getDebugInfo() {
        return this.getDebugInfo;
    }

    /**
     * Set debug info option. Possible values include: 'None', 'Always', 'Failure'.
     *
     * @param getDebugInfo the getDebugInfo value to set
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        this.getDebugInfo = getDebugInfo;
        return this;
    }

    /**
     * Get script path. Type: string (or Expression with resultType string).
     *
     * @return the scriptPath value
     */
    public Object scriptPath() {
        return this.scriptPath;
    }

    /**
     * Set script path. Type: string (or Expression with resultType string).
     *
     * @param scriptPath the scriptPath value to set
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withScriptPath(Object scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }

    /**
     * Get script linked service reference.
     *
     * @return the scriptLinkedService value
     */
    public LinkedServiceReference scriptLinkedService() {
        return this.scriptLinkedService;
    }

    /**
     * Set script linked service reference.
     *
     * @param scriptLinkedService the scriptLinkedService value to set
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withScriptLinkedService(LinkedServiceReference scriptLinkedService) {
        this.scriptLinkedService = scriptLinkedService;
        return this;
    }

    /**
     * Get allows user to specify defines for Hive job request.
     *
     * @return the defines value
     */
    public Map<String, Object> defines() {
        return this.defines;
    }

    /**
     * Set allows user to specify defines for Hive job request.
     *
     * @param defines the defines value to set
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withDefines(Map<String, Object> defines) {
        this.defines = defines;
        return this;
    }

}
