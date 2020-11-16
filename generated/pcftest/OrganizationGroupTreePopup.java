package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.TreeViewElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OrganizationGroupTreePopup.OrganizationGroupTreePopupScreen;
import pcftest.OrganizationGroupTreePopup.OrganizationGroupTreePopupScreen.OrganizationGroupTreePopup2;
import pcftest.OrganizationGroupTreePopup.OrganizationGroupTreePopupScreen.OrganizationGroupTreePopup2.OrganizationGroupTreePopupPicker;
import pcftest.OrganizationGroupTreePopup.OrganizationGroupTreePopupScreen._msgs;
import pcftest.OrganizationGroupTreePopup.OrganizationGroupTreePopup_UpLink;
import pcftest.OrganizationGroupTreePopup._Paging;
import pcftest.OrganizationGroupTreePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/organizationselect/OrganizationGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationGroupTreePopup extends PCFLocation {
  public final static String CHECKSUM = "7f5ddd29e93da845cbecc9e94e1d81e1";
  
  public OrganizationGroupTreePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OrganizationGroupTreePopup"));
  }
  
  public OrganizationGroupTreePopupScreen getOrganizationGroupTreePopupScreen() {
    return getOrCreateProperty("OrganizationGroupTreePopupScreen", "OrganizationGroupTreePopupScreen", null, pcftest.OrganizationGroupTreePopup.OrganizationGroupTreePopupScreen.class);
  }
  
  public OrganizationGroupTreePopup_UpLink getOrganizationGroupTreePopup_UpLink() {
    return getOrCreateProperty("OrganizationGroupTreePopup_UpLink", "OrganizationGroupTreePopup_UpLink", null, pcftest.OrganizationGroupTreePopup.OrganizationGroupTreePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OrganizationGroupTreePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OrganizationGroupTreePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/organizationselect/OrganizationGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationGroupTreePopupScreen extends PCFElement {
    public OrganizationGroupTreePopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OrganizationGroupTreePopup2 getOrganizationGroupTreePopup() {
      return getOrCreateProperty("OrganizationGroupTreePopup", "OrganizationGroupTreePopup", null, pcftest.OrganizationGroupTreePopup.OrganizationGroupTreePopupScreen.OrganizationGroupTreePopup2.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OrganizationGroupTreePopup.OrganizationGroupTreePopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/organizationselect/OrganizationGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OrganizationGroupTreePopup2 extends PCFElement {
      public OrganizationGroupTreePopup2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OrganizationGroupTreePopupPicker getOrganizationGroupTreePopupPicker() {
        return getOrCreateProperty("OrganizationGroupTreePopupPicker", "OrganizationGroupTreePopupPicker", null, pcftest.OrganizationGroupTreePopup.OrganizationGroupTreePopupScreen.OrganizationGroupTreePopup2.OrganizationGroupTreePopupPicker.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/organizationselect/OrganizationGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OrganizationGroupTreePopupPicker extends TreeViewElement {
        public OrganizationGroupTreePopupPicker(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/organizationselect/OrganizationGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/organizationselect/OrganizationGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationGroupTreePopup_UpLink extends ClickableActionElement {
    public OrganizationGroupTreePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/organizationselect/OrganizationGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/organizationselect/OrganizationGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}