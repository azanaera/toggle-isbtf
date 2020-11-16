package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SecurityDictionaryDV.DownloadButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/importexport/SecurityDictionaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SecurityDictionaryDV extends DetailViewElement {
  public final static String CHECKSUM = "750324b05d1ec26a15d4db7dcdcc1a80";
  
  public SecurityDictionaryDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DownloadButton getDownloadButton() {
    return getOrCreateProperty("DownloadButton", "DownloadButton", null, pcftest.SecurityDictionaryDV.DownloadButton.class);
  }
  
  public SelectElement getOutputFormat() {
    return getOrCreateProperty("OutputFormat", "OutputFormat", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/SecurityDictionaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadButton extends ValueElement {
    public DownloadButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}