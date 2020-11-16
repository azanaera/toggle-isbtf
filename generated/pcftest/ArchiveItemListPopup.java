package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ArchiveItemListPopup.ArchiveItemListPopup_UpLink;
import pcftest.ArchiveItemListPopup._Paging;
import pcftest.ArchiveItemListPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveItemListPopup extends PCFLocation {
  public final static String CHECKSUM = "f9e06e85ebbd5a1401645e994b161a81";
  
  public ArchiveItemListPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ArchiveItemListPopup"));
  }
  
  public ArchiveItemListPopup_UpLink getArchiveItemListPopup_UpLink() {
    return getOrCreateProperty("ArchiveItemListPopup_UpLink", "ArchiveItemListPopup_UpLink", null, pcftest.ArchiveItemListPopup.ArchiveItemListPopup_UpLink.class);
  }
  
  public ArchiveItemListScreen getArchiveItemListScreen() {
    return getOrCreateProperty("ArchiveItemListScreen", "ArchiveItemListScreen", null, pcftest.ArchiveItemListScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ArchiveItemListPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ArchiveItemListPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveItemListPopup_UpLink extends ClickableActionElement {
    public ArchiveItemListPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}