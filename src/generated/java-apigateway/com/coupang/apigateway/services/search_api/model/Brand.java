package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class Brand   {
  
  private Boolean used = null;
  private String name = null;
  private Long id = null;
  private String code = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("used")
  @com.fasterxml.jackson.annotation.JsonProperty("used")
  public Boolean getUsed() {
    return used;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUsed() {
    return used == null ? false : used;
  }
  
  /**
   **/
  public void setUsed(Boolean used) {
    this.used = used;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("code")
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  public String getCode() {
    return code;
  }
  
  /**
   **/
  public void setCode(String code) {
    this.code = code;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Brand brand = (Brand) o;
    return Objects.equals(this.used, brand.used) &&
        Objects.equals(this.name, brand.name) &&
        Objects.equals(this.id, brand.id) &&
        Objects.equals(this.code, brand.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(used, name, id, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brand {\n");
    
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

  public static BrandBuilder builder() {
    return new BrandBuilder();
  }

  public static class BrandBuilder {

    private Boolean used = null;
    private String name = null;
    private Long id = null;
    private String code = null;
    

    BrandBuilder() {
    }

    /**
     **/
    public BrandBuilder used(Boolean used) {
      this.used = used;
      return this;
    }

    /**
     **/
    public BrandBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public BrandBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public BrandBuilder code(String code) {
      this.code = code;
      return this;
    }


    public Brand build() {
      Brand brand = new Brand();
      brand.setUsed(this.used);
      brand.setName(this.name);
      brand.setId(this.id);
      brand.setCode(this.code);
      return brand;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BrandBuilder {\n");
      
      sb.append("    used: ").append(toIndentedString(used)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

