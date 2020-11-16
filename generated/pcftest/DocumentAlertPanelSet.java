package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentAlertPanelSet.IDCSDisabledAlert;
import pcftest.DocumentAlertPanelSet.IDCSUnavailableAlert;
import pcftest.DocumentAlertPanelSet.IDMSUnavailableAlert;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/documents/DocumentAlertPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentAlertPanelSet extends PCFElement {
  public final static String CHECKSUM = "8203212f9c7a229f59c7d049b8d4364c";
  
  public DocumentAlertPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IDCSDisabledAlert getIDCSDisabledAlert() {
    return getOrCreateProperty("IDCSDisabledAlert", "IDCSDisabledAlert", null, pcftest.DocumentAlertPanelSet.IDCSDisabledAlert.class);
  }
  
  public IDCSUnavailableAlert getIDCSUnavailableAlert() {
    return getOrCreateProperty("IDCSUnavailableAlert", "IDCSUnavailableAlert", null, pcftest.DocumentAlertPanelSet.IDCSUnavailableAlert.class);
  }
  
  public IDMSUnavailableAlert getIDMSUnavailableAlert() {
    return getOrCreateProperty("IDMSUnavailableAlert", "IDMSUnavailableAlert", null, pcftest.DocumentAlertPanelSet.IDMSUnavailableAlert.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/DocumentAlertPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDCSDisabledAlert extends ValueElement {
    public IDCSDisabledAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/DocumentAlertPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDCSUnavailableAlert extends ValueElement {
    public IDCSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/DocumentAlertPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDMSUnavailableAlert extends ValueElement {
    public IDMSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}