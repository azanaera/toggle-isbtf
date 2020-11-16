package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSearchAndResetInputSet.Reset;
import pcftest.ClaimSearchAndResetInputSet.Search;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/ClaimSearchAndResetInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchAndResetInputSet extends PCFElement {
  public final static String CHECKSUM = "50e9887c1dca2db17ff67e699ee7c7d2";
  
  public ClaimSearchAndResetInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Reset getReset() {
    return getOrCreateProperty("Reset", "Reset", null, pcftest.ClaimSearchAndResetInputSet.Reset.class);
  }
  
  public Search getSearch() {
    return getOrCreateProperty("Search", "Search", null, pcftest.ClaimSearchAndResetInputSet.Search.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchAndResetInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Reset extends ClickableActionElement {
    public Reset(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchAndResetInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Search extends ClickableActionElement {
    public Search(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}