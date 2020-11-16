package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/search/SearchOnlyInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SearchOnlyInputSet extends PCFElement {
  public final static String CHECKSUM = "0e2f8d7a7f36072d07fdf0c5c0dc16ea";
  
  public SearchOnlyInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SearchLinksInputSet getSearchLinksInputSet() {
    return getOrCreateProperty("SearchLinksInputSet", "SearchLinksInputSet", null, pcftest.SearchLinksInputSet.class);
  }
  
  
}