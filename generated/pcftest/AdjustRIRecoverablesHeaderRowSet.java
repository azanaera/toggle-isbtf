package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdjustRIRecoverablesHeaderRowSet._Select;
import pcftest.AdjustRIRecoverablesHeaderRowSet._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesHeaderRowSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdjustRIRecoverablesHeaderRowSet extends PCFElement {
  public final static String CHECKSUM = "38c3e38eb0f46c7181c56a8e6be6485e";
  
  public AdjustRIRecoverablesHeaderRowSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAdjustmentChangeLabel() {
    return getOrCreateProperty("AdjustmentChangeLabel", "AdjustmentChangeLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCalculatedChangeLabel() {
    return getOrCreateProperty("CalculatedChangeLabel", "CalculatedChangeLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCurrentAdjustmentsLabel() {
    return getOrCreateProperty("CurrentAdjustmentsLabel", "CurrentAdjustmentsLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCurrentCalculatedAmountLabel() {
    return getOrCreateProperty("CurrentCalculatedAmountLabel", "CurrentCalculatedAmountLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getHeaderLabel() {
    return getOrCreateProperty("HeaderLabel", "HeaderLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNewAdjustmentsAmountLabel() {
    return getOrCreateProperty("NewAdjustmentsAmountLabel", "NewAdjustmentsAmountLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNewCalculatedAmountLabel() {
    return getOrCreateProperty("NewCalculatedAmountLabel", "NewCalculatedAmountLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalLabel() {
    return getOrCreateProperty("TotalLabel", "TotalLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  public _Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.AdjustRIRecoverablesHeaderRowSet._Select.class);
  }
  
  public _ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AdjustRIRecoverablesHeaderRowSet._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesHeaderRowSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesHeaderRowSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}