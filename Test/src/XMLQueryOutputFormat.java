public enum XMLQueryOutputFormat
{
  SAW_ROWSET_DATA("SAWRowsetData"),  SAW_ROWSET_SCHEMA("SAWRowsetSchema"),  SAW_ROWSET_SCHEMA_AND_DATA("SAWRowsetSchemaAndData");
  
  private final String value;
  
  private XMLQueryOutputFormat(String v)
  {
    this.value = v;
  }
  
  public String value()
  {
    return this.value;
  }
  
  public static XMLQueryOutputFormat fromValue(String v)
  {
    for (XMLQueryOutputFormat c : XMLQueryOutputFormat.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
