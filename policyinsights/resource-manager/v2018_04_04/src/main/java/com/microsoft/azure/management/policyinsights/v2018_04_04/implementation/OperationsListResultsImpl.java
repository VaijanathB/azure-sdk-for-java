/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_04_04.implementation;

import com.microsoft.azure.management.policyinsights.v2018_04_04.OperationsListResults;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class OperationsListResultsImpl extends WrapperImpl<OperationsListResultsInner> implements OperationsListResults {
    private final PolicyInsightsManager manager;
    OperationsListResultsImpl(OperationsListResultsInner inner, PolicyInsightsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public PolicyInsightsManager manager() {
        return this.manager;
    }

    @Override
    public Integer odatacount() {
        return this.inner().odatacount();
    }

    @Override
    public List<OperationInner> value() {
        return this.inner().value();
    }

}