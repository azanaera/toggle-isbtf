package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ArchiveItemListScreen.ArchiveItemListLDV_tb;
import pcftest.ArchiveItemListScreen.ArchiveItemListLDV_tb.ResetAll;
import pcftest.ArchiveItemListScreen.ArchiveItemListLDV_tb.ResetSelected;
import pcftest.ArchiveItemListScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveItemListScreen extends PCFElement {
  public final static String CHECKSUM = "5ac769e158827b1a342d1b557ec5fdef";
  
  public ArchiveItemListScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ArchiveItemListLDV getArchiveItemListLDV() {
    return getOrCreateProperty("ArchiveItemListLDV", "ArchiveItemListLDV", null, pcftest.ArchiveItemListLDV.class);
  }
  
  public ArchiveItemListLDV_tb getArchiveItemListLDV_tb() {
    return getOrCreateProperty("ArchiveItemListLDV_tb", "ArchiveItemListLDV_tb", null, pcftest.ArchiveItemListScreen.ArchiveItemListLDV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ArchiveItemListScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveItemListLDV_tb extends PCFElement {
    public ArchiveItemListLDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ResetAll getResetAll() {
      return getOrCreateProperty("ResetAll", "ResetAll", null, pcftest.ArchiveItemListScreen.ArchiveItemListLDV_tb.ResetAll.class);
    }
    
    public ResetSelected getResetSelected() {
      return getOrCreateProperty("ResetSelected", "ResetSelected", null, pcftest.ArchiveItemListScreen.ArchiveItemListLDV_tb.ResetSelected.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ResetAll extends ClickableActionElement {
      public ResetAll(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ResetSelected extends ClickableActionElement {
      public ResetSelected(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}