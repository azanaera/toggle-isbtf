package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/policy/StatCodeFilterDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StatCodeFilterDV extends DetailViewElement {
  public final static String CHECKSUM = "c9e7eae46ff1592eda311a17612722ab";
  
  public StatCodeFilterDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getBuildingNumber() {
    return getOrCreateProperty("BuildingNumber", "BuildingNumber", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getClassCode() {
    return getOrCreateProperty("ClassCode", "ClassCode", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getInsuranceLine() {
    return getOrCreateProperty("InsuranceLine", "InsuranceLine", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getInsuranceSubLine() {
    return getOrCreateProperty("InsuranceSubLine", "InsuranceSubLine", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getLineNumber() {
    return getOrCreateProperty("LineNumber", "LineNumber", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getLocationNumber() {
    return getOrCreateProperty("LocationNumber", "LocationNumber", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SearchOnlyInputSet getSearchOnlyInputSet() {
    return getOrCreateProperty("SearchOnlyInputSet", "SearchOnlyInputSet", null, pcftest.SearchOnlyInputSet.class);
  }
  
  public SelectElement getVehicleNumber() {
    return getOrCreateProperty("VehicleNumber", "VehicleNumber", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}