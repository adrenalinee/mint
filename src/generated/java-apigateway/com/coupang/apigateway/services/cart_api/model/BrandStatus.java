package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class BrandStatus   {
  
  private Long id = null;
  private Boolean checked = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("checked")
  @com.fasterxml.jackson.annotation.JsonProperty("checked")
  public Boolean getChecked() {
    return checked;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isChecked() {
    return checked == null ? false : checked;
  }
  
  /**
   **/
  public void setChecked(Boolean checked) {
    this.checked = checked;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandStatus brandStatus = (BrandStatus) o;
    return Objects.equals(this.id, brandStatus.id) &&
        Objects.equals(this.checked, brandStatus.checked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, checked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
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

  public static BrandStatusBuilder builder() {
    return new BrandStatusBuilder();
  }

  public static class BrandStatusBuilder {

    private Long id = null;
    private Boolean checked = null;
    

    BrandStatusBuilder() {
    }

    /**
     **/
    public BrandStatusBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public BrandStatusBuilder checked(Boolean checked) {
      this.checked = checked;
      return this;
    }


    public BrandStatus build() {
      BrandStatus brandStatus = new BrandStatus();
      brandStatus.setId(this.id);
      brandStatus.setChecked(this.checked);
      return brandStatus;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BrandStatusBuilder {\n");
      
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
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

