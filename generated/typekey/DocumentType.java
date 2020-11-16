package typekey;

@javax.annotation.processing.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DocumentType.tti;DocumentType.tix;DocumentType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class DocumentType implements gw.entity.TypeKey {
  /**
   * Agreements/Releases
   * Agreements/Releases
   */
  public static final typekey.DocumentType TC_AGREEMENTS_RELEASES_EXT = new typekey.DocumentType("agreements_releases_ext");
  
  /**
   * Authorization/Application
   * Authorization/Application
   */
  public static final typekey.DocumentType TC_AUTHORIZATION_APPLICATION_EXT = new typekey.DocumentType("authorization_application_ext");
  
  /**
   * Correspondence
   * Correspondence
   */
  public static final typekey.DocumentType TC_CORRESPONDENCE_EXT = new typekey.DocumentType("correspondence_ext");
  
  /**
   * Demand
   * Demand
   */
  public static final typekey.DocumentType TC_DEMAND_EXT = new typekey.DocumentType("demand_ext");
  
  /**
   * Diagram
   * Diagram
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_DIAGRAM = new typekey.DocumentType("diagram");
  
  /**
   * Email
   * Email
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_EMAIL = new typekey.DocumentType("email");
  
  /**
   * Email Sent
   * Email Sent by CreateEmail
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_EMAIL_SENT = new typekey.DocumentType("email_sent");
  
  /**
   * Estimate/Invoice
   * Estimate/Invoice
   */
  public static final typekey.DocumentType TC_ESTIMATE_INVOICE_EXT = new typekey.DocumentType("estimate_invoice_ext");
  
  /**
   * First notice of loss
   * First notice of loss (original report)
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_FNOL = new typekey.DocumentType("fnol");
  
  /**
   * Glass/Tow
   * Glass/Tow
   */
  public static final typekey.DocumentType TC_GLASS_TOW_EXT = new typekey.DocumentType("glass_tow_ext");
  
  /**
   * ISO match report
   * ISO match report
   */
  public static final typekey.DocumentType TC_ISO = new typekey.DocumentType("iso");
  
  /**
   * Law Enforcement Document
   * Law Enforcement Document
   */
  public static final typekey.DocumentType TC_LAW_ENFORCEMENT_DOCS_EXT = new typekey.DocumentType("law_enforcement_docs_ext");
  
  /**
   * Legal
   * Legal
   */
  public static final typekey.DocumentType TC_LEGAL_EXT = new typekey.DocumentType("legal_ext");
  
  /**
   * Letter received
   * Letter received
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_LETTER_RECEIVED = new typekey.DocumentType("letter_received");
  
  /**
   * Letter sent
   * Letter sent
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_LETTER_SENT = new typekey.DocumentType("letter_sent");
  
  /**
   * Total loss/Salvage
   * Total loss/Salvage
   */
  public static final typekey.DocumentType TC_LOSS_SALVAGE_EXT = new typekey.DocumentType("loss_salvage_ext");
  
  /**
   * Medical
   * Medical
   */
  public static final typekey.DocumentType TC_MEDICAL_EXT = new typekey.DocumentType("medical_ext");
  
  /**
   * Metro report
   * Metro report
   */
  public static final typekey.DocumentType TC_METRO = new typekey.DocumentType("metro");
  
  /**
   * Other
   * Other
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_OTHER = new typekey.DocumentType("other");
  
  /**
   * Photographs
   * Photographs
   */
  public static final typekey.DocumentType TC_PHOTOGRAPHS_EXT = new typekey.DocumentType("photographs_ext");
  
  /**
   * Police report
   * Police report
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_POLICEREPORT = new typekey.DocumentType("policereport");
  
  /**
   * Policy
   * Policy
   */
  public static final typekey.DocumentType TC_POLICY_EXT = new typekey.DocumentType("policy_ext");
  
  /**
   * Receipt
   * Receipt
   */
  public static final typekey.DocumentType TC_RECEIPT_EXT = new typekey.DocumentType("receipt_ext");
  
  /**
   * Repair estimate
   * Repair estimate
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_REPAIRESTIMATE = new typekey.DocumentType("repairestimate");
  
  /**
   * Service Level Agreement
   * Service Level Agreement
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_SLA = new typekey.DocumentType("sla");
  
  /**
   * Statement
   * Statement
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_STATEMENT = new typekey.DocumentType("statement");
  
  /**
   * Statement
   * Statement
   */
  public static final typekey.DocumentType TC_STATEMENT_EXT = new typekey.DocumentType("statement_ext");
  
  /**
   * Subrogation
   * Subrogation
   */
  public static final typekey.DocumentType TC_SUBROGATION_EXT = new typekey.DocumentType("subrogation_ext");
  
  /**
   * General Supporting Documents
   * General Supporting Documents
   */
  public static final typekey.DocumentType TC_SUPPORTING_DOCS_EXT = new typekey.DocumentType("supporting_docs_ext");
  
  /**
   * Text Message
   * Text Message
   */
  public static final typekey.DocumentType TC_TEXT_MESSAGE_EXT = new typekey.DocumentType("text_message_ext");
  
  /**
   * W-9
   * W-9
   */
  @java.lang.Deprecated
  public static final typekey.DocumentType TC_W9 = new typekey.DocumentType("w9");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.DocumentType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.DocumentType>("DocumentType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private DocumentType(java.lang.String code)  {
    _typeKeyImplManager  =  com.guidewire.commons.typelist.TypeKeyImplManager.newInstance(this, code);
  }
  
  public int compareTo(gw.entity.TypeKey arg0) {
    return _typeKeyImplManager.getTypeKeyImpl().compareTo(arg0);
  }
  
  /**
   * 
   * @deprecated Use this object instead.
   */
  @java.lang.Deprecated
  public typekey.DocumentType get() {
    return this;
  }
  
  public static typekey.DocumentType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.DocumentType> getAllTypeKeys() {
    return TYPE.get().getTypeKeys(true);
  }
  
  /**
   * Returns the list of categories that this key belongs to
   * @return the categories that this key belongs to
   */
  public gw.entity.TypeKey[] getCategories() {
    return _typeKeyImplManager.getTypeKeyImpl().getCategories();
  }
  
  public java.lang.String getCode() {
    return _typeKeyImplManager.getCode();
  }
  
  /**
   * Returns the description for this typekey for the current locale.
   * @return the description for this typekey
   */
  public java.lang.String getDescription() {
    return _typeKeyImplManager.getTypeKeyImpl().getDescription();
  }
  
  /**
   * Returns the description of this typekey for the given locale.
   * @param locale the locale to use to get the description
   * @return a description for this typekey for the given locale
   */
  public java.lang.String getDescription(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getDescription(locale);
  }
  
  public java.lang.String getDisplayName() {
    return _typeKeyImplManager.getTypeKeyImpl().getDisplayName();
  }
  
  /**
   * Returns the name of this typekey for the given locale.
   * @param locale 
   */
  public java.lang.String getDisplayName(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getDisplayName(locale);
  }
  
  /**
   * Gets the entity type associated with this typekey, if any. Returns null if this is not a subtype typekey.
   */
  public gw.entity.IEntityType getEntityType() {
    return _typeKeyImplManager.getTypeKeyImpl().getEntityType();
  }
  
  /**
   * Returns the owning type for this key.
   * @return 
   */
  public gw.entity.ITypeList getIntrinsicType() {
    return _typeKeyImplManager.getTypeKeyImpl().getIntrinsicType();
  }
  
  /**
   * A string containing the typelist name.
   */
  public java.lang.String getListName() {
    return _typeKeyImplManager.getTypeKeyImpl().getListName();
  }
  
  /**
   * Returns the value of the "name" attribute for this typekey.
   * @return the name of this typekey
   * @deprecated Use {@link #getDisplayName()} or {@link #getUnlocalizedName()} instead, as appropriate.
   */
  @java.lang.Deprecated
  public java.lang.String getName() {
    return _typeKeyImplManager.getTypeKeyImpl().getName();
  }
  
  public int getOrdinal() {
    return _typeKeyImplManager.getTypeKeyImpl().getOrdinal();
  }
  
  /**
   * Returns the priority for this type key
   * @return the priority for this type key
   */
  public int getPriority() {
    return _typeKeyImplManager.getTypeKeyImpl().getPriority();
  }
  
  /**
   * Returns the sort order for this type key in the specified language.
   * @param locale 
   * @return the sort order for this type key
   */
  public int getSortOrder(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getSortOrder(locale);
  }
  
  public static typekey.DocumentType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.DocumentType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.DocumentType[]{});
  }
  
  public static java.util.List<typekey.DocumentType> getTypeKeys(boolean includeRetired) {
    return TYPE.get().getTypeKeys(includeRetired);
  }
  
  /**
   * Returns the (non-localized) description of this typekey. Generally should not be used by application code. To get a
   * displayable string, use {@link #getDescription()} instead.
   * @return the non-localized description of this typekey
   */
  public java.lang.String getUnlocalizedDescription() {
    return _typeKeyImplManager.getTypeKeyImpl().getUnlocalizedDescription();
  }
  
  /**
   * Returns the (non-localized) name of this typekey. Generally should not be used by application code. To get a
   * displayable string, use {@link #getDisplayName()} instead. To get a unique string identifier for this typekey,
   * use {@link #getCode()} instead.
   * @return the non-localized name of this typekey
   */
  public java.lang.String getUnlocalizedName() {
    return _typeKeyImplManager.getTypeKeyImpl().getUnlocalizedName();
  }
  
  public typekey.DocumentType getValue() {
    return this;
  }
  
  /**
   * Checks to see if this typekey has a category corresponding to the given
   * typekey.  For a match to be found, this typekey has to have a category
   * with the same typelist and code as the given typekey.
   * @param categoryToCheck 
   * @return 
   */
  public boolean hasCategory(gw.entity.TypeKey categoryToCheck) {
    return _typeKeyImplManager.getTypeKeyImpl().hasCategory(categoryToCheck);
  }
  
  /**
   * A boolean that indicates a type code is for internal use by Guidewire software. Internal type codes cannot be
   * removed or modified.
   */
  public boolean isInternal() {
    return _typeKeyImplManager.getTypeKeyImpl().isInternal();
  }
  
  /**
   * Returns true if this type key is retired.  Retired type keys will not show up in the UI.
   * @return true if this type key is retired false if not.
   */
  public boolean isRetired() {
    return _typeKeyImplManager.getTypeKeyImpl().isRetired();
  }
  
  private java.lang.Object readObject(java.io.ObjectInputStream in) throws java.io.InvalidObjectException {
    throw new java.io.InvalidObjectException("Proxy required");
  }
  
  public java.lang.String toString() {
    return getDisplayName();
  }
  
  private java.lang.Object writeReplace() {
    return new com.guidewire.commons.typelist.TypeKeySerializationProxy(this);
  }
  
  static {
    com.guidewire._generated.typekey.DocumentTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.DocumentType>() {
      public void clearCache(typekey.DocumentType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.DocumentType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.DocumentType newInstance(java.lang.String code) {
        return new typekey.DocumentType(code);
      }
      
      
    });
  }
}