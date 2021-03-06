/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01.implementation;

import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewaySku;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewaySslPolicy;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayOperationalState;
import java.util.List;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayIPConfiguration;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayAuthenticationCertificate;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewaySslCertificate;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayFrontendIPConfiguration;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayFrontendPort;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayProbe;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayBackendAddressPool;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayBackendHttpSettings;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayHttpListener;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayUrlPathMap;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayRequestRoutingRule;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayRedirectConfiguration;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayWebApplicationFirewallConfiguration;
import com.microsoft.azure.management.network.v2018_06_01.ApplicationGatewayAutoscaleConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Application gateway resource.
 */
@JsonFlatten
@SkipParentValidation
public class ApplicationGatewayInner extends Resource {
    /**
     * SKU of the application gateway resource.
     */
    @JsonProperty(value = "properties.sku")
    private ApplicationGatewaySku sku;

    /**
     * SSL policy of the application gateway resource.
     */
    @JsonProperty(value = "properties.sslPolicy")
    private ApplicationGatewaySslPolicy sslPolicy;

    /**
     * Operational state of the application gateway resource. Possible values
     * include: 'Stopped', 'Starting', 'Running', 'Stopping'.
     */
    @JsonProperty(value = "properties.operationalState", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationGatewayOperationalState operationalState;

    /**
     * Subnets of application the gateway resource.
     */
    @JsonProperty(value = "properties.gatewayIPConfigurations")
    private List<ApplicationGatewayIPConfiguration> gatewayIPConfigurations;

    /**
     * Authentication certificates of the application gateway resource.
     */
    @JsonProperty(value = "properties.authenticationCertificates")
    private List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates;

    /**
     * SSL certificates of the application gateway resource.
     */
    @JsonProperty(value = "properties.sslCertificates")
    private List<ApplicationGatewaySslCertificate> sslCertificates;

    /**
     * Frontend IP addresses of the application gateway resource.
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations;

    /**
     * Frontend ports of the application gateway resource.
     */
    @JsonProperty(value = "properties.frontendPorts")
    private List<ApplicationGatewayFrontendPort> frontendPorts;

    /**
     * Probes of the application gateway resource.
     */
    @JsonProperty(value = "properties.probes")
    private List<ApplicationGatewayProbe> probes;

    /**
     * Backend address pool of the application gateway resource.
     */
    @JsonProperty(value = "properties.backendAddressPools")
    private List<ApplicationGatewayBackendAddressPool> backendAddressPools;

    /**
     * Backend http settings of the application gateway resource.
     */
    @JsonProperty(value = "properties.backendHttpSettingsCollection")
    private List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection;

    /**
     * Http listeners of the application gateway resource.
     */
    @JsonProperty(value = "properties.httpListeners")
    private List<ApplicationGatewayHttpListener> httpListeners;

    /**
     * URL path map of the application gateway resource.
     */
    @JsonProperty(value = "properties.urlPathMaps")
    private List<ApplicationGatewayUrlPathMap> urlPathMaps;

    /**
     * Request routing rules of the application gateway resource.
     */
    @JsonProperty(value = "properties.requestRoutingRules")
    private List<ApplicationGatewayRequestRoutingRule> requestRoutingRules;

    /**
     * Redirect configurations of the application gateway resource.
     */
    @JsonProperty(value = "properties.redirectConfigurations")
    private List<ApplicationGatewayRedirectConfiguration> redirectConfigurations;

    /**
     * Web application firewall configuration.
     */
    @JsonProperty(value = "properties.webApplicationFirewallConfiguration")
    private ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration;

    /**
     * Whether HTTP2 is enabled on the application gateway resource.
     */
    @JsonProperty(value = "properties.enableHttp2")
    private Boolean enableHttp2;

    /**
     * Whether FIPS is enabled on the application gateway resource.
     */
    @JsonProperty(value = "properties.enableFips")
    private Boolean enableFips;

    /**
     * Autoscale Configuration.
     */
    @JsonProperty(value = "properties.autoscaleConfiguration")
    private ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration;

    /**
     * Resource GUID property of the application gateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * Provisioning state of the application gateway resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get sKU of the application gateway resource.
     *
     * @return the sku value
     */
    public ApplicationGatewaySku sku() {
        return this.sku;
    }

    /**
     * Set sKU of the application gateway resource.
     *
     * @param sku the sku value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSku(ApplicationGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get sSL policy of the application gateway resource.
     *
     * @return the sslPolicy value
     */
    public ApplicationGatewaySslPolicy sslPolicy() {
        return this.sslPolicy;
    }

    /**
     * Set sSL policy of the application gateway resource.
     *
     * @param sslPolicy the sslPolicy value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSslPolicy(ApplicationGatewaySslPolicy sslPolicy) {
        this.sslPolicy = sslPolicy;
        return this;
    }

    /**
     * Get operational state of the application gateway resource. Possible values include: 'Stopped', 'Starting', 'Running', 'Stopping'.
     *
     * @return the operationalState value
     */
    public ApplicationGatewayOperationalState operationalState() {
        return this.operationalState;
    }

    /**
     * Get subnets of application the gateway resource.
     *
     * @return the gatewayIPConfigurations value
     */
    public List<ApplicationGatewayIPConfiguration> gatewayIPConfigurations() {
        return this.gatewayIPConfigurations;
    }

    /**
     * Set subnets of application the gateway resource.
     *
     * @param gatewayIPConfigurations the gatewayIPConfigurations value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withGatewayIPConfigurations(List<ApplicationGatewayIPConfiguration> gatewayIPConfigurations) {
        this.gatewayIPConfigurations = gatewayIPConfigurations;
        return this;
    }

    /**
     * Get authentication certificates of the application gateway resource.
     *
     * @return the authenticationCertificates value
     */
    public List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates() {
        return this.authenticationCertificates;
    }

    /**
     * Set authentication certificates of the application gateway resource.
     *
     * @param authenticationCertificates the authenticationCertificates value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withAuthenticationCertificates(List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates) {
        this.authenticationCertificates = authenticationCertificates;
        return this;
    }

    /**
     * Get sSL certificates of the application gateway resource.
     *
     * @return the sslCertificates value
     */
    public List<ApplicationGatewaySslCertificate> sslCertificates() {
        return this.sslCertificates;
    }

    /**
     * Set sSL certificates of the application gateway resource.
     *
     * @param sslCertificates the sslCertificates value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSslCertificates(List<ApplicationGatewaySslCertificate> sslCertificates) {
        this.sslCertificates = sslCertificates;
        return this;
    }

    /**
     * Get frontend IP addresses of the application gateway resource.
     *
     * @return the frontendIPConfigurations value
     */
    public List<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Set frontend IP addresses of the application gateway resource.
     *
     * @param frontendIPConfigurations the frontendIPConfigurations value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withFrontendIPConfigurations(List<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations) {
        this.frontendIPConfigurations = frontendIPConfigurations;
        return this;
    }

    /**
     * Get frontend ports of the application gateway resource.
     *
     * @return the frontendPorts value
     */
    public List<ApplicationGatewayFrontendPort> frontendPorts() {
        return this.frontendPorts;
    }

    /**
     * Set frontend ports of the application gateway resource.
     *
     * @param frontendPorts the frontendPorts value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts) {
        this.frontendPorts = frontendPorts;
        return this;
    }

    /**
     * Get probes of the application gateway resource.
     *
     * @return the probes value
     */
    public List<ApplicationGatewayProbe> probes() {
        return this.probes;
    }

    /**
     * Set probes of the application gateway resource.
     *
     * @param probes the probes value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withProbes(List<ApplicationGatewayProbe> probes) {
        this.probes = probes;
        return this;
    }

    /**
     * Get backend address pool of the application gateway resource.
     *
     * @return the backendAddressPools value
     */
    public List<ApplicationGatewayBackendAddressPool> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set backend address pool of the application gateway resource.
     *
     * @param backendAddressPools the backendAddressPools value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withBackendAddressPools(List<ApplicationGatewayBackendAddressPool> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Get backend http settings of the application gateway resource.
     *
     * @return the backendHttpSettingsCollection value
     */
    public List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection() {
        return this.backendHttpSettingsCollection;
    }

    /**
     * Set backend http settings of the application gateway resource.
     *
     * @param backendHttpSettingsCollection the backendHttpSettingsCollection value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withBackendHttpSettingsCollection(List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection) {
        this.backendHttpSettingsCollection = backendHttpSettingsCollection;
        return this;
    }

    /**
     * Get http listeners of the application gateway resource.
     *
     * @return the httpListeners value
     */
    public List<ApplicationGatewayHttpListener> httpListeners() {
        return this.httpListeners;
    }

    /**
     * Set http listeners of the application gateway resource.
     *
     * @param httpListeners the httpListeners value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners) {
        this.httpListeners = httpListeners;
        return this;
    }

    /**
     * Get uRL path map of the application gateway resource.
     *
     * @return the urlPathMaps value
     */
    public List<ApplicationGatewayUrlPathMap> urlPathMaps() {
        return this.urlPathMaps;
    }

    /**
     * Set uRL path map of the application gateway resource.
     *
     * @param urlPathMaps the urlPathMaps value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withUrlPathMaps(List<ApplicationGatewayUrlPathMap> urlPathMaps) {
        this.urlPathMaps = urlPathMaps;
        return this;
    }

    /**
     * Get request routing rules of the application gateway resource.
     *
     * @return the requestRoutingRules value
     */
    public List<ApplicationGatewayRequestRoutingRule> requestRoutingRules() {
        return this.requestRoutingRules;
    }

    /**
     * Set request routing rules of the application gateway resource.
     *
     * @param requestRoutingRules the requestRoutingRules value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withRequestRoutingRules(List<ApplicationGatewayRequestRoutingRule> requestRoutingRules) {
        this.requestRoutingRules = requestRoutingRules;
        return this;
    }

    /**
     * Get redirect configurations of the application gateway resource.
     *
     * @return the redirectConfigurations value
     */
    public List<ApplicationGatewayRedirectConfiguration> redirectConfigurations() {
        return this.redirectConfigurations;
    }

    /**
     * Set redirect configurations of the application gateway resource.
     *
     * @param redirectConfigurations the redirectConfigurations value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withRedirectConfigurations(List<ApplicationGatewayRedirectConfiguration> redirectConfigurations) {
        this.redirectConfigurations = redirectConfigurations;
        return this;
    }

    /**
     * Get web application firewall configuration.
     *
     * @return the webApplicationFirewallConfiguration value
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration() {
        return this.webApplicationFirewallConfiguration;
    }

    /**
     * Set web application firewall configuration.
     *
     * @param webApplicationFirewallConfiguration the webApplicationFirewallConfiguration value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withWebApplicationFirewallConfiguration(ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration) {
        this.webApplicationFirewallConfiguration = webApplicationFirewallConfiguration;
        return this;
    }

    /**
     * Get whether HTTP2 is enabled on the application gateway resource.
     *
     * @return the enableHttp2 value
     */
    public Boolean enableHttp2() {
        return this.enableHttp2;
    }

    /**
     * Set whether HTTP2 is enabled on the application gateway resource.
     *
     * @param enableHttp2 the enableHttp2 value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEnableHttp2(Boolean enableHttp2) {
        this.enableHttp2 = enableHttp2;
        return this;
    }

    /**
     * Get whether FIPS is enabled on the application gateway resource.
     *
     * @return the enableFips value
     */
    public Boolean enableFips() {
        return this.enableFips;
    }

    /**
     * Set whether FIPS is enabled on the application gateway resource.
     *
     * @param enableFips the enableFips value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEnableFips(Boolean enableFips) {
        this.enableFips = enableFips;
        return this;
    }

    /**
     * Get autoscale Configuration.
     *
     * @return the autoscaleConfiguration value
     */
    public ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration() {
        return this.autoscaleConfiguration;
    }

    /**
     * Set autoscale Configuration.
     *
     * @param autoscaleConfiguration the autoscaleConfiguration value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withAutoscaleConfiguration(ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration) {
        this.autoscaleConfiguration = autoscaleConfiguration;
        return this;
    }

    /**
     * Get resource GUID property of the application gateway resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set resource GUID property of the application gateway resource.
     *
     * @param resourceGuid the resourceGuid value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get provisioning state of the application gateway resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the application gateway resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get a list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set a list of availability zones denoting where the resource needs to come from.
     *
     * @param zones the zones value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

}
