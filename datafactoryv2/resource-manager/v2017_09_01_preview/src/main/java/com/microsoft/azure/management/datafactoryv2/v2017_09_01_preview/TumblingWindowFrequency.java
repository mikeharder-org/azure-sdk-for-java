/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TumblingWindowFrequency.
 */
public final class TumblingWindowFrequency extends ExpandableStringEnum<TumblingWindowFrequency> {
    /** Static value Minute for TumblingWindowFrequency. */
    public static final TumblingWindowFrequency MINUTE = fromString("Minute");

    /** Static value Hour for TumblingWindowFrequency. */
    public static final TumblingWindowFrequency HOUR = fromString("Hour");

    /**
     * Creates or finds a TumblingWindowFrequency from its string representation.
     * @param name a name to look for
     * @return the corresponding TumblingWindowFrequency
     */
    @JsonCreator
    public static TumblingWindowFrequency fromString(String name) {
        return fromString(name, TumblingWindowFrequency.class);
    }

    /**
     * @return known TumblingWindowFrequency values
     */
    public static Collection<TumblingWindowFrequency> values() {
        return values(TumblingWindowFrequency.class);
    }
}
