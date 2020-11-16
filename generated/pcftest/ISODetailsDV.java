package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ISODetailsDV.ISOMatchReportsLV_tb;
import pcftest.ISODetailsDV.Status;
import typekey.ISOStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/iso/ISODetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ISODetailsDV extends DetailViewElement {
  public final static String CHECKSUM = "58c23531092fe288aad4f447f3ffc09d";
  
  public ISODetailsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getISOErrorMessage() {
    return getOrCreateProperty("ISOErrorMessage", "ISOErrorMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ISOMatchReportsLV getISOMatchReportsLV() {
    return getOrCreateProperty("ISOMatchReportsLV", "ISOMatchReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ISOMatchReportsLV.class);
  }
  
  public ISOMatchReportsLV_tb getISOMatchReportsLV_tb() {
    return getOrCreateProperty("ISOMatchReportsLV_tb", "ISOMatchReportsLV_tb", null, pcftest.ISODetailsDV.ISOMatchReportsLV_tb.class);
  }
  
  public BooleanValueElement getKnownToISO() {
    return getOrCreateProperty("KnownToISO", "KnownToISO", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getReceiveDate() {
    return getOrCreateProperty("ReceiveDate", "ReceiveDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getSendDate() {
    return getOrCreateProperty("SendDate", "SendDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.ISODetailsDV.Status.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/iso/ISODetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ISOMatchReportsLV_tb extends PCFElement {
    public ISOMatchReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/iso/ISODetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ISOStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ISOStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ISOStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ISOStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}