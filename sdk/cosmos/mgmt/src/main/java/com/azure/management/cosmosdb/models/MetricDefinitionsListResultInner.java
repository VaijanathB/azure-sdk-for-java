// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MetricDefinitionsListResult model. */
@Immutable
public final class MetricDefinitionsListResultInner {
    /*
     * The list of metric definitions for the account.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<MetricDefinitionInner> value;

    /**
     * Get the value property: The list of metric definitions for the account.
     *
     * @return the value value.
     */
    public List<MetricDefinitionInner> value() {
        return this.value;
    }
}
