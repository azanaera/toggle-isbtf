package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ArgumentRowSet_Date._Select;
import pcftest.ArgumentRowSet_Date._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/ArgumentRowSet.Date.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArgumentRowSet_Date extends ArgumentRowSet {
  public final static String CHECKSUM = "21ceb4e9e3222204581d7a445425c865";
  
  public ArgumentRowSet_Date(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getArgName() {
    return getOrCreateProperty("ArgName", "ArgName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getArgValue() {
    return getOrCreateProperty("ArgValue", "ArgValue", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  public _Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.ArgumentRowSet_Date._Select.class);
  }
  
  public _ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ArgumentRowSet_Date._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ArgumentRowSet.Date.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ArgumentRowSet.Date.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}