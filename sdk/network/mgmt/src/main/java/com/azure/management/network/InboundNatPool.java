// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InboundNatPool model. */
@JsonFlatten
@Fluent
public class InboundNatPool extends SubResource {
    /*
     * The name of the resource that is unique within the set of inbound NAT
     * pools used by the load balancer. This name can be used to access the
     * resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A reference to frontend IP addresses.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /*
     * The reference to the transport protocol used by the inbound NAT pool.
     */
    @JsonProperty(value = "properties.protocol")
    private TransportProtocol protocol;

    /*
     * The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer.
     * Acceptable values range between 1 and 65534.
     */
    @JsonProperty(value = "properties.frontendPortRangeStart")
    private Integer frontendPortRangeStart;

    /*
     * The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable
     * values range between 1 and 65535.
     */
    @JsonProperty(value = "properties.frontendPortRangeEnd")
    private Integer frontendPortRangeEnd;

    /*
     * The port used for internal connections on the endpoint. Acceptable
     * values are between 1 and 65535.
     */
    @JsonProperty(value = "properties.backendPort")
    private Integer backendPort;

    /*
     * The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only
     * used when the protocol is set to TCP.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is
     * required when using the SQL AlwaysOn Availability Groups in SQL server.
     * This setting can't be changed after you create the endpoint.
     */
    @JsonProperty(value = "properties.enableFloatingIP")
    private Boolean enableFloatingIP;

    /*
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is
     * set to TCP.
     */
    @JsonProperty(value = "properties.enableTcpReset")
    private Boolean enableTcpReset;

    /*
     * Gets the provisioning state of the PublicIP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within the set of inbound NAT pools used by the
     * load balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of inbound NAT pools used by the
     * load balancer. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the frontendIPConfiguration property: A reference to frontend IP addresses.
     *
     * @return the frontendIPConfiguration value.
     */
    public SubResource frontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }

    /**
     * Set the frontendIPConfiguration property: A reference to frontend IP addresses.
     *
     * @param frontendIPConfiguration the frontendIPConfiguration value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
        return this;
    }

    /**
     * Get the protocol property: The reference to the transport protocol used by the inbound NAT pool.
     *
     * @return the protocol value.
     */
    public TransportProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The reference to the transport protocol used by the inbound NAT pool.
     *
     * @param protocol the protocol value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the frontendPortRangeStart property: The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     *
     * @return the frontendPortRangeStart value.
     */
    public Integer frontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * Set the frontendPortRangeStart property: The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     *
     * @param frontendPortRangeStart the frontendPortRangeStart value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withFrontendPortRangeStart(Integer frontendPortRangeStart) {
        this.frontendPortRangeStart = frontendPortRangeStart;
        return this;
    }

    /**
     * Get the frontendPortRangeEnd property: The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     *
     * @return the frontendPortRangeEnd value.
     */
    public Integer frontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * Set the frontendPortRangeEnd property: The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     *
     * @param frontendPortRangeEnd the frontendPortRangeEnd value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withFrontendPortRangeEnd(Integer frontendPortRangeEnd) {
        this.frontendPortRangeEnd = frontendPortRangeEnd;
        return this;
    }

    /**
     * Get the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 1 and 65535.
     *
     * @return the backendPort value.
     */
    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 1 and 65535.
     *
     * @param backendPort the backendPort value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the enableFloatingIP property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @return the enableFloatingIP value.
     */
    public Boolean enableFloatingIP() {
        return this.enableFloatingIP;
    }

    /**
     * Set the enableFloatingIP property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @param enableFloatingIP the enableFloatingIP value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withEnableFloatingIP(Boolean enableFloatingIP) {
        this.enableFloatingIP = enableFloatingIP;
        return this;
    }

    /**
     * Get the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value.
     */
    public Boolean enableTcpReset() {
        return this.enableTcpReset;
    }

    /**
     * Set the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @param enableTcpReset the enableTcpReset value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }
}
