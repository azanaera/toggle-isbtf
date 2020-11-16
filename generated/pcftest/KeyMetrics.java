package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.KeyMetrics.Add;
import pcftest.KeyMetrics.Cancel;
import pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator;
import pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator._ListPaging;
import pcftest.KeyMetrics.ClaimMetricsCardTab;
import pcftest.KeyMetrics.Edit;
import pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator;
import pcftest.KeyMetrics.ExposureMetricsCardTab;
import pcftest.KeyMetrics.KeyMetrics_UpLink;
import pcftest.KeyMetrics.LargeLossThresholdCardTab;
import pcftest.KeyMetrics.Remove;
import pcftest.KeyMetrics.Update;
import pcftest.KeyMetrics._Paging;
import pcftest.KeyMetrics.__crumb__;
import pcftest.KeyMetrics._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class KeyMetrics extends PCFLocation {
  public final static String CHECKSUM = "4a2444e9a4ef7a727b6820b892b4b136";
  
  public KeyMetrics(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("KeyMetrics"));
  }
  
  public Add getAdd() {
    return getOrCreateProperty("Add", "Add", null, pcftest.KeyMetrics.Add.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.KeyMetrics.Cancel.class);
  }
  
  public ClaimMetricLimitCategoryIterator getClaimMetricLimitCategoryIterator() {
    return getOrCreateProperty("ClaimMetricLimitCategoryIterator", "ClaimMetricLimitCategoryIterator", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.class);
  }
  
  public ClaimMetricsCardTab getClaimMetricsCardTab() {
    return getOrCreateProperty("ClaimMetricsCardTab", "ClaimMetricsCardTab", null, pcftest.KeyMetrics.ClaimMetricsCardTab.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.KeyMetrics.Edit.class);
  }
  
  public ValueElement getExposureLabelHeader() {
    return getOrCreateProperty("ExposureLabelHeader", "ExposureLabelHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ExposureMetricDefaultLimitIterator getExposureMetricDefaultLimitIterator() {
    return getOrCreateProperty("ExposureMetricDefaultLimitIterator", "ExposureMetricDefaultLimitIterator", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.class);
  }
  
  public ValueElement getExposureMetricLimitsHeader() {
    return getOrCreateProperty("ExposureMetricLimitsHeader", "ExposureMetricLimitsHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ExposureMetricsCardTab getExposureMetricsCardTab() {
    return getOrCreateProperty("ExposureMetricsCardTab", "ExposureMetricsCardTab", null, pcftest.KeyMetrics.ExposureMetricsCardTab.class);
  }
  
  public BooleanValueElement getExposureRedValueHeader() {
    return getOrCreateProperty("ExposureRedValueHeader", "ExposureRedValueHeader", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getExposureTargetValueHeader() {
    return getOrCreateProperty("ExposureTargetValueHeader", "ExposureTargetValueHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExposureUnitsHeader() {
    return getOrCreateProperty("ExposureUnitsHeader", "ExposureUnitsHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getExposureYellowValueHeader() {
    return getOrCreateProperty("ExposureYellowValueHeader", "ExposureYellowValueHeader", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public KeyMetrics_UpLink getKeyMetrics_UpLink() {
    return getOrCreateProperty("KeyMetrics_UpLink", "KeyMetrics_UpLink", null, pcftest.KeyMetrics.KeyMetrics_UpLink.class);
  }
  
  public ValueElement getLabelHeader() {
    return getOrCreateProperty("LabelHeader", "LabelHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LargeLossThresholdCardTab getLargeLossThresholdCardTab() {
    return getOrCreateProperty("LargeLossThresholdCardTab", "LargeLossThresholdCardTab", null, pcftest.KeyMetrics.LargeLossThresholdCardTab.class);
  }
  
  public LargeLossThresholdInputSet getLargeLossThresholdInputSet() {
    return getOrCreateProperty("LargeLossThresholdInputSet", "LargeLossThresholdInputSet", null, pcftest.LargeLossThresholdInputSet.class);
  }
  
  public SelectElement getPolicyType() {
    return getOrCreateProperty("PolicyType", "PolicyType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public BooleanValueElement getRedValueHeader() {
    return getOrCreateProperty("RedValueHeader", "RedValueHeader", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Remove getRemove() {
    return getOrCreateProperty("Remove", "Remove", null, pcftest.KeyMetrics.Remove.class);
  }
  
  public ValueElement getTargetValueHeader() {
    return getOrCreateProperty("TargetValueHeader", "TargetValueHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getUnitsHeader() {
    return getOrCreateProperty("UnitsHeader", "UnitsHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.KeyMetrics.Update.class);
  }
  
  public BooleanValueElement getYellowValueHeader() {
    return getOrCreateProperty("YellowValueHeader", "YellowValueHeader", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.KeyMetrics._Paging.class);
  }
  
  public pcftest.KeyMetrics._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.KeyMetrics._Select.class);
  }
  
  public pcftest.KeyMetrics._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.KeyMetrics._ViewDetail.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.KeyMetrics.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.KeyMetrics._msgs.class);
  }
  
  public BusinessSettings get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessSettings.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add extends ClickableActionElement {
    public Add(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMetricLimitCategoryIterator extends PCFElement {
    public ClaimMetricLimitCategoryIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getClaimMetricLimitCategoryHeader() {
        return getOrCreateProperty("ClaimMetricLimitCategoryHeader", "ClaimMetricLimitCategoryHeader", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry._Select.class);
      }
      
      public pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends RowElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDecimalRedValue() {
          return getOrCreateProperty("DecimalRedValue", "DecimalRedValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getDecimalTargetValue() {
          return getOrCreateProperty("DecimalTargetValue", "DecimalTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getDecimalYellowValue() {
          return getOrCreateProperty("DecimalYellowValue", "DecimalYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getIntegerRedValue() {
          return getOrCreateProperty("IntegerRedValue", "IntegerRedValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getIntegerTargetValue() {
          return getOrCreateProperty("IntegerTargetValue", "IntegerTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getIntegerYellowValue() {
          return getOrCreateProperty("IntegerYellowValue", "IntegerYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.Label getLabel() {
          return getOrCreateProperty("Label", "Label", null, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.Label.class);
        }
        
        public ValueElement getMoneyRedValue() {
          return getOrCreateProperty("MoneyRedValue", "MoneyRedValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getMoneyTargetValue() {
          return getOrCreateProperty("MoneyTargetValue", "MoneyTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getMoneyYellowValue() {
          return getOrCreateProperty("MoneyYellowValue", "MoneyYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentReadonlyRedValue() {
          return getOrCreateProperty("PercentReadonlyRedValue", "PercentReadonlyRedValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentReadonlyTargetValue() {
          return getOrCreateProperty("PercentReadonlyTargetValue", "PercentReadonlyTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentReadonlyYellowValue() {
          return getOrCreateProperty("PercentReadonlyYellowValue", "PercentReadonlyYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentRedValue() {
          return getOrCreateProperty("PercentRedValue", "PercentRedValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentTargetValue() {
          return getOrCreateProperty("PercentTargetValue", "PercentTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentYellowValue() {
          return getOrCreateProperty("PercentYellowValue", "PercentYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getUnit() {
          return getOrCreateProperty("Unit", "Unit", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.entry3> get_Entries() {
          return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.entry3.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        public pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2._Select.class);
        }
        
        public pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Label extends ValueElement {
          public Label(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          @SuppressWarnings(value = "unchecked")
          public IteratorEntries<pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.Label.entry3> get_Entries() {
            return getOrCreateEntries(null, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.Label.entry3.class, gw.smoketest.platform.web.IteratorEntries.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class entry3 extends PCFElement {
            public entry3(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.Label.entry3.CreateLimitForTier getCreateLimitForTier() {
              return getOrCreateProperty("CreateLimitForTier", "CreateLimitForTier", null, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.Label.entry3.CreateLimitForTier.class);
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class CreateLimitForTier extends ClickableActionElement {
              public CreateLimitForTier(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public PCFLocation click() {
                return clickThis(gw.smoketest.platform.web.PCFLocation.class);
              }
              
              
            }
            
            
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry3 extends RowElement {
          public entry3(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ValueElement getDecimalRedValue() {
            return getOrCreateProperty("DecimalRedValue", "DecimalRedValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getDecimalTargetValue() {
            return getOrCreateProperty("DecimalTargetValue", "DecimalTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getDecimalYellowValue() {
            return getOrCreateProperty("DecimalYellowValue", "DecimalYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getIntegerRedValue() {
            return getOrCreateProperty("IntegerRedValue", "IntegerRedValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getIntegerTargetValue() {
            return getOrCreateProperty("IntegerTargetValue", "IntegerTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getIntegerYellowValue() {
            return getOrCreateProperty("IntegerYellowValue", "IntegerYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getMoneyRedValue() {
            return getOrCreateProperty("MoneyRedValue", "MoneyRedValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getMoneyTargetValue() {
            return getOrCreateProperty("MoneyTargetValue", "MoneyTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getMoneyYellowValue() {
            return getOrCreateProperty("MoneyYellowValue", "MoneyYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getPercentReadonlyRedValue() {
            return getOrCreateProperty("PercentReadonlyRedValue", "PercentReadonlyRedValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getPercentReadonlyTargetValue() {
            return getOrCreateProperty("PercentReadonlyTargetValue", "PercentReadonlyTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getPercentReadonlyYellowValue() {
            return getOrCreateProperty("PercentReadonlyYellowValue", "PercentReadonlyYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getPercentRedValue() {
            return getOrCreateProperty("PercentRedValue", "PercentRedValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getPercentTargetValue() {
            return getOrCreateProperty("PercentTargetValue", "PercentTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getPercentYellowValue() {
            return getOrCreateProperty("PercentYellowValue", "PercentYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getTier() {
            return getOrCreateProperty("Tier", "Tier", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getUnit() {
            return getOrCreateProperty("Unit", "Unit", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public IteratorEntryCheckboxElement get_Checkbox() {
            return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
          }
          
          public pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.entry3._Select get_Select() {
            return getOrCreateProperty("_Select", "_Select", null, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.entry3._Select.class);
          }
          
          public pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.entry3._ViewDetail get_ViewDetail() {
            return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.KeyMetrics.ClaimMetricLimitCategoryIterator.entry.entry2.entry3._ViewDetail.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _Select extends SelectorCellElement {
            public _Select(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _ViewDetail extends BooleanValueElement {
            public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMetricsCardTab extends ClickableActionElement {
    public ClaimMetricsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureMetricDefaultLimitIterator extends PCFElement {
    public ExposureMetricDefaultLimitIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getDecimalRedValue() {
        return getOrCreateProperty("DecimalRedValue", "DecimalRedValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDecimalTargetValue() {
        return getOrCreateProperty("DecimalTargetValue", "DecimalTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDecimalYellowValue() {
        return getOrCreateProperty("DecimalYellowValue", "DecimalYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getIntegerRedValue() {
        return getOrCreateProperty("IntegerRedValue", "IntegerRedValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getIntegerTargetValue() {
        return getOrCreateProperty("IntegerTargetValue", "IntegerTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getIntegerYellowValue() {
        return getOrCreateProperty("IntegerYellowValue", "IntegerYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.Label getLabel() {
        return getOrCreateProperty("Label", "Label", null, pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.Label.class);
      }
      
      public ValueElement getMoneyRedValue() {
        return getOrCreateProperty("MoneyRedValue", "MoneyRedValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getMoneyTargetValue() {
        return getOrCreateProperty("MoneyTargetValue", "MoneyTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getMoneyYellowValue() {
        return getOrCreateProperty("MoneyYellowValue", "MoneyYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPercentReadonlyRedValue() {
        return getOrCreateProperty("PercentReadonlyRedValue", "PercentReadonlyRedValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPercentReadonlyTargetValue() {
        return getOrCreateProperty("PercentReadonlyTargetValue", "PercentReadonlyTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPercentReadonlyYellowValue() {
        return getOrCreateProperty("PercentReadonlyYellowValue", "PercentReadonlyYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPercentRedValue() {
        return getOrCreateProperty("PercentRedValue", "PercentRedValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPercentTargetValue() {
        return getOrCreateProperty("PercentTargetValue", "PercentTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPercentYellowValue() {
        return getOrCreateProperty("PercentYellowValue", "PercentYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getUnit() {
        return getOrCreateProperty("Unit", "Unit", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.entry2> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry._Select.class);
      }
      
      public pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Label extends ValueElement {
        public Label(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.Label.entry2> get_Entries() {
          return getOrCreateEntries(null, pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.Label.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry2 extends PCFElement {
          public entry2(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.Label.entry2.CreateLimitForTier getCreateLimitForTier() {
            return getOrCreateProperty("CreateLimitForTier", "CreateLimitForTier", null, pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.Label.entry2.CreateLimitForTier.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class CreateLimitForTier extends ClickableActionElement {
            public CreateLimitForTier(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends RowElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDecimalRedValue() {
          return getOrCreateProperty("DecimalRedValue", "DecimalRedValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getDecimalTargetValue() {
          return getOrCreateProperty("DecimalTargetValue", "DecimalTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getDecimalYellowValue() {
          return getOrCreateProperty("DecimalYellowValue", "DecimalYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getIntegerRedValue() {
          return getOrCreateProperty("IntegerRedValue", "IntegerRedValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getIntegerTargetValue() {
          return getOrCreateProperty("IntegerTargetValue", "IntegerTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getIntegerYellowValue() {
          return getOrCreateProperty("IntegerYellowValue", "IntegerYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getMoneyRedValue() {
          return getOrCreateProperty("MoneyRedValue", "MoneyRedValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getMoneyTargetValue() {
          return getOrCreateProperty("MoneyTargetValue", "MoneyTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getMoneyYellowValue() {
          return getOrCreateProperty("MoneyYellowValue", "MoneyYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentReadonlyRedValue() {
          return getOrCreateProperty("PercentReadonlyRedValue", "PercentReadonlyRedValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentReadonlyTargetValue() {
          return getOrCreateProperty("PercentReadonlyTargetValue", "PercentReadonlyTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentReadonlyYellowValue() {
          return getOrCreateProperty("PercentReadonlyYellowValue", "PercentReadonlyYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentRedValue() {
          return getOrCreateProperty("PercentRedValue", "PercentRedValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentTargetValue() {
          return getOrCreateProperty("PercentTargetValue", "PercentTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPercentYellowValue() {
          return getOrCreateProperty("PercentYellowValue", "PercentYellowValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getTier() {
          return getOrCreateProperty("Tier", "Tier", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getUnit() {
          return getOrCreateProperty("Unit", "Unit", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.entry2._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.entry2._Select.class);
        }
        
        public pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.entry2._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.KeyMetrics.ExposureMetricDefaultLimitIterator.entry.entry2._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureMetricsCardTab extends ClickableActionElement {
    public ExposureMetricsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class KeyMetrics_UpLink extends ClickableActionElement {
    public KeyMetrics_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LargeLossThresholdCardTab extends ClickableActionElement {
    public LargeLossThresholdCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Remove extends ClickableActionElement {
    public Remove(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/keymetrics/KeyMetrics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}