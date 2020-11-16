package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "1adf802629471a518b95ddb18b7c449c";
  
  public BulkInvoiceSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BulkInvoiceSearchOptionalInputSet getBulkInvoiceSearchOptionalInputSet() {
    return getOrCreateProperty("BulkInvoiceSearchOptionalInputSet", "BulkInvoiceSearchOptionalInputSet", null, pcftest.BulkInvoiceSearchOptionalInputSet.class);
  }
  
  public BulkInvoiceSearchRequiredInputSet getBulkInvoiceSearchRequiredInputSet() {
    return getOrCreateProperty("BulkInvoiceSearchRequiredInputSet", "BulkInvoiceSearchRequiredInputSet", null, pcftest.BulkInvoiceSearchRequiredInputSet.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  
}