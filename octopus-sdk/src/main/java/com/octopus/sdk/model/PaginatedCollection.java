/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

// Used to decode Paginated overview pages, such that the collection can be iterated over by page.
public class PaginatedCollection<T> {

  @SerializedName("TotalResults")
  private final int totalResults;

  @SerializedName("ItemsPerPage")
  private final int itemsPerPage;

  @SerializedName("NumberOfPages")
  private final int numberOfPages;

  @SerializedName("PageNumber")
  private final int pageNumber;

  @SerializedName("Items")
  private final List<T> items;

  @SerializedName("Links")
  protected final Map<String, String> rawLinks;

  public PaginatedCollection(
      final Map<String, String> links,
      final int totalResults,
      final int itemsPerPage,
      final int numberOfPages,
      final int pageNumber,
      final List<T> items) {
    this.totalResults = totalResults;
    this.itemsPerPage = itemsPerPage;
    this.numberOfPages = numberOfPages;
    this.pageNumber = pageNumber;
    this.items = items;
    this.rawLinks = links;
  }

  public int getTotalResults() {
    return totalResults;
  }

  public int getItemsPerPage() {
    return itemsPerPage;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  public boolean isLastPage() {
    return pageNumber == (numberOfPages - 1);
  }

  public List<T> getItems() {
    return items;
  }

  public String getPageAllLink() {
    return LinkHelpers.getCleansedRawLink(rawLinks.get("Page.All"));
  }

  public String getPageNext() {
    return LinkHelpers.getCleansedRawLink(rawLinks.get("Page.Next"));
  }

  public String getPageCurrentLink() {
    return LinkHelpers.getCleansedRawLink(rawLinks.get("Page.Current"));
  }

  public String getPageLastLink() {
    return LinkHelpers.getCleansedRawLink(rawLinks.get("Page.Last"));
  }

  public String getSelfLink() {
    return LinkHelpers.getCleansedRawLink(rawLinks.get("Self"));
  }

  public String getTemplateLink() {
    return LinkHelpers.getCleansedRawLink(rawLinks.get("Template"));
  }
}
