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
import pcftest.ClaimAssociationDetail.ClaimAssociationDetailScreen;
import pcftest.ClaimAssociationDetail.ClaimAssociationDetailScreen.Cancel;
import pcftest.ClaimAssociationDetail.ClaimAssociationDetailScreen.Edit;
import pcftest.ClaimAssociationDetail.ClaimAssociationDetailScreen.Update;
import pcftest.ClaimAssociationDetail.ClaimAssociationDetailScreen._msgs;
import pcftest.ClaimAssociationDetail.ClaimAssociationDetail_UpLink;
import pcftest.ClaimAssociationDetail._Paging;
import pcftest.ClaimAssociationDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimAssociationDetail extends PCFLocation {
  public final static String CHECKSUM = "67a00415118db22d14d817690c13e0c4";
  
  public ClaimAssociationDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimAssociationDetail"));
  }
  
  public ClaimAssociationDetailScreen getClaimAssociationDetailScreen() {
    return getOrCreateProperty("ClaimAssociationDetailScreen", "ClaimAssociationDetailScreen", null, pcftest.ClaimAssociationDetail.ClaimAssociationDetailScreen.class);
  }
  
  public ClaimAssociationDetail_UpLink getClaimAssociationDetail_UpLink() {
    return getOrCreateProperty("ClaimAssociationDetail_UpLink", "ClaimAssociationDetail_UpLink", null, pcftest.ClaimAssociationDetail.ClaimAssociationDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimAssociationDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimAssociationDetail.__crumb__.class);
  }
  
  public ClaimAssociations get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimAssociations.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationDetailScreen extends PCFElement {
    public ClaimAssociationDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimAssociationDetail.ClaimAssociationDetailScreen.Cancel.class);
    }
    
    public ClaimAssociationDetailDV getClaimAssociationDetailDV() {
      return getOrCreateProperty("ClaimAssociationDetailDV", "ClaimAssociationDetailDV", null, pcftest.ClaimAssociationDetailDV.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimAssociationDetail.ClaimAssociationDetailScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ClaimAssociationDetail.ClaimAssociationDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimAssociationDetail.ClaimAssociationDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationDetail_UpLink extends ClickableActionElement {
    public ClaimAssociationDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}