package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CatastropheDetailScreen.AdminCatastropheDV_tb;
import pcftest.CatastropheDetailScreen.AdminCatastropheDV_tb.FindUnmatchedClaimsButton;
import pcftest.CatastropheDetailScreen.AdminCatastropheDV_tb.ShowCatMapButton;
import pcftest.CatastropheDetailScreen.Cancel;
import pcftest.CatastropheDetailScreen.DetailsTab;
import pcftest.CatastropheDetailScreen.Edit;
import pcftest.CatastropheDetailScreen.PolicyTab;
import pcftest.CatastropheDetailScreen.Update;
import pcftest.CatastropheDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheDetailScreen extends PCFElement {
  public final static String CHECKSUM = "88d4b65b2155d065db07dde9051e14c6";
  
  public CatastropheDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AdminCatastropheDV getAdminCatastropheDV() {
    return getOrCreateProperty("AdminCatastropheDV", "AdminCatastropheDV", null, pcftest.AdminCatastropheDV.class);
  }
  
  public AdminCatastropheDV_tb getAdminCatastropheDV_tb() {
    return getOrCreateProperty("AdminCatastropheDV_tb", "AdminCatastropheDV_tb", null, pcftest.CatastropheDetailScreen.AdminCatastropheDV_tb.class);
  }
  
  public AdminCatastrophePolicyPanelSet getAdminCatastrophePolicyPanelSet() {
    return getOrCreateProperty("AdminCatastrophePolicyPanelSet", "AdminCatastrophePolicyPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.AdminCatastrophePolicyPanelSet.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CatastropheDetailScreen.Cancel.class);
  }
  
  public DetailsTab getDetailsTab() {
    return getOrCreateProperty("DetailsTab", "DetailsTab", null, pcftest.CatastropheDetailScreen.DetailsTab.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.CatastropheDetailScreen.Edit.class);
  }
  
  public PolicyTab getPolicyTab() {
    return getOrCreateProperty("PolicyTab", "PolicyTab", null, pcftest.CatastropheDetailScreen.PolicyTab.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.CatastropheDetailScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CatastropheDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminCatastropheDV_tb extends PCFElement {
    public AdminCatastropheDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FindUnmatchedClaimsButton getFindUnmatchedClaimsButton() {
      return getOrCreateProperty("FindUnmatchedClaimsButton", "FindUnmatchedClaimsButton", null, pcftest.CatastropheDetailScreen.AdminCatastropheDV_tb.FindUnmatchedClaimsButton.class);
    }
    
    public ShowCatMapButton getShowCatMapButton() {
      return getOrCreateProperty("ShowCatMapButton", "ShowCatMapButton", null, pcftest.CatastropheDetailScreen.AdminCatastropheDV_tb.ShowCatMapButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FindUnmatchedClaimsButton extends ClickableActionElement {
      public FindUnmatchedClaimsButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ShowCatMapButton extends ClickableActionElement {
      public ShowCatMapButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CatastropheSearch click() {
        return clickThis(pcftest.CatastropheSearch.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailsTab extends ClickableActionElement {
    public DetailsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTab extends ClickableActionElement {
    public PolicyTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}