package com.octopus.sdk.domain;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.tenant.TenantResourceWithLinks;

public class Tenant {

  @SuppressWarnings("UnusedVariable")
  private final OctopusClient client;

  private final TenantResourceWithLinks resourceWithLinks;

  public Tenant(final OctopusClient client, final TenantResourceWithLinks resourceWithLinks) {
    this.client = client;
    this.resourceWithLinks = resourceWithLinks;
  }

  public TenantResourceWithLinks getProperties() {
    return resourceWithLinks;
  }
}
