package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import java.util.*;



/**
 * Client context Model
 **/

@io.swagger.annotations.ApiModel(description = "Client context Model")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class Context   {
  


  public enum ViewTypeEnum {
    MOBILE_WEB("MOBILE_WEB"),
    APP("APP"),
    APP_PUSH("APP_PUSH"),
    WEB("WEB");

    private String value;

    ViewTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ViewTypeEnum viewType = null;
  private String uuid = null;
  private Long userNo = null;
  private String swapSet = null;
  private List<String> rawParameters = new ArrayList<String>();
  private String pcid = null;


  public enum OsTypeEnum {
    Android("Android"),
    IOS("IOS"),
    PC("PC"),
    Unknown("Unknown");

    private String value;

    OsTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private OsTypeEnum osType = null;
  private String ip = null;
  private String filteredAbTests = null;
  private String channel = null;
  private Long bundleId = null;
  private String appVersion = null;
  private String abTests = null;

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Platform Type")
  @org.codehaus.jackson.annotate.JsonProperty("viewType")
  @com.fasterxml.jackson.annotation.JsonProperty("viewType")
  public ViewTypeEnum getViewType() {
    return viewType;
  }
  
  /**
   * Platform Type
   **/
  public void setViewType(ViewTypeEnum viewType) {
    this.viewType = viewType;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "UUID")
  @org.codehaus.jackson.annotate.JsonProperty("uuid")
  @com.fasterxml.jackson.annotation.JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }
  
  /**
   * UUID
   **/
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "User ID")
  @org.codehaus.jackson.annotate.JsonProperty("userNo")
  @com.fasterxml.jackson.annotation.JsonProperty("userNo")
  public Long getUserNo() {
    return userNo;
  }
  
  /**
   * User ID
   **/
  public void setUserNo(Long userNo) {
    this.userNo = userNo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "Goodbye Dual Write Flag")
  @org.codehaus.jackson.annotate.JsonProperty("swapSet")
  @com.fasterxml.jackson.annotation.JsonProperty("swapSet")
  public String getSwapSet() {
    return swapSet;
  }
  
  /**
   * Goodbye Dual Write Flag
   **/
  public void setSwapSet(String swapSet) {
    this.swapSet = swapSet;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rawParameters")
  @com.fasterxml.jackson.annotation.JsonProperty("rawParameters")
  public List<String> getRawParameters() {
    return rawParameters;
  }
  
  /**
   **/
  public void setRawParameters(List<String> rawParameters) {
    this.rawParameters = rawParameters;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "PCID")
  @org.codehaus.jackson.annotate.JsonProperty("pcid")
  @com.fasterxml.jackson.annotation.JsonProperty("pcid")
  public String getPcid() {
    return pcid;
  }
  
  /**
   * PCID
   **/
  public void setPcid(String pcid) {
    this.pcid = pcid;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "User Device Type")
  @org.codehaus.jackson.annotate.JsonProperty("osType")
  @com.fasterxml.jackson.annotation.JsonProperty("osType")
  public OsTypeEnum getOsType() {
    return osType;
  }
  
  /**
   * User Device Type
   **/
  public void setOsType(OsTypeEnum osType) {
    this.osType = osType;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "User IP")
  @org.codehaus.jackson.annotate.JsonProperty("ip")
  @com.fasterxml.jackson.annotation.JsonProperty("ip")
  public String getIp() {
    return ip;
  }
  
  /**
   * User IP
   **/
  public void setIp(String ip) {
    this.ip = ip;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("filteredAbTests")
  @com.fasterxml.jackson.annotation.JsonProperty("filteredAbTests")
  public String getFilteredAbTests() {
    return filteredAbTests;
  }
  
  /**
   **/
  public void setFilteredAbTests(String filteredAbTests) {
    this.filteredAbTests = filteredAbTests;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "User input channel")
  @org.codehaus.jackson.annotate.JsonProperty("channel")
  @com.fasterxml.jackson.annotation.JsonProperty("channel")
  public String getChannel() {
    return channel;
  }
  
  /**
   * User input channel
   **/
  public void setChannel(String channel) {
    this.channel = channel;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Bundle id")
  @org.codehaus.jackson.annotate.JsonProperty("bundleId")
  @com.fasterxml.jackson.annotation.JsonProperty("bundleId")
  public Long getBundleId() {
    return bundleId;
  }
  
  /**
   * Bundle id
   **/
  public void setBundleId(Long bundleId) {
    this.bundleId = bundleId;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "User App Version")
  @org.codehaus.jackson.annotate.JsonProperty("appVersion")
  @com.fasterxml.jackson.annotation.JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  
  /**
   * User App Version
   **/
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Fixed Ab Test List String, e.g) 1324_B,1325_C")
  @org.codehaus.jackson.annotate.JsonProperty("abTests")
  @com.fasterxml.jackson.annotation.JsonProperty("abTests")
  public String getAbTests() {
    return abTests;
  }
  
  /**
   * Fixed Ab Test List String, e.g) 1324_B,1325_C
   **/
  public void setAbTests(String abTests) {
    this.abTests = abTests;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(this.viewType, context.viewType) &&
        Objects.equals(this.uuid, context.uuid) &&
        Objects.equals(this.userNo, context.userNo) &&
        Objects.equals(this.swapSet, context.swapSet) &&
        Objects.equals(this.rawParameters, context.rawParameters) &&
        Objects.equals(this.pcid, context.pcid) &&
        Objects.equals(this.osType, context.osType) &&
        Objects.equals(this.ip, context.ip) &&
        Objects.equals(this.filteredAbTests, context.filteredAbTests) &&
        Objects.equals(this.channel, context.channel) &&
        Objects.equals(this.bundleId, context.bundleId) &&
        Objects.equals(this.appVersion, context.appVersion) &&
        Objects.equals(this.abTests, context.abTests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewType, uuid, userNo, swapSet, rawParameters, pcid, osType, ip, filteredAbTests, channel, bundleId, appVersion, abTests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    userNo: ").append(toIndentedString(userNo)).append("\n");
    sb.append("    swapSet: ").append(toIndentedString(swapSet)).append("\n");
    sb.append("    rawParameters: ").append(toIndentedString(rawParameters)).append("\n");
    sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    filteredAbTests: ").append(toIndentedString(filteredAbTests)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    abTests: ").append(toIndentedString(abTests)).append("\n");
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

  public static ContextBuilder builder() {
    return new ContextBuilder();
  }

  public static class ContextBuilder {

    private ViewTypeEnum viewType = null;
    private String uuid = null;
    private Long userNo = null;
    private String swapSet = null;
    private List<String> rawParameters = new ArrayList<String>();
    private String pcid = null;
    private OsTypeEnum osType = null;
    private String ip = null;
    private String filteredAbTests = null;
    private String channel = null;
    private Long bundleId = null;
    private String appVersion = null;
    private String abTests = null;
    

    ContextBuilder() {
    }

    /**
     * Platform Type
     **/
    public ContextBuilder viewType(ViewTypeEnum viewType) {
      this.viewType = viewType;
      return this;
    }

    /**
     * UUID
     **/
    public ContextBuilder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }

    /**
     * User ID
     **/
    public ContextBuilder userNo(Long userNo) {
      this.userNo = userNo;
      return this;
    }

    /**
     * Goodbye Dual Write Flag
     **/
    public ContextBuilder swapSet(String swapSet) {
      this.swapSet = swapSet;
      return this;
    }

    /**
     **/
    public ContextBuilder rawParameters(List<String> rawParameters) {
      this.rawParameters = rawParameters;
      return this;
    }

    /**
     * PCID
     **/
    public ContextBuilder pcid(String pcid) {
      this.pcid = pcid;
      return this;
    }

    /**
     * User Device Type
     **/
    public ContextBuilder osType(OsTypeEnum osType) {
      this.osType = osType;
      return this;
    }

    /**
     * User IP
     **/
    public ContextBuilder ip(String ip) {
      this.ip = ip;
      return this;
    }

    /**
     **/
    public ContextBuilder filteredAbTests(String filteredAbTests) {
      this.filteredAbTests = filteredAbTests;
      return this;
    }

    /**
     * User input channel
     **/
    public ContextBuilder channel(String channel) {
      this.channel = channel;
      return this;
    }

    /**
     * Bundle id
     **/
    public ContextBuilder bundleId(Long bundleId) {
      this.bundleId = bundleId;
      return this;
    }

    /**
     * User App Version
     **/
    public ContextBuilder appVersion(String appVersion) {
      this.appVersion = appVersion;
      return this;
    }

    /**
     * Fixed Ab Test List String, e.g) 1324_B,1325_C
     **/
    public ContextBuilder abTests(String abTests) {
      this.abTests = abTests;
      return this;
    }


    public Context build() {
      Context context = new Context();
      context.setViewType(this.viewType);
      context.setUuid(this.uuid);
      context.setUserNo(this.userNo);
      context.setSwapSet(this.swapSet);
      context.setRawParameters(this.rawParameters);
      context.setPcid(this.pcid);
      context.setOsType(this.osType);
      context.setIp(this.ip);
      context.setFilteredAbTests(this.filteredAbTests);
      context.setChannel(this.channel);
      context.setBundleId(this.bundleId);
      context.setAppVersion(this.appVersion);
      context.setAbTests(this.abTests);
      return context;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ContextBuilder {\n");
      
      sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
      sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
      sb.append("    userNo: ").append(toIndentedString(userNo)).append("\n");
      sb.append("    swapSet: ").append(toIndentedString(swapSet)).append("\n");
      sb.append("    rawParameters: ").append(toIndentedString(rawParameters)).append("\n");
      sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
      sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
      sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
      sb.append("    filteredAbTests: ").append(toIndentedString(filteredAbTests)).append("\n");
      sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
      sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
      sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
      sb.append("    abTests: ").append(toIndentedString(abTests)).append("\n");
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

