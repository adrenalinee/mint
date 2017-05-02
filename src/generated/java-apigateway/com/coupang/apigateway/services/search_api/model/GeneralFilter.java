package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.GeneralFilter;
import java.util.*;



/**
 * General filter for star-gate. see detail in https://wiki.coupang.net:8443/display/SEARCH/How+to+use+Filter+for+stargate
 **/

@io.swagger.annotations.ApiModel(description = "General filter for star-gate. see detail in https://wiki.coupang.net:8443/display/SEARCH/How+to+use+Filter+for+stargate")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class GeneralFilter   {
  
  private List<String> values = new ArrayList<String>();
  private String to = null;


  public enum OperatorEnum {
    AND("AND"),
    OR("OR");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private OperatorEnum operator = null;
  private String id = null;
  private List<GeneralFilter> generalFilters = new ArrayList<GeneralFilter>();


  public enum GeneralFilterTypeEnum {
    RangeFilter("RangeFilter"),
    DefaultFilter("DefaultFilter"),
    Filters("Filters"),
    NullableFilter("NullableFilter");

    private String value;

    GeneralFilterTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private GeneralFilterTypeEnum generalFilterType = null;
  private String from = null;


  public enum FieldEnum {
    ABTEST_GROUPS("ABTEST_GROUPS"),
    ATTRIBUTE("ATTRIBUTE"),
    AVAILABLE_DATES("AVAILABLE_DATES"),
    BOUNDINGBOX("BOUNDINGBOX"),
    BRAND("BRAND"),
    BRANDID("BRANDID"),
    COMPONENTIDS("COMPONENTIDS"),
    PRODUCTCOMPONENTIDS("PRODUCTCOMPONENTIDS"),
    DEALCOMPONENTIDS("DEALCOMPONENTIDS"),
    DELIVERYTYPES("DELIVERYTYPES"),
    ISADULT("ISADULT"),
    ISDIRECTUSE("ISDIRECTUSE"),
    ISSOLDOUT("ISSOLDOUT"),
    ISREPRESENTITIVE("ISREPRESENTITIVE"),
    PRICE("PRICE"),
    NOATTRIBUTE("NOATTRIBUTE"),
    PRODUCTID("PRODUCTID"),
    RATING("RATING"),
    SECTION_FILTER("SECTION_FILTER"),
    SHIPPINGCENTERID("SHIPPINGCENTERID"),
    SHIPPINGINFORMAIONLIST("SHIPPINGINFORMAIONLIST"),
    TYPE("TYPE"),
    TODAYOPEN("TODAYOPEN"),
    TODAYCLOSE("TODAYCLOSE"),
    VENDORID("VENDORID"),
    WINNERVENDORITEMID("WINNERVENDORITEMID"),
    WINNERVENDORID("WINNERVENDORID"),
    ITEMID("ITEMID"),
    UPC("UPC");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private FieldEnum field = null;
  private Boolean exclude = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "Value list for default filter type")
  @org.codehaus.jackson.annotate.JsonProperty("values")
  @com.fasterxml.jackson.annotation.JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  
  /**
   * Value list for default filter type
   **/
  public void setValues(List<String> values) {
    this.values = values;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "End point for range filter type")
  @org.codehaus.jackson.annotate.JsonProperty("to")
  @com.fasterxml.jackson.annotation.JsonProperty("to")
  public String getTo() {
    return to;
  }
  
  /**
   * End point for range filter type
   **/
  public void setTo(String to) {
    this.to = to;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "This value is used to concatenate each values or each filters e.g) if operator is OR, values are 1 and 2. it will be interpreted as (1 OR 2)")
  @org.codehaus.jackson.annotate.JsonProperty("operator")
  @com.fasterxml.jackson.annotation.JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  
  /**
   * This value is used to concatenate each values or each filters e.g) if operator is OR, values are 1 and 2. it will be interpreted as (1 OR 2)
   **/
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "This value are used for dynamic field type only for range filter or default filter, if you add this id, it will be interpreted as FIELD_ID for solr")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public String getId() {
    return id;
  }
  
  /**
   * This value are used for dynamic field type only for range filter or default filter, if you add this id, it will be interpreted as FIELD_ID for solr
   **/
  public void setId(String id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "Filter list for filters type")
  @org.codehaus.jackson.annotate.JsonProperty("generalFilters")
  @com.fasterxml.jackson.annotation.JsonProperty("generalFilters")
  public List<GeneralFilter> getGeneralFilters() {
    return generalFilters;
  }
  
  /**
   * Filter list for filters type
   **/
  public void setGeneralFilters(List<GeneralFilter> generalFilters) {
    this.generalFilters = generalFilters;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "General filter can be any type of filter(range filter type or default filter type or filters type). you should set which type this general filter is used, whenever you use this filter")
  @org.codehaus.jackson.annotate.JsonProperty("generalFilterType")
  @com.fasterxml.jackson.annotation.JsonProperty("generalFilterType")
  public GeneralFilterTypeEnum getGeneralFilterType() {
    return generalFilterType;
  }
  
  /**
   * General filter can be any type of filter(range filter type or default filter type or filters type). you should set which type this general filter is used, whenever you use this filter
   **/
  public void setGeneralFilterType(GeneralFilterTypeEnum generalFilterType) {
    this.generalFilterType = generalFilterType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "Start point for range filter type")
  @org.codehaus.jackson.annotate.JsonProperty("from")
  @com.fasterxml.jackson.annotation.JsonProperty("from")
  public String getFrom() {
    return from;
  }
  
  /**
   * Start point for range filter type
   **/
  public void setFrom(String from) {
    this.from = from;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "This value is used as solr field for range filter or default filter")
  @org.codehaus.jackson.annotate.JsonProperty("field")
  @com.fasterxml.jackson.annotation.JsonProperty("field")
  public FieldEnum getField() {
    return field;
  }
  
  /**
   * This value is used as solr field for range filter or default filter
   **/
  public void setField(FieldEnum field) {
    this.field = field;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "false", value = "If exclude is set as true, it means return all datas excluding the data that filter applied")
  @org.codehaus.jackson.annotate.JsonProperty("exclude")
  @com.fasterxml.jackson.annotation.JsonProperty("exclude")
  public Boolean getExclude() {
    return exclude;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isExclude() {
    return exclude == null ? false : exclude;
  }
  
  /**
   * If exclude is set as true, it means return all datas excluding the data that filter applied
   **/
  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralFilter generalFilter = (GeneralFilter) o;
    return Objects.equals(this.values, generalFilter.values) &&
        Objects.equals(this.to, generalFilter.to) &&
        Objects.equals(this.operator, generalFilter.operator) &&
        Objects.equals(this.id, generalFilter.id) &&
        Objects.equals(this.generalFilters, generalFilter.generalFilters) &&
        Objects.equals(this.generalFilterType, generalFilter.generalFilterType) &&
        Objects.equals(this.from, generalFilter.from) &&
        Objects.equals(this.field, generalFilter.field) &&
        Objects.equals(this.exclude, generalFilter.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, to, operator, id, generalFilters, generalFilterType, from, field, exclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralFilter {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    generalFilters: ").append(toIndentedString(generalFilters)).append("\n");
    sb.append("    generalFilterType: ").append(toIndentedString(generalFilterType)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

  public static GeneralFilterBuilder builder() {
    return new GeneralFilterBuilder();
  }

  public static class GeneralFilterBuilder {

    private List<String> values = new ArrayList<String>();
    private String to = null;
    private OperatorEnum operator = null;
    private String id = null;
    private List<GeneralFilter> generalFilters = new ArrayList<GeneralFilter>();
    private GeneralFilterTypeEnum generalFilterType = null;
    private String from = null;
    private FieldEnum field = null;
    private Boolean exclude = null;
    

    GeneralFilterBuilder() {
    }

    /**
     * Value list for default filter type
     **/
    public GeneralFilterBuilder values(List<String> values) {
      this.values = values;
      return this;
    }

    /**
     * End point for range filter type
     **/
    public GeneralFilterBuilder to(String to) {
      this.to = to;
      return this;
    }

    /**
     * This value is used to concatenate each values or each filters e.g) if operator is OR, values are 1 and 2. it will be interpreted as (1 OR 2)
     **/
    public GeneralFilterBuilder operator(OperatorEnum operator) {
      this.operator = operator;
      return this;
    }

    /**
     * This value are used for dynamic field type only for range filter or default filter, if you add this id, it will be interpreted as FIELD_ID for solr
     **/
    public GeneralFilterBuilder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Filter list for filters type
     **/
    public GeneralFilterBuilder generalFilters(List<GeneralFilter> generalFilters) {
      this.generalFilters = generalFilters;
      return this;
    }

    /**
     * General filter can be any type of filter(range filter type or default filter type or filters type). you should set which type this general filter is used, whenever you use this filter
     **/
    public GeneralFilterBuilder generalFilterType(GeneralFilterTypeEnum generalFilterType) {
      this.generalFilterType = generalFilterType;
      return this;
    }

    /**
     * Start point for range filter type
     **/
    public GeneralFilterBuilder from(String from) {
      this.from = from;
      return this;
    }

    /**
     * This value is used as solr field for range filter or default filter
     **/
    public GeneralFilterBuilder field(FieldEnum field) {
      this.field = field;
      return this;
    }

    /**
     * If exclude is set as true, it means return all datas excluding the data that filter applied
     **/
    public GeneralFilterBuilder exclude(Boolean exclude) {
      this.exclude = exclude;
      return this;
    }


    public GeneralFilter build() {
      GeneralFilter generalFilter = new GeneralFilter();
      generalFilter.setValues(this.values);
      generalFilter.setTo(this.to);
      generalFilter.setOperator(this.operator);
      generalFilter.setId(this.id);
      generalFilter.setGeneralFilters(this.generalFilters);
      generalFilter.setGeneralFilterType(this.generalFilterType);
      generalFilter.setFrom(this.from);
      generalFilter.setField(this.field);
      generalFilter.setExclude(this.exclude);
      return generalFilter;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GeneralFilterBuilder {\n");
      
      sb.append("    values: ").append(toIndentedString(values)).append("\n");
      sb.append("    to: ").append(toIndentedString(to)).append("\n");
      sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    generalFilters: ").append(toIndentedString(generalFilters)).append("\n");
      sb.append("    generalFilterType: ").append(toIndentedString(generalFilterType)).append("\n");
      sb.append("    from: ").append(toIndentedString(from)).append("\n");
      sb.append("    field: ").append(toIndentedString(field)).append("\n");
      sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

