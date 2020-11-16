package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.ClaimSnapshotPolicyLocation800Popup.ClaimSnapshotPolicyLocation800Popup_UpLink;
import pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV;
import pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.LienholderHeader;
import pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.OwnerTypeHeader;
import pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV_tb;
import pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV;
import pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.ItemDescriptionHeader;
import pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.ItemValueHeader;
import pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV_tb;
import pcftest.ClaimSnapshotPolicyLocation800Popup._Paging;
import pcftest.ClaimSnapshotPolicyLocation800Popup.__crumb__;
import pcftest.ClaimSnapshotPolicyLocation800Popup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyLocation800Popup extends PCFLocation {
  public final static String CHECKSUM = "1ca7aee470c801251ee8508f03b5ef7c";
  
  public ClaimSnapshotPolicyLocation800Popup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotPolicyLocation800Popup"));
  }
  
  public AddressSnapshot800InputSet getAddressSnapshot800InputSet() {
    return getOrCreateProperty("AddressSnapshot800InputSet", "AddressSnapshot800InputSet", null, pcftest.AddressSnapshot800InputSet.class);
  }
  
  public ClaimSnapshotPolicyLocation800PanelSet getClaimSnapshotPolicyLocation800PanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocation800PanelSet", "ClaimSnapshotPolicyLocation800PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyLocation800PanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocation800Popup_UpLink getClaimSnapshotPolicyLocation800Popup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocation800Popup_UpLink", "ClaimSnapshotPolicyLocation800Popup_UpLink", null, pcftest.ClaimSnapshotPolicyLocation800Popup.ClaimSnapshotPolicyLocation800Popup_UpLink.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LienholdersLV getLienholdersLV() {
    return getOrCreateProperty("LienholdersLV", "LienholdersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.class);
  }
  
  public LienholdersLV_tb getLienholdersLV_tb() {
    return getOrCreateProperty("LienholdersLV_tb", "LienholdersLV_tb", null, pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV_tb.class);
  }
  
  public ListedItemsLV getListedItemsLV() {
    return getOrCreateProperty("ListedItemsLV", "ListedItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.class);
  }
  
  public ListedItemsLV_tb getListedItemsLV_tb() {
    return getOrCreateProperty("ListedItemsLV_tb", "ListedItemsLV_tb", null, pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV_tb.class);
  }
  
  public ValueElement getLocationNumber() {
    return getOrCreateProperty("LocationNumber", "LocationNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotPolicyLocation800Popup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotPolicyLocation800Popup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPolicyLocation800Popup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation800Popup_UpLink extends ClickableActionElement {
    public ClaimSnapshotPolicyLocation800Popup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LienholdersLV extends PCFElement {
    public LienholdersLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LienholderHeader getLienholderHeader() {
      return getOrCreateProperty("LienholderHeader", "LienholderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.LienholderHeader.class);
    }
    
    public OwnerTypeHeader getOwnerTypeHeader() {
      return getOrCreateProperty("OwnerTypeHeader", "OwnerTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.OwnerTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LienholderHeader extends ValueElement {
      public LienholderHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OwnerTypeHeader extends ValueElement {
      public OwnerTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getLienholder() {
        return getOrCreateProperty("Lienholder", "Lienholder", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getOwnerType() {
        return getOrCreateProperty("OwnerType", "OwnerType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation800Popup.LienholdersLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LienholdersLV_tb extends PCFElement {
    public LienholdersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListedItemsLV extends PCFElement {
    public ListedItemsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ItemDescriptionHeader getItemDescriptionHeader() {
      return getOrCreateProperty("ItemDescriptionHeader", "ItemDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.ItemDescriptionHeader.class);
    }
    
    public ItemValueHeader getItemValueHeader() {
      return getOrCreateProperty("ItemValueHeader", "ItemValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.ItemValueHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ItemDescriptionHeader extends ValueElement {
      public ItemDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ItemValueHeader extends ValueElement {
      public ItemValueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getItemDescription() {
        return getOrCreateProperty("ItemDescription", "ItemDescription", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getItemValue() {
        return getOrCreateProperty("ItemValue", "ItemValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation800Popup.ListedItemsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListedItemsLV_tb extends PCFElement {
    public ListedItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}