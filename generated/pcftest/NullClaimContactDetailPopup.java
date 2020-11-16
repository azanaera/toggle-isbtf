package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NullClaimContactDetailPopup.NullClaimContactDetailPopup_UpLink;
import pcftest.NullClaimContactDetailPopup.NullClaimContactDetailScreen;
import pcftest.NullClaimContactDetailPopup.NullClaimContactDetailScreen._msgs;
import pcftest.NullClaimContactDetailPopup._Paging;
import pcftest.NullClaimContactDetailPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/contacts/NullClaimContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NullClaimContactDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "99afcee3eedc7a1ecb226208f422ec2d";
  
  public NullClaimContactDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NullClaimContactDetailPopup"));
  }
  
  public NullClaimContactDetailPopup_UpLink getNullClaimContactDetailPopup_UpLink() {
    return getOrCreateProperty("NullClaimContactDetailPopup_UpLink", "NullClaimContactDetailPopup_UpLink", null, pcftest.NullClaimContactDetailPopup.NullClaimContactDetailPopup_UpLink.class);
  }
  
  public NullClaimContactDetailScreen getNullClaimContactDetailScreen() {
    return getOrCreateProperty("NullClaimContactDetailScreen", "NullClaimContactDetailScreen", null, pcftest.NullClaimContactDetailPopup.NullClaimContactDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NullClaimContactDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NullClaimContactDetailPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/NullClaimContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NullClaimContactDetailPopup_UpLink extends ClickableActionElement {
    public NullClaimContactDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/NullClaimContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NullClaimContactDetailScreen extends PCFElement {
    public NullClaimContactDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NullClaimContactDetailPopup.NullClaimContactDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/NullClaimContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/contacts/NullClaimContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/NullClaimContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}