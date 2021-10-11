package com.octopus.sdk.test;

import static org.assertj.core.api.Assertions.assertThat;

import com.octopus.sdk.domain.Tenant;
import com.octopus.sdk.model.tenant.TenantResource;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class TenantAcceptanceTest extends SpaceScopedAcceptanceTest {

  @Test
  public void canCreateAndDeleteTenant() throws IOException {
    final Tenant createdTenant = createdSpace.tenants().create(new TenantResource("Tenant1"));

    assertThat(createdTenant).isNotNull();
    final String createdTenantId = createdTenant.getProperties().getId();

    final Optional<Tenant> foundTenant = createdSpace.tenants().getById(createdTenantId);

    assertThat(foundTenant).isNotEmpty();
    assertThat(foundTenant.get().getProperties().getId()).isEqualTo(createdTenantId);

    createdSpace.tenants().delete(createdTenant.getProperties().getId());
    assertThat(createdSpace.tenants().getById(createdTenantId)).isEmpty();
  }
}
