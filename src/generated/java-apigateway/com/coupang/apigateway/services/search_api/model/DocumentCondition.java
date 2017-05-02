package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Context;
import com.coupang.apigateway.services.search_api.model.GeneralFilter;
import java.util.*;
import java.util.Map;



/**
 * Document Query Api Condition Model
 **/

@io.swagger.annotations.ApiModel(description = "Document Query Api Condition Model")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class DocumentCondition   {
  


  public enum TypeEnum {
    PRODUCTID("PRODUCTID"),
    ITEMID("ITEMID"),
    UPCID("UPCID");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
  private List<String> documentIds = new ArrayList<String>();
  private Context context = null;

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Id Type")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  /**
   * Id Type
   **/
  public void setType(TypeEnum type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "GeneralFilter conditions map")
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
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Document Ids")
  @org.codehaus.jackson.annotate.JsonProperty("documentIds")
  @com.fasterxml.jackson.annotation.JsonProperty("documentIds")
  public List<String> getDocumentIds() {
    return documentIds;
  }
  
  /**
   * Document Ids
   **/
  public void setDocumentIds(List<String> documentIds) {
    this.documentIds = documentIds;
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
    DocumentCondition documentCondition = (DocumentCondition) o;
    return Objects.equals(this.type, documentCondition.type) &&
        Objects.equals(this.filter, documentCondition.filter) &&
        Objects.equals(this.documentIds, documentCondition.documentIds) &&
        Objects.equals(this.context, documentCondition.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, filter, documentIds, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCondition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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

  public static DocumentConditionBuilder builder() {
    return new DocumentConditionBuilder();
  }

  public static class DocumentConditionBuilder {

    private TypeEnum type = null;
    private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
    private List<String> documentIds = new ArrayList<String>();
    private Context context = null;
    

    DocumentConditionBuilder() {
    }

    /**
     * Id Type
     **/
    public DocumentConditionBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }

    /**
     * GeneralFilter conditions map
     **/
    public DocumentConditionBuilder filter(Map<String, GeneralFilter> filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Document Ids
     **/
    public DocumentConditionBuilder documentIds(List<String> documentIds) {
      this.documentIds = documentIds;
      return this;
    }

    /**
     * Client context information
     **/
    public DocumentConditionBuilder context(Context context) {
      this.context = context;
      return this;
    }


    public DocumentCondition build() {
      DocumentCondition documentCondition = new DocumentCondition();
      documentCondition.setType(this.type);
      documentCondition.setFilter(this.filter);
      documentCondition.setDocumentIds(this.documentIds);
      documentCondition.setContext(this.context);
      return documentCondition;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DocumentConditionBuilder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
      sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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

