package com.octopus.sdk.api;

import com.octopus.sdk.domain.Tenant;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.model.tenant.TenantPaginatedCollection;
import com.octopus.sdk.model.tenant.TenantResource;
import com.octopus.sdk.model.tenant.TenantResourceWithLinks;

import com.google.common.base.Preconditions;

public class TenantApi
    extends BaseNamedResourceApi<
        TenantResource, TenantResourceWithLinks, TenantPaginatedCollection, Tenant> {

  public TenantApi(final OctopusClient client, final String rootPath) {
    super(client, rootPath, TenantResourceWithLinks.class, TenantPaginatedCollection.class);
  }

  public static TenantApi create(final OctopusClient client, final SpaceHome spaceHome) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(spaceHome, "Cannot create a TenantApi in a 'null' space");
    return new TenantApi(client, spaceHome.getTenantsLink());
  }

  @Override
  public Tenant createServerObject(final TenantResourceWithLinks resource) {
    return new Tenant(client, resource);
  }
}
