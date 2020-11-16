package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MetroFlowLogEntryDetail.MetroFlowLogEntryDetailScreen;
import pcftest.MetroFlowLogEntryDetail.MetroFlowLogEntryDetailScreen.MetroFlowLogEntryDetailDV;
import pcftest.MetroFlowLogEntryDetail.MetroFlowLogEntryDetailScreen.MetroFlowLogEntryDetail_OKButton;
import pcftest.MetroFlowLogEntryDetail.MetroFlowLogEntryDetailScreen._msgs;
import pcftest.MetroFlowLogEntryDetail.MetroFlowLogEntryDetail_UpLink;
import pcftest.MetroFlowLogEntryDetail._Paging;
import pcftest.MetroFlowLogEntryDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlowLogEntryDetail extends PCFLocation {
  public final static String CHECKSUM = "7205c78b3b7a5555b11bc31f652c69f0";
  
  public MetroFlowLogEntryDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MetroFlowLogEntryDetail"));
  }
  
  public MetroFlowLogEntryDetailScreen getMetroFlowLogEntryDetailScreen() {
    return getOrCreateProperty("MetroFlowLogEntryDetailScreen", "MetroFlowLogEntryDetailScreen", null, pcftest.MetroFlowLogEntryDetail.MetroFlowLogEntryDetailScreen.class);
  }
  
  public MetroFlowLogEntryDetail_UpLink getMetroFlowLogEntryDetail_UpLink() {
    return getOrCreateProperty("MetroFlowLogEntryDetail_UpLink", "MetroFlowLogEntryDetail_UpLink", null, pcftest.MetroFlowLogEntryDetail.MetroFlowLogEntryDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MetroFlowLogEntryDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MetroFlowLogEntryDetail.__crumb__.class);
  }
  
  public MetroFlowDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.MetroFlowDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowLogEntryDetailScreen extends PCFElement {
    public MetroFlowLogEntryDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MetroFlowLogEntryDetailDV getMetroFlowLogEntryDetailDV() {
      return getOrCreateProperty("MetroFlowLogEntryDetailDV", "MetroFlowLogEntryDetailDV", null, pcftest.MetroFlowLogEntryDetail.MetroFlowLogEntryDetailScreen.MetroFlowLogEntryDetailDV.class);
    }
    
    public MetroFlowLogEntryDetail_OKButton getMetroFlowLogEntryDetail_OKButton() {
      return getOrCreateProperty("MetroFlowLogEntryDetail_OKButton", "MetroFlowLogEntryDetail_OKButton", null, pcftest.MetroFlowLogEntryDetail.MetroFlowLogEntryDetailScreen.MetroFlowLogEntryDetail_OKButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MetroFlowLogEntryDetail.MetroFlowLogEntryDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroFlowLogEntryDetailDV extends DetailViewElement {
      public MetroFlowLogEntryDetailDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLogDate() {
        return getOrCreateProperty("LogDate", "LogDate", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getSummary() {
        return getOrCreateProperty("Summary", "Summary", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroFlowLogEntryDetail_OKButton extends ClickableActionElement {
      public MetroFlowLogEntryDetail_OKButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MetroFlowDetail click() {
        return clickThis(pcftest.MetroFlowDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowLogEntryDetail_UpLink extends ClickableActionElement {
    public MetroFlowLogEntryDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}