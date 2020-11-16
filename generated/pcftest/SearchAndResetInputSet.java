package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/search/SearchAndResetInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SearchAndResetInputSet extends PCFElement {
  public final static String CHECKSUM = "d405252c50f8a34d946c4f678fca4091";
  
  public SearchAndResetInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SearchLinksInputSet getSearchLinksInputSet() {
    return getOrCreateProperty("SearchLinksInputSet", "SearchLinksInputSet", null, pcftest.SearchLinksInputSet.class);
  }
  
  
}