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
import pcftest.VacationClaims.VacationClaimsScreen;
import pcftest.VacationClaims.VacationClaimsScreen.VacationClaims_Assign;
import pcftest.VacationClaims.VacationClaimsScreen.VacationClaims_Print;
import pcftest.VacationClaims.VacationClaimsScreen._msgs;
import pcftest.VacationClaims.VacationClaims_UpLink;
import pcftest.VacationClaims._Paging;
import pcftest.VacationClaims.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/vacation/VacationClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VacationClaims extends PCFLocation {
  public final static String CHECKSUM = "c3be0a814e2ca1d531be769ff7f34252";
  
  public VacationClaims(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("VacationClaims"));
  }
  
  public VacationClaimsScreen getVacationClaimsScreen() {
    return getOrCreateProperty("VacationClaimsScreen", "VacationClaimsScreen", null, pcftest.VacationClaims.VacationClaimsScreen.class);
  }
  
  public VacationClaims_UpLink getVacationClaims_UpLink() {
    return getOrCreateProperty("VacationClaims_UpLink", "VacationClaims_UpLink", null, pcftest.VacationClaims.VacationClaims_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.VacationClaims._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.VacationClaims.__crumb__.class);
  }
  
  public Vacation get_parent() {
    return getOrCreateProperty("_parent", pcftest.Vacation.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationClaimsScreen extends PCFElement {
    public VacationClaimsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public VacationClaimsLV getVacationClaimsLV() {
      return getOrCreateProperty("VacationClaimsLV", "VacationClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.VacationClaimsLV.class);
    }
    
    public VacationClaims_Assign getVacationClaims_Assign() {
      return getOrCreateProperty("VacationClaims_Assign", "VacationClaims_Assign", null, pcftest.VacationClaims.VacationClaimsScreen.VacationClaims_Assign.class);
    }
    
    public VacationClaims_Print getVacationClaims_Print() {
      return getOrCreateProperty("VacationClaims_Print", "VacationClaims_Print", null, pcftest.VacationClaims.VacationClaimsScreen.VacationClaims_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.VacationClaims.VacationClaimsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VacationClaims_Assign extends ClickableActionElement {
      public VacationClaims_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VacationClaims_Print extends ClickableActionElement {
      public VacationClaims_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/vacation/VacationClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationClaims_UpLink extends ClickableActionElement {
    public VacationClaims_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}