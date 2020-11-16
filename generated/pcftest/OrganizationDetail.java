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
import pcftest.OrganizationDetail.OrganizationDetailScreen;
import pcftest.OrganizationDetail.OrganizationDetailScreen.Cancel;
import pcftest.OrganizationDetail.OrganizationDetailScreen.Edit;
import pcftest.OrganizationDetail.OrganizationDetailScreen.OrganizationDetail_BasicCardTab;
import pcftest.OrganizationDetail.OrganizationDetailScreen.OrganizationDetail_DeleteButton;
import pcftest.OrganizationDetail.OrganizationDetailScreen.Update;
import pcftest.OrganizationDetail.OrganizationDetailScreen._msgs;
import pcftest.OrganizationDetail.OrganizationDetail_UpLink;
import pcftest.OrganizationDetail._Paging;
import pcftest.OrganizationDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationDetail extends PCFLocation {
  public final static String CHECKSUM = "c227c2cd76d9e63f40c7dffeb222a6d1";
  
  public OrganizationDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OrganizationDetail"));
  }
  
  public OrganizationDetailScreen getOrganizationDetailScreen() {
    return getOrCreateProperty("OrganizationDetailScreen", "OrganizationDetailScreen", null, pcftest.OrganizationDetail.OrganizationDetailScreen.class);
  }
  
  public OrganizationDetail_UpLink getOrganizationDetail_UpLink() {
    return getOrCreateProperty("OrganizationDetail_UpLink", "OrganizationDetail_UpLink", null, pcftest.OrganizationDetail.OrganizationDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OrganizationDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OrganizationDetail.__crumb__.class);
  }
  
  public Organizations get_parent() {
    return getOrCreateProperty("_parent", pcftest.Organizations.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationDetailScreen extends PCFElement {
    public OrganizationDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.OrganizationDetail.OrganizationDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.OrganizationDetail.OrganizationDetailScreen.Edit.class);
    }
    
    public OrganizationDetail_BasicCardTab getOrganizationDetail_BasicCardTab() {
      return getOrCreateProperty("OrganizationDetail_BasicCardTab", "OrganizationDetail_BasicCardTab", null, pcftest.OrganizationDetail.OrganizationDetailScreen.OrganizationDetail_BasicCardTab.class);
    }
    
    public OrganizationDetail_BasicDV getOrganizationDetail_BasicDV() {
      return getOrCreateProperty("OrganizationDetail_BasicDV", "OrganizationDetail_BasicDV", null, pcftest.OrganizationDetail_BasicDV.class);
    }
    
    public OrganizationDetail_DeleteButton getOrganizationDetail_DeleteButton() {
      return getOrCreateProperty("OrganizationDetail_DeleteButton", "OrganizationDetail_DeleteButton", null, pcftest.OrganizationDetail.OrganizationDetailScreen.OrganizationDetail_DeleteButton.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.OrganizationDetail.OrganizationDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OrganizationDetail.OrganizationDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OrganizationDetail_BasicCardTab extends ClickableActionElement {
      public OrganizationDetail_BasicCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OrganizationDetail_DeleteButton extends ClickableActionElement {
      public OrganizationDetail_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationDetail_UpLink extends ClickableActionElement {
    public OrganizationDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/OrganizationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}