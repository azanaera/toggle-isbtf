package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SerializationInfo.SerializationInfo_UpLink;
import pcftest.SerializationInfo._Paging;
import pcftest.SerializationInfo.__crumb__;
import pcftest.SerializationInfo._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/SerializationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SerializationInfo extends PCFLocation {
  public final static String CHECKSUM = "ee3e19e302f13d4caa7de45ecf37363e";
  
  public SerializationInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SerializationInfo"));
  }
  
  public ValueElement getDeserializedClasses() {
    return getOrCreateProperty("DeserializedClasses", "DeserializedClasses", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckboxValueElement getIncludingWhitelistedClasses() {
    return getOrCreateProperty("IncludingWhitelistedClasses", "IncludingWhitelistedClasses", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public SerializationInfo_UpLink getSerializationInfo_UpLink() {
    return getOrCreateProperty("SerializationInfo_UpLink", "SerializationInfo_UpLink", null, pcftest.SerializationInfo.SerializationInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SerializationInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SerializationInfo.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SerializationInfo._msgs.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SerializationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SerializationInfo_UpLink extends ClickableActionElement {
    public SerializationInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SerializationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SerializationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SerializationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}