package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SearchLinksInputSet.Reset;
import pcftest.SearchLinksInputSet.Search;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/search/SearchLinksInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SearchLinksInputSet extends PCFElement {
  public final static String CHECKSUM = "4338e2b6d84a4ca89f6a540e8e1c606a";
  
  public SearchLinksInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Reset getReset() {
    return getOrCreateProperty("Reset", "Reset", null, pcftest.SearchLinksInputSet.Reset.class);
  }
  
  public Search getSearch() {
    return getOrCreateProperty("Search", "Search", null, pcftest.SearchLinksInputSet.Search.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/search/SearchLinksInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Reset extends ClickableActionElement {
    public Reset(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/search/SearchLinksInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Search extends ClickableActionElement {
    public Search(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}