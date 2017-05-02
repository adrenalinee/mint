package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.cart_api.model.ShoppingCartItemId;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class AnonymousCartItemValidRequest   {
  
  private List<ShoppingCartItemId> validCartItemIds = new ArrayList<ShoppingCartItemId>();
  private String sessionId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("validCartItemIds")
  @com.fasterxml.jackson.annotation.JsonProperty("validCartItemIds")
  public List<ShoppingCartItemId> getValidCartItemIds() {
    return validCartItemIds;
  }
  
  /**
   **/
  public void setValidCartItemIds(List<ShoppingCartItemId> validCartItemIds) {
    this.validCartItemIds = validCartItemIds;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sessionId")
  @com.fasterxml.jackson.annotation.JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  
  /**
   **/
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnonymousCartItemValidRequest anonymousCartItemValidRequest = (AnonymousCartItemValidRequest) o;
    return Objects.equals(this.validCartItemIds, anonymousCartItemValidRequest.validCartItemIds) &&
        Objects.equals(this.sessionId, anonymousCartItemValidRequest.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validCartItemIds, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnonymousCartItemValidRequest {\n");
    
    sb.append("    validCartItemIds: ").append(toIndentedString(validCartItemIds)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

  public static AnonymousCartItemValidRequestBuilder builder() {
    return new AnonymousCartItemValidRequestBuilder();
  }

  public static class AnonymousCartItemValidRequestBuilder {

    private List<ShoppingCartItemId> validCartItemIds = new ArrayList<ShoppingCartItemId>();
    private String sessionId = null;
    

    AnonymousCartItemValidRequestBuilder() {
    }

    /**
     **/
    public AnonymousCartItemValidRequestBuilder validCartItemIds(List<ShoppingCartItemId> validCartItemIds) {
      this.validCartItemIds = validCartItemIds;
      return this;
    }

    /**
     **/
    public AnonymousCartItemValidRequestBuilder sessionId(String sessionId) {
      this.sessionId = sessionId;
      return this;
    }


    public AnonymousCartItemValidRequest build() {
      AnonymousCartItemValidRequest anonymousCartItemValidRequest = new AnonymousCartItemValidRequest();
      anonymousCartItemValidRequest.setValidCartItemIds(this.validCartItemIds);
      anonymousCartItemValidRequest.setSessionId(this.sessionId);
      return anonymousCartItemValidRequest;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AnonymousCartItemValidRequestBuilder {\n");
      
      sb.append("    validCartItemIds: ").append(toIndentedString(validCartItemIds)).append("\n");
      sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

