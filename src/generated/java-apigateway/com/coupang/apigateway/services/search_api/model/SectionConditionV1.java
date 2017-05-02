package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Context;
import com.coupang.apigateway.services.search_api.model.GeneralFilter;
import java.util.*;
import java.util.Map;



/**
 * Section Api Condition Model
 **/

@io.swagger.annotations.ApiModel(description = "Section Api Condition Model")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class SectionConditionV1   {
  
  private Integer start = null;


  public enum SortEnum {
    BEST("BEST"),
    RECENCY("RECENCY"),
    OVERDATE("OVERDATE"),
    LOWEST_PRICE("LOWEST_PRICE"),
    MAXIMUM_PRICE("MAXIMUM_PRICE"),
    DEFAULT("DEFAULT"),
    BEST_SELLING("BEST_SELLING"),
    SECTION("SECTION"),
    SOLDOUT("SOLDOUT");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<SortEnum> sort = new ArrayList<SortEnum>();
  private String segmentId = null;
  private String segRank = null;
  private String sectionId = null;
  private Integer limit = null;
  private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
  private String date = null;
  private Context context = null;

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Result page start offset")
  @org.codehaus.jackson.annotate.JsonProperty("start")
  @com.fasterxml.jackson.annotation.JsonProperty("start")
  public Integer getStart() {
    return start;
  }
  
  /**
   * Result page start offset
   **/
  public void setStart(Integer start) {
    this.start = start;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Sort condition")
  @org.codehaus.jackson.annotate.JsonProperty("sort")
  @com.fasterxml.jackson.annotation.JsonProperty("sort")
  public List<SortEnum> getSort() {
    return sort;
  }
  
  /**
   * Sort condition
   **/
  public void setSort(List<SortEnum> sort) {
    this.sort = sort;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "User Segment Id. (Default: 0)")
  @org.codehaus.jackson.annotate.JsonProperty("segmentId")
  @com.fasterxml.jackson.annotation.JsonProperty("segmentId")
  public String getSegmentId() {
    return segmentId;
  }
  
  /**
   * User Segment Id. (Default: 0)
   **/
  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "segRank. (Default: segRankB)")
  @org.codehaus.jackson.annotate.JsonProperty("segRank")
  @com.fasterxml.jackson.annotation.JsonProperty("segRank")
  public String getSegRank() {
    return segRank;
  }
  
  /**
   * segRank. (Default: segRankB)
   **/
  public void setSegRank(String segRank) {
    this.segRank = segRank;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "User Section Id.")
  @org.codehaus.jackson.annotate.JsonProperty("sectionId")
  @com.fasterxml.jackson.annotation.JsonProperty("sectionId")
  public String getSectionId() {
    return sectionId;
  }
  
  /**
   * User Section Id.
   **/
  public void setSectionId(String sectionId) {
    this.sectionId = sectionId;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Result page size")
  @org.codehaus.jackson.annotate.JsonProperty("limit")
  @com.fasterxml.jackson.annotation.JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  
  /**
   * Result page size
   **/
  public void setLimit(Integer limit) {
    this.limit = limit;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "GeneralFilter conditions map")
  @org.codehaus.jackson.annotate.JsonProperty("filter")
  @com.fasterxml.jackson.annotation.JsonProperty("filter")
  public Map<String, GeneralFilter> getFilter() {
    return filter;
  }
  
  /**
   * GeneralFilter conditions map
   **/
  public void setFilter(Map<String, GeneralFilter> filter) {
    this.filter = filter;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Date in yyyyMMddhhmmss format")
  @org.codehaus.jackson.annotate.JsonProperty("date")
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  public String getDate() {
    return date;
  }
  
  /**
   * Date in yyyyMMddhhmmss format
   **/
  public void setDate(String date) {
    this.date = date;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Client context information")
  @org.codehaus.jackson.annotate.JsonProperty("context")
  @com.fasterxml.jackson.annotation.JsonProperty("context")
  public Context getContext() {
    return context;
  }
  
  /**
   * Client context information
   **/
  public void setContext(Context context) {
    this.context = context;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionConditionV1 sectionConditionV1 = (SectionConditionV1) o;
    return Objects.equals(this.start, sectionConditionV1.start) &&
        Objects.equals(this.sort, sectionConditionV1.sort) &&
        Objects.equals(this.segmentId, sectionConditionV1.segmentId) &&
        Objects.equals(this.segRank, sectionConditionV1.segRank) &&
        Objects.equals(this.sectionId, sectionConditionV1.sectionId) &&
        Objects.equals(this.limit, sectionConditionV1.limit) &&
        Objects.equals(this.filter, sectionConditionV1.filter) &&
        Objects.equals(this.date, sectionConditionV1.date) &&
        Objects.equals(this.context, sectionConditionV1.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, sort, segmentId, segRank, sectionId, limit, filter, date, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionConditionV1 {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
    sb.append("    segRank: ").append(toIndentedString(segRank)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static SectionConditionV1Builder builder() {
    return new SectionConditionV1Builder();
  }

  public static class SectionConditionV1Builder {

    private Integer start = null;
    private List<SortEnum> sort = new ArrayList<SortEnum>();
    private String segmentId = null;
    private String segRank = null;
    private String sectionId = null;
    private Integer limit = null;
    private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
    private String date = null;
    private Context context = null;
    

    SectionConditionV1Builder() {
    }

    /**
     * Result page start offset
     **/
    public SectionConditionV1Builder start(Integer start) {
      this.start = start;
      return this;
    }

    /**
     * Sort condition
     **/
    public SectionConditionV1Builder sort(List<SortEnum> sort) {
      this.sort = sort;
      return this;
    }

    /**
     * User Segment Id. (Default: 0)
     **/
    public SectionConditionV1Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      return this;
    }

    /**
     * segRank. (Default: segRankB)
     **/
    public SectionConditionV1Builder segRank(String segRank) {
      this.segRank = segRank;
      return this;
    }

    /**
     * User Section Id.
     **/
    public SectionConditionV1Builder sectionId(String sectionId) {
      this.sectionId = sectionId;
      return this;
    }

    /**
     * Result page size
     **/
    public SectionConditionV1Builder limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * GeneralFilter conditions map
     **/
    public SectionConditionV1Builder filter(Map<String, GeneralFilter> filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Date in yyyyMMddhhmmss format
     **/
    public SectionConditionV1Builder date(String date) {
      this.date = date;
      return this;
    }

    /**
     * Client context information
     **/
    public SectionConditionV1Builder context(Context context) {
      this.context = context;
      return this;
    }


    public SectionConditionV1 build() {
      SectionConditionV1 sectionConditionV1 = new SectionConditionV1();
      sectionConditionV1.setStart(this.start);
      sectionConditionV1.setSort(this.sort);
      sectionConditionV1.setSegmentId(this.segmentId);
      sectionConditionV1.setSegRank(this.segRank);
      sectionConditionV1.setSectionId(this.sectionId);
      sectionConditionV1.setLimit(this.limit);
      sectionConditionV1.setFilter(this.filter);
      sectionConditionV1.setDate(this.date);
      sectionConditionV1.setContext(this.context);
      return sectionConditionV1;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SectionConditionV1Builder {\n");
      
      sb.append("    start: ").append(toIndentedString(start)).append("\n");
      sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
      sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
      sb.append("    segRank: ").append(toIndentedString(segRank)).append("\n");
      sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
      sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
      sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
      sb.append("    date: ").append(toIndentedString(date)).append("\n");
      sb.append("    context: ").append(toIndentedString(context)).append("\n");
      sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
        return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
  }
}

