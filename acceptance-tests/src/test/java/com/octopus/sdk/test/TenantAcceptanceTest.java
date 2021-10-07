package com.octopus.sdk.test;

import static org.assertj.core.api.Assertions.assertThat;

import com.octopus.sdk.domain.Tenant;
import com.octopus.sdk.model.tenant.TenantResourceWithLinks;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class TenantAcceptanceTest extends SpaceScopedAcceptanceTest {

  @Test
  public void canCreateAndDeleteTenant() throws IOException {
    final Tenant createdTenant =
        createdSpace.tenants().create(new TenantResourceWithLinks("Tenant1"));

    assertThat(createdTenant).isNotNull();

    final Optional<Tenant> foundTenant =
        createdSpace.tenants().getById(createdTenant.getProperties().getId());

    assertThat(foundTenant).isNotEmpty();
    assertThat(foundTenant.get().getProperties().getId())
        .isEqualTo(createdTenant.getProperties().getId());

    createdSpace.tenants().delete(createdTenant.getProperties().getId());
    assertThat(createdSpace.tenants().getById(createdTenant.getProperties().getId())).isEmpty();
  }
}
