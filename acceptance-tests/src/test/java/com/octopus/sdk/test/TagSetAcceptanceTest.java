package com.octopus.sdk.test;

import static org.assertj.core.api.Assertions.assertThat;

import com.octopus.sdk.domain.TagSet;
import com.octopus.sdk.model.tag.TagResource;
import com.octopus.sdk.model.tagset.TagSetResource;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class TagSetAcceptanceTest extends SpaceScopedAcceptanceTest {

  @Test
  public void canCreateAndDeleteTagSet() throws IOException {
    final TagSetResource newTagSet = new TagSetResource("TagSet1");
    newTagSet.addTagsItem(new TagResource("Tag1", "#333333"));

    final TagSet createdTagSet = createdSpace.tags().create(newTagSet);

    assertThat(createdTagSet).isNotNull();

    final Optional<TagSet> foundTagSet =
        createdSpace.tags().getById(createdTagSet.getProperties().getId());

    assertThat(foundTagSet).isNotEmpty();
    assertThat(foundTagSet.get().getProperties().getId())
        .isEqualTo(createdTagSet.getProperties().getId());

    assertThat(foundTagSet.get().getProperties().getTags())
        .isNotEmpty()
        .first()
        .extracting("name")
        .isEqualTo("Tag1");

    createdSpace.tags().delete(createdTagSet.getProperties().getId());
    assertThat(createdSpace.tags().getById(createdTagSet.getProperties().getId())).isEmpty();
  }
}
