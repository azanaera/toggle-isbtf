package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SimpleClaimSearchDV.SearchFor;
import typekey.ClaimSearchNameSearchType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SimpleClaimSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "7e3d7c3adf9a073c82781d3518de360a";
  
  public SimpleClaimSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaimNumber() {
    return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimSearchAndResetInputSet getClaimSearchAndResetInputSet() {
    return getOrCreateProperty("ClaimSearchAndResetInputSet", "ClaimSearchAndResetInputSet", null, pcftest.ClaimSearchAndResetInputSet.class);
  }
  
  public GlobalContactNameInputSet_Japan getGlobalContactNameInputSet_Japan() {
    return getOrCreateProperty("GlobalContactNameInputSet_Japan", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_Japan.class);
  }
  
  public GlobalContactNameInputSet_default getGlobalContactNameInputSet_default() {
    return getOrCreateProperty("GlobalContactNameInputSet_default", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_default.class);
  }
  
  public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
    return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
  }
  
  public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
    return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
  }
  
  public ValueElement getPolicyNumber() {
    return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SearchFor getSearchFor() {
    return getOrCreateProperty("SearchFor", "SearchFor", null, pcftest.SimpleClaimSearchDV.SearchFor.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchFor extends SelectElement {
    public SearchFor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimSearchNameSearchType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimSearchNameSearchType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimSearchNameSearchType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimSearchNameSearchType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}