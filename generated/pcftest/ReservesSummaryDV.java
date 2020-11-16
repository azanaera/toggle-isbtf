package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReservesSummaryDV.EditableReservesLV_tb;
import pcftest.ReservesSummaryDV.ReserveSetDocumentsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/reserve/ReservesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReservesSummaryDV extends DetailViewElement {
  public final static String CHECKSUM = "3dec27d738c33b255f72984d41a0b493";
  
  public ReservesSummaryDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableReservesLV getEditableReservesLV() {
    return getOrCreateProperty("EditableReservesLV", "EditableReservesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableReservesLV.class);
  }
  
  public EditableReservesLV_tb getEditableReservesLV_tb() {
    return getOrCreateProperty("EditableReservesLV_tb", "EditableReservesLV_tb", null, pcftest.ReservesSummaryDV.EditableReservesLV_tb.class);
  }
  
  public ValueElement getReserveLabel() {
    return getOrCreateProperty("ReserveLabel", "ReserveLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ReserveSetDocumentsLV getReserveSetDocumentsLV() {
    return getOrCreateProperty("ReserveSetDocumentsLV", "ReserveSetDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReserveSetDocumentsLV.class);
  }
  
  public ReserveSetDocumentsLV_tb getReserveSetDocumentsLV_tb() {
    return getOrCreateProperty("ReserveSetDocumentsLV_tb", "ReserveSetDocumentsLV_tb", null, pcftest.ReservesSummaryDV.ReserveSetDocumentsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/ReservesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableReservesLV_tb extends PCFElement {
    public EditableReservesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getfilterText() {
      return getOrCreateProperty("filterText", "filterText", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/ReservesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReserveSetDocumentsLV_tb extends PCFElement {
    public ReserveSetDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}