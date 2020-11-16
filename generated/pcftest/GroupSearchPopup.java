package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GroupSearchPopup.GroupSearchPopup_UpLink;
import pcftest.GroupSearchPopup._Paging;
import pcftest.GroupSearchPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupSearchPopup extends PCFLocation {
  public final static String CHECKSUM = "b129c932995c4cb5426870b5cafd8a45";
  
  public GroupSearchPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("GroupSearchPopup"));
  }
  
  public GroupSearchPickerScreen getGroupSearchPickerScreen() {
    return getOrCreateProperty("GroupSearchPickerScreen", "GroupSearchPickerScreen", null, pcftest.GroupSearchPickerScreen.class);
  }
  
  public GroupSearchPopup_UpLink getGroupSearchPopup_UpLink() {
    return getOrCreateProperty("GroupSearchPopup_UpLink", "GroupSearchPopup_UpLink", null, pcftest.GroupSearchPopup.GroupSearchPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.GroupSearchPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.GroupSearchPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupSearchPopup_UpLink extends ClickableActionElement {
    public GroupSearchPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}