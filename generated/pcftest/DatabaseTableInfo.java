package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.DatabaseInfoLinksDV;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.DatabaseInfoLinksDV.DownloadParms;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.NotVerifiedDV;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.SchemaVerifyDV;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.SchemaVerifyDV.DownloadSchemaVerifierParms;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.SchemaVerifyDV.DownloadSchemaVerifierVerify;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV._ListPaging;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV.entry;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV.entry._Select;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV.entry._ViewDetail;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV.errorHeader;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV_tb;
import pcftest.DatabaseTableInfo.DatabaseInfoScreen._msgs;
import pcftest.DatabaseTableInfo.DatabaseTableInfo_UpLink;
import pcftest.DatabaseTableInfo._Paging;
import pcftest.DatabaseTableInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DatabaseTableInfo extends PCFLocation {
  public final static String CHECKSUM = "50abb9f569adc9848f1c5946d5b23132";
  
  public DatabaseTableInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DatabaseTableInfo"));
  }
  
  public DatabaseInfoScreen getDatabaseInfoScreen() {
    return getOrCreateProperty("DatabaseInfoScreen", "DatabaseInfoScreen", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.class);
  }
  
  public DatabaseTableInfo_UpLink getDatabaseTableInfo_UpLink() {
    return getOrCreateProperty("DatabaseTableInfo_UpLink", "DatabaseTableInfo_UpLink", null, pcftest.DatabaseTableInfo.DatabaseTableInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DatabaseTableInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DatabaseTableInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseInfoScreen extends PCFElement {
    public DatabaseInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DatabaseInfoLinksDV getDatabaseInfoLinksDV() {
      return getOrCreateProperty("DatabaseInfoLinksDV", "DatabaseInfoLinksDV", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.DatabaseInfoLinksDV.class);
    }
    
    public NotVerifiedDV getNotVerifiedDV() {
      return getOrCreateProperty("NotVerifiedDV", "NotVerifiedDV", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.NotVerifiedDV.class);
    }
    
    public SchemaVerifyDV getSchemaVerifyDV() {
      return getOrCreateProperty("SchemaVerifyDV", "SchemaVerifyDV", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.SchemaVerifyDV.class);
    }
    
    public VerifyErrorsLV getVerifyErrorsLV() {
      return getOrCreateProperty("VerifyErrorsLV", "VerifyErrorsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV.class);
    }
    
    public VerifyErrorsLV_tb getVerifyErrorsLV_tb() {
      return getOrCreateProperty("VerifyErrorsLV_tb", "VerifyErrorsLV_tb", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DatabaseInfoLinksDV extends DetailViewElement {
      public DatabaseInfoLinksDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DownloadParms getDownloadParms() {
        return getOrCreateProperty("DownloadParms", "DownloadParms", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.DatabaseInfoLinksDV.DownloadParms.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DownloadParms extends ValueElement {
        public DownloadParms(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotVerifiedDV extends DetailViewElement {
      public NotVerifiedDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getverified() {
        return getOrCreateProperty("verified", "verified", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SchemaVerifyDV extends DetailViewElement {
      public SchemaVerifyDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DownloadSchemaVerifierParms getDownloadSchemaVerifierParms() {
        return getOrCreateProperty("DownloadSchemaVerifierParms", "DownloadSchemaVerifierParms", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.SchemaVerifyDV.DownloadSchemaVerifierParms.class);
      }
      
      public DownloadSchemaVerifierVerify getDownloadSchemaVerifierVerify() {
        return getOrCreateProperty("DownloadSchemaVerifierVerify", "DownloadSchemaVerifierVerify", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.SchemaVerifyDV.DownloadSchemaVerifierVerify.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DownloadSchemaVerifierParms extends ValueElement {
        public DownloadSchemaVerifierParms(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DownloadSchemaVerifierVerify extends ValueElement {
        public DownloadSchemaVerifierVerify(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VerifyErrorsLV extends PCFElement {
      public VerifyErrorsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV._ListPaging.class);
      }
      
      public errorHeader geterrorHeader() {
        return getOrCreateProperty("errorHeader", "errorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV.errorHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DatabaseTableInfo.DatabaseInfoScreen.VerifyErrorsLV.entry._ViewDetail.class);
        }
        
        public ValueElement geterror() {
          return getOrCreateProperty("error", "error", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class errorHeader extends ValueElement {
        public errorHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VerifyErrorsLV_tb extends PCFElement {
      public VerifyErrorsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseTableInfo_UpLink extends ClickableActionElement {
    public DatabaseTableInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}