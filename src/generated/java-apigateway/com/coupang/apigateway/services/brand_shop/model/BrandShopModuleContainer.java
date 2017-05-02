package com.coupang.apigateway.services.brand_shop.model;

import java.util.Objects;
import com.coupang.apigateway.services.brand_shop.model.BrandShopModule;
import com.coupang.apigateway.services.brand_shop.model.BrandShopModuleMeta;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.084+09:00")
public class BrandShopModuleContainer   {
  
  private String name = null;
  private List<BrandShopModule> modules = new ArrayList<BrandShopModule>();
  private BrandShopModuleMeta commonMeta = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("modules")
  @com.fasterxml.jackson.annotation.JsonProperty("modules")
  public List<BrandShopModule> getModules() {
    return modules;
  }
  
  /**
   **/
  public void setModules(List<BrandShopModule> modules) {
    this.modules = modules;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("commonMeta")
  @com.fasterxml.jackson.annotation.JsonProperty("commonMeta")
  public BrandShopModuleMeta getCommonMeta() {
    return commonMeta;
  }
  
  /**
   **/
  public void setCommonMeta(BrandShopModuleMeta commonMeta) {
    this.commonMeta = commonMeta;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandShopModuleContainer brandShopModuleContainer = (BrandShopModuleContainer) o;
    return Objects.equals(this.name, brandShopModuleContainer.name) &&
        Objects.equals(this.modules, brandShopModuleContainer.modules) &&
        Objects.equals(this.commonMeta, brandShopModuleContainer.commonMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, modules, commonMeta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandShopModuleContainer {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    commonMeta: ").append(toIndentedString(commonMeta)).append("\n");
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

  public static BrandShopModuleContainerBuilder builder() {
    return new BrandShopModuleContainerBuilder();
  }

  public static class BrandShopModuleContainerBuilder {

    private String name = null;
    private List<BrandShopModule> modules = new ArrayList<BrandShopModule>();
    private BrandShopModuleMeta commonMeta = null;
    

    BrandShopModuleContainerBuilder() {
    }

    /**
     **/
    public BrandShopModuleContainerBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public BrandShopModuleContainerBuilder modules(List<BrandShopModule> modules) {
      this.modules = modules;
      return this;
    }

    /**
     **/
    public BrandShopModuleContainerBuilder commonMeta(BrandShopModuleMeta commonMeta) {
      this.commonMeta = commonMeta;
      return this;
    }


    public BrandShopModuleContainer build() {
      BrandShopModuleContainer brandShopModuleContainer = new BrandShopModuleContainer();
      brandShopModuleContainer.setName(this.name);
      brandShopModuleContainer.setModules(this.modules);
      brandShopModuleContainer.setCommonMeta(this.commonMeta);
      return brandShopModuleContainer;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BrandShopModuleContainerBuilder {\n");
      
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
      sb.append("    commonMeta: ").append(toIndentedString(commonMeta)).append("\n");
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

