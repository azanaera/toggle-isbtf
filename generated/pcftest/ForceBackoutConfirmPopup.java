package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmPopup_UpLink;
import pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen;
import pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen.Cancel;
import pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen.Continue;
import pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen._Select;
import pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen._ViewDetail;
import pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen._msgs;
import pcftest.ForceBackoutConfirmPopup._Paging;
import pcftest.ForceBackoutConfirmPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ForceBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ForceBackoutConfirmPopup extends PCFLocation {
  public final static String CHECKSUM = "6f77fff3c8b51ca5aebb6788146767d1";
  
  public ForceBackoutConfirmPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ForceBackoutConfirmPopup"));
  }
  
  public ForceBackoutConfirmPopup_UpLink getForceBackoutConfirmPopup_UpLink() {
    return getOrCreateProperty("ForceBackoutConfirmPopup_UpLink", "ForceBackoutConfirmPopup_UpLink", null, pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmPopup_UpLink.class);
  }
  
  public ForceBackoutConfirmScreen getForceBackoutConfirmScreen() {
    return getOrCreateProperty("ForceBackoutConfirmScreen", "ForceBackoutConfirmScreen", null, pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ForceBackoutConfirmPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ForceBackoutConfirmPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ForceBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ForceBackoutConfirmPopup_UpLink extends ClickableActionElement {
    public ForceBackoutConfirmPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ForceBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ForceBackoutConfirmScreen extends PCFElement {
    public ForceBackoutConfirmScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen.Cancel.class);
    }
    
    public CheckboxValueElement getChecked() {
      return getOrCreateProperty("Checked", "Checked", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public ValueElement getConfirm() {
      return getOrCreateProperty("Confirm", "Confirm", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Continue getContinue() {
      return getOrCreateProperty("Continue", "Continue", null, pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen.Continue.class);
    }
    
    public ValueElement getServerId() {
      return getOrCreateProperty("ServerId", "ServerId", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen._ViewDetail.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ForceBackoutConfirmPopup.ForceBackoutConfirmScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ForceBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ForceBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Continue extends ClickableActionElement {
      public Continue(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ForceBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ForceBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ForceBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/ForceBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ForceBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}