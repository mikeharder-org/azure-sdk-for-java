/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2017_04_19;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.advisor.v2017_04_19.implementation.AdvisorManager;
import com.microsoft.azure.management.advisor.v2017_04_19.implementation.MetadataEntityListResultInner;
import com.microsoft.azure.management.advisor.v2017_04_19.implementation.MetadataEntityInner;
import java.util.List;

/**
 * Type representing MetadataEntityListResult.
 */
public interface MetadataEntityListResult extends HasInner<MetadataEntityListResultInner>, HasManager<AdvisorManager> {
    /**
     * @return the value value.
     */
    List<MetadataEntityInner> value();

}
