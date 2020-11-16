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
import pcftest.PrintOptionPopup.PrintOptionPopupScreen;
import pcftest.PrintOptionPopup.PrintOptionPopupScreen.Done;
import pcftest.PrintOptionPopup.PrintOptionPopupScreen.Ok;
import pcftest.PrintOptionPopup.PrintOptionPopupScreen._msgs;
import pcftest.PrintOptionPopup.PrintOptionPopup_UpLink;
import pcftest.PrintOptionPopup._Paging;
import pcftest.PrintOptionPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/PrintOptionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PrintOptionPopup extends PCFLocation {
  public final static String CHECKSUM = "f902c04942b7d620439d051f57f287e5";
  
  public PrintOptionPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PrintOptionPopup"));
  }
  
  public PrintOptionPopupScreen getPrintOptionPopupScreen() {
    return getOrCreateProperty("PrintOptionPopupScreen", "PrintOptionPopupScreen", null, pcftest.PrintOptionPopup.PrintOptionPopupScreen.class);
  }
  
  public PrintOptionPopup_UpLink getPrintOptionPopup_UpLink() {
    return getOrCreateProperty("PrintOptionPopup_UpLink", "PrintOptionPopup_UpLink", null, pcftest.PrintOptionPopup.PrintOptionPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PrintOptionPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PrintOptionPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/PrintOptionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrintOptionPopupScreen extends PCFElement {
    public PrintOptionPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Done getDone() {
      return getOrCreateProperty("Done", "Done", null, pcftest.PrintOptionPopup.PrintOptionPopupScreen.Done.class);
    }
    
    public Ok getOk() {
      return getOrCreateProperty("Ok", "Ok", null, pcftest.PrintOptionPopup.PrintOptionPopupScreen.Ok.class);
    }
    
    public PrintOptionDV getPrintOptionDV() {
      return getOrCreateProperty("PrintOptionDV", "PrintOptionDV", null, pcftest.PrintOptionDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PrintOptionPopup.PrintOptionPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/PrintOptionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Done extends ClickableActionElement {
      public Done(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/PrintOptionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Ok extends ClickableActionElement {
      public Ok(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/PrintOptionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/PrintOptionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrintOptionPopup_UpLink extends ClickableActionElement {
    public PrintOptionPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/PrintOptionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/PrintOptionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}