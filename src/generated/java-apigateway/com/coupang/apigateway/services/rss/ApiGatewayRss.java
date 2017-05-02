package com.coupang.apigateway.services.rss;

import com.coupang.apigateway.services.rss.RssApiV1DisplayitemsorderedpangAdapter;
import com.coupang.apigateway.services.rss.RssDealsAdapter;
import com.coupang.apigateway.services.rss.RssApiV1DisplaydetailAdapter;
import com.coupang.apigateway.services.rss.RssApiV1DisplayitemspangAdapter;
import com.coupang.apigateway.services.rss.RssDealAdapter;
import com.coupang.apigateway.services.rss.RssV1VendoritempackageinfoAdapter;
import com.coupang.apigateway.services.rss.RssV1VendoriteminfoAdapter;
import com.coupang.apigateway.services.rss.RssApiV1DisplaydetailsAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.307+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayRss {

  
  @org.springframework.beans.factory.annotation.Autowired
  private RssApiV1DisplayitemsorderedpangAdapter rssApiV1DisplayitemsorderedpangAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private RssDealsAdapter rssDealsAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private RssApiV1DisplaydetailAdapter rssApiV1DisplaydetailAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private RssApiV1DisplayitemspangAdapter rssApiV1DisplayitemspangAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private RssDealAdapter rssDealAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private RssV1VendoritempackageinfoAdapter rssV1VendoritempackageinfoAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private RssV1VendoriteminfoAdapter rssV1VendoriteminfoAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private RssApiV1DisplaydetailsAdapter rssApiV1DisplaydetailsAdapter;
  

  
  public RssApiV1DisplayitemsorderedpangAdapter rssApiV1DisplayitemsorderedpangAdapter() {
    return this.rssApiV1DisplayitemsorderedpangAdapter;
  }
  
  public RssDealsAdapter rssDealsAdapter() {
    return this.rssDealsAdapter;
  }
  
  public RssApiV1DisplaydetailAdapter rssApiV1DisplaydetailAdapter() {
    return this.rssApiV1DisplaydetailAdapter;
  }
  
  public RssApiV1DisplayitemspangAdapter rssApiV1DisplayitemspangAdapter() {
    return this.rssApiV1DisplayitemspangAdapter;
  }
  
  public RssDealAdapter rssDealAdapter() {
    return this.rssDealAdapter;
  }
  
  public RssV1VendoritempackageinfoAdapter rssV1VendoritempackageinfoAdapter() {
    return this.rssV1VendoritempackageinfoAdapter;
  }
  
  public RssV1VendoriteminfoAdapter rssV1VendoriteminfoAdapter() {
    return this.rssV1VendoriteminfoAdapter;
  }
  
  public RssApiV1DisplaydetailsAdapter rssApiV1DisplaydetailsAdapter() {
    return this.rssApiV1DisplaydetailsAdapter;
  }
  
}
