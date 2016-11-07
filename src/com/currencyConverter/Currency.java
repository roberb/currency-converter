package com.currencyConverter;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Currency
{
//  US_Dollar("USD", "US Dollar"),
//  Euro("EUR", "Euro"),
//  British_Pound("GBP", "British Pound"),
//  Swiss_Franc("CHF", "Swiss Franc"),
//  Japanese_Yen("JPY", "Japanese Yen"),
//  Chinese_Yuan("CNY", "Chinese Yuan"),
//  Indian_Rupee("INR", "Indian Rupee"),
//  Australian_Dollar("AUD", "Australian Dollar"),
//  Canadian_Dollar("CAD", "Canadian Dollar"),
//  South_African_Rand("ZAR", "South African Rand"),
//  New_Zealand_Dollar("NZD", "New Zealand Dollar"),
//  UAE_Dirham("AED", "UAE Dirham"),
//  Brazilian_Real("BRL", "Brazilian Real"),
//  Chilean_Peso("CLP", "Chilean Peso"),
//  Afghanistan_Afghani("AFA", "Afghanistan Afghani"),
//  Albanian_Lek("ALL", "Albanian Lek"),
//  Neth_Antilles_Guilder("ANG", "Neth Antilles Guilder"),
//  Argentine_Peso("ARS", "Argentine Peso"),
//  Aruba_Florin("AWG", "Aruba Florin"),
//  Barbados_Dollar("BBD", "Barbados Dollar"),
//  Bangladesh_Taka("BDT", "Bangladesh Taka"),
//  Bahraini_Dinar("BHD", "Bahraini Dinar"),
//  Burundi_Franc("BIF", "Burundi Franc"),
//  Bermuda_Dollar("BMD", "Bermuda Dollar"),
//  Brunei_Dollar("BND", "Brunei Dollar"),
//  Bolivian_Boliviano("BOB", "Bolivian Boliviano"),
//  Bahamian_Dollar("BSD", "Bahamian Dollar"),
//  Bhutan_Ngultrum("BTN", "Bhutan Ngultrum"),
//  Botswana_Pula("BWP", "Botswana Pula"),
//  Belize_Dollar("BZD", "Belize Dollar"),
//  Colombian_Peso("COP", "Colombian Peso"),
//  Costa_Rica_Colon("CRC", "Costa Rica Colon"),
//  Cuban_Peso("CUP", "Cuban Peso"),
//  Cape_Verde_Escudo("CVE", "Cape Verde Escudo"),
//  Cyprus_Pound("CYP", "Cyprus Pound"),
//  Czech_Koruna("CZK", "Czech Koruna"),
//  Dijibouti_Franc("DJF", "Dijibouti Franc"),
//  Danish_Krone("DKK", "Danish Krone"),
//  Dominican_Peso("DOP", "Dominican Peso"),
//  Algerian_Dinar("DZD", "Algerian Dinar"),
//  Estonian_Kroon("EEK", "Estonian Kroon"),
//  Egyptian_Pound("EGP", "Egyptian Pound"),
//  Ethiopian_Birr("ETB", "Ethiopian Birr"),
//  Falkland_Islands_Pound("FKP", "Falkland Islands Pound"),
//  Ghanian_Cedi("GHC", "Ghanian Cedi"),
//  Gibraltar_Pound("GIP", "Gibraltar Pound"),
//  Gambian_Dalasi("GMD", "Gambian Dalasi"),
//  Guinea_Franc("GNF", "Guinea Franc"),
//  Guatemala_Quetzal("GTQ", "Guatemala Quetzal"),
//  Guyana_Dollar("GYD", "Guyana Dollar"),
//  Hong_Kong_Dollar("HKD", "Hong Kong Dollar"),
//  Honduras_Lempira("HNL", "Honduras Lempira"),
//  Croatian_Kuna("HRK", "Croatian Kuna"),
//  Haiti_Gourde("HTG", "Haiti Gourde"),
//  Hungarian_Forint("HUF", "Hungarian Forint"),
//  Indonesian_Rupiah("IDR", "Indonesian Rupiah"),
//  Israeli_Shekel("ILS", "Israeli Shekel"),
//  Iraqi_Dinar("IQD", "Iraqi Dinar"),
//  Iceland_Krona("ISK", "Iceland Krona"),
//  Jamaican_Dollar("JMD", "Jamaican Dollar"),
//  Jordanian_Dinar("JOD", "Jordanian Dinar"),
//  Kenyan_Shilling("KES", "Kenyan Shilling"),
//  Cambodia_Riel("KHR", "Cambodia Riel"),
//  Comoros_Franc("KMF", "Comoros Franc"),
//  North_Korean_Won("KPW", "North Korean Won"),
//  Korean_Won("KRW", "Korean Won"),
//  Kuwaiti_Dinar("KWD", "Kuwaiti Dinar"),
//  Cayman_Islands_Dollar("KYD", "Cayman Islands Dollar"),
//  Kazakhstan_Tenge("KZT", "Kazakhstan Tenge"),
//  Lao_Kip("LAK", "Lao Kip"),
//  Lebanese_Pound("LBP", "Lebanese Pound"),
//  Sri_Lanka_Rupee("LKR", "Sri Lanka Rupee"),
//  Liberian_Dollar("LRD", "Liberian Dollar"),
//  Lesotho_Loti("LSL", "Lesotho Loti"),
//  Lithuanian_Lita("LTL", "Lithuanian Lita"),
//  Latvian_Lat("LVL", "Latvian Lat"),
//  Libyan_Dinar("LYD", "Libyan Dinar"),
//  Moroccan_Dirham("MAD", "Moroccan Dirham"),
//  Moldovan_Leu("MDL", "Moldovan Leu"),
//  Malagasy_Franc("MGF", "Malagasy Franc"),
//  Macedonian_Denar("MKD", "Macedonian Denar"),
//  Myanmar_Kyat("MMK", "Myanmar Kyat"),
//  Mongolian_Tugrik("MNT", "Mongolian Tugrik"),
//  Macau_Pataca("MOP", "Macau Pataca"),
//  Mauritania_Ougulya("MRO", "Mauritania Ougulya"),
//  Maltese_Lira("MTL", "Maltese Lira"),
//  Mauritius_Rupee("MUR", "Mauritius Rupee"),
//  Maldives_Rufiyaa("MVR", "Maldives Rufiyaa"),
//  Malawi_Kwacha("MWK", "Malawi Kwacha"),
//  Mexican_Peso("MXN", "Mexican Peso"),
//  Malaysian_Ringgit("MYR", "Malaysian Ringgit"),
//  Mozambique_Metical("MZM", "Mozambique Metical"),
//  Namibian_Dollar("NAD", "Namibian Dollar"),
//  Nigerian_Naira("NGN", "Nigerian Naira"),
//  Nicaragua_Cordoba("NIO", "Nicaragua Cordoba"),
//  Norwegian_Krone("NOK", "Norwegian Krone"),
//  Nepalese_Rupee("NPR", "Nepalese Rupee"),
//  Omani_Rial("OMR", "Omani Rial"),
//  Panama_Balboa("PAB", "Panama Balboa"),
//  Peruvian_Nuevo_Sol("PEN", "Peruvian Nuevo Sol"),
//  Papua_New_Guinea_Kina("PGK", "Papua New Guinea Kina"),
//  Philippine_Peso("PHP", "Philippine Peso"),
//  Pakistani_Rupee("PKR", "Pakistani Rupee"),
//  Polish_Zloty("PLN", "Polish Zloty"),
//  Paraguayan_Guarani("PYG", "Paraguayan Guarani"),
//  Qatar_Rial("QAR", "Qatar Rial"),
//  Romanian_Leu("ROL", "Romanian Leu"),
//  Russian_Rouble("RUB", "Russian Rouble"),
//  Saudi_Arabian_Riyal("SAR", "Saudi Arabian Riyal"),
//  Solomon_Islands_Dollar("SBD", "Solomon Islands Dollar"),
//  Seychelles_Rupee("SCR", "Seychelles Rupee"),
//  Sudanese_Dinar("SDD", "Sudanese Dinar"),
//  Swedish_Krona("SEK", "Swedish Krona"),
//  Singapore_Dollar("SGD", "Singapore Dollar"),
//  St_Helena_Pound("SHP", "St Helena Pound"),
//  Slovenian_Tolar("SIT", "Slovenian Tolar"),
//  Slovak_Koruna("SKK", "Slovak Koruna"),
//  Sierra_Leone_Leone("SLL", "Sierra Leone Leone"),
//  Somali_Shilling("SOS", "Somali Shilling"),
//  Surinam_Guilder("SRG", "Surinam Guilder"),
//  Sao_Tome_Dobra("STD", "Sao Tome Dobra"),
//  El_Salvador_Colon("SVC", "El Salvador Colon"),
//  Syrian_Pound("SYP", "Syrian Pound"),
//  Swaziland_Lilageni("SZL", "Swaziland Lilageni"),
//  Thai_Baht("THB", "Thai Baht"),
//  Tunisian_Dinar("TND", "Tunisian Dinar"),
//  Tonga_Pa_anga("TOP", "Tonga Pa'anga"),
//  Turkish_Lira("TRL", "Turkish Lira"),
//  Turkey_Lira("TRY", "Turkey Lira"),
//  Trinidad_And_Tobago_Dollar("TTD", "Trinidad And Tobago Dollar"),
//  Taiwan_Dollar("TWD", "Taiwan Dollar"),
//  Tanzanian_Shilling("TZS", "Tanzanian Shilling"),
//  Ukraine_Hryvnia("UAH", "Ukraine Hryvnia"),
//  Ugandan_Shilling("UGX", "Ugandan Shilling"),
//  Uruguayan_New_Peso("UYU", "Uruguayan New Peso"),
//  Venezuelan_Bolivar("VEB", "Venezuelan Bolivar"),
//  Vietnam_Dong("VND", "Vietnam Dong"),
//  Vanuatu_Vatu("VUV", "Vanuatu Vatu"),
//  Samoa_Tala("WST", "Samoa Tala"),
//  CFA_Franc_BEAC("XAF", "CFA Franc (BEAC)"),
//  Silver_Ounces("XAG", "Silver Ounces"),
//  Gold_Ounces("XAU", "Gold Ounces"),
//  East_Caribbean_Dollar("XCD", "East Caribbean Dollar"),
//  CFA_Franc_BCEAO("XOF", "CFA Franc (BCEAO)"),
//  Palladium_Ounces("XPD", "Palladium Ounces"),
//  Pacific_Franc("XPF", "Pacific Franc"),
//  Platinum_Ounces("XPT", "Platinum Ounces"),
//  Yemen_Riyal("YER", "Yemen Riyal"),
//  Yugoslav_Dinar("YUM", "Yugoslav Dinar"),
//  Zambian_Kwacha("ZMK", "Zambian Kwacha"),
//  Zimbabwe_Dollar("ZWD", "Zimbabwe Dollar");
	
	US_Dollar("USD", "US Dollar"),
	  Euro("EUR", "Euro"),
	  British_Pound("GBP", "British Pound"),
	  Swiss_Franc("CHF", "Swiss Franc"),
	  Japanese_Yen("JPY", "Japanese Yen"),
	  Chinese_Yuan("CNY", "Chinese Yuan"),
	  Indian_Rupee("INR", "Indian Rupee"),
	  Australian_Dollar("AUD", "Australian Dollar"),
	  Canadian_Dollar("CAD", "Canadian Dollar"),
	  South_African_Rand("ZAR", "South African Rand"),
	  New_Zealand_Dollar("NZD", "New Zealand Dollar"),
	  UAE_Dirham("AED", "UAE Dirham"),
	  Brazilian_Real("BRL", "Brazilian Real"),
	  Chilean_Peso("CLP", "Chilean Peso"),
	  Neth_Antilles_Guilder("ANG", "Neth Antilles Guilder"),
	  Argentine_Peso("ARS", "Argentine Peso"),
	  Bahraini_Dinar("BHD", "Bahraini Dinar"),
	  Brunei_Dollar("BND", "Brunei Dollar"),
	  Bolivian_Boliviano("BOB", "Bolivian Boliviano"),
	  Botswana_Pula("BWP", "Botswana Pula"),
	//  Colombian_Peso("COP", "Colombian Peso"),
	  Costa_Rica_Colon("CRC", "Costa Rica Colon"),
	  Czech_Koruna("CZK", "Czech Koruna"),
	  Danish_Krone("DKK", "Danish Krone"),
	  Dominican_Peso("DOP", "Dominican Peso"),
	  Algerian_Dinar("DZD", "Algerian Dinar"),
	  Estonian_Kroon("EEK", "Estonian Kroon"),
	  Egyptian_Pound("EGP", "Egyptian Pound"),
	  Hong_Kong_Dollar("HKD", "Hong Kong Dollar"),
	  Honduras_Lempira("HNL", "Honduras Lempira"),
	  Croatian_Kuna("HRK", "Croatian Kuna"),
	  Hungarian_Forint("HUF", "Hungarian Forint"),
	  Israeli_Shekel("ILS", "Israeli Shekel"),
	  Jamaican_Dollar("JMD", "Jamaican Dollar"),
	  Jordanian_Dinar("JOD", "Jordanian Dinar"),
	  Kenyan_Shilling("KES", "Kenyan Shilling"),
	  Kuwaiti_Dinar("KWD", "Kuwaiti Dinar"),
	  Cayman_Islands_Dollar("KYD", "Cayman Islands Dollar"),
	  Kazakhstan_Tenge("KZT", "Kazakhstan Tenge"),
	  Sri_Lanka_Rupee("LKR", "Sri Lanka Rupee"),
	  Lithuanian_Lita("LTL", "Lithuanian Lita"),
	  Latvian_Lat("LVL", "Latvian Lat"),
	  Moroccan_Dirham("MAD", "Moroccan Dirham"),
	  Moldovan_Leu("MDL", "Moldovan Leu"),
	  Macedonian_Denar("MKD", "Macedonian Denar"),
	  Mauritius_Rupee("MUR", "Mauritius Rupee"),
	  Mexican_Peso("MXN", "Mexican Peso"),
	  Malaysian_Ringgit("MYR", "Malaysian Ringgit"),
	  Namibian_Dollar("NAD", "Namibian Dollar"),
	  Nigerian_Naira("NGN", "Nigerian Naira"),
	  Nicaragua_Cordoba("NIO", "Nicaragua Cordoba"),
	  Norwegian_Krone("NOK", "Norwegian Krone"),
	  Nepalese_Rupee("NPR", "Nepalese Rupee"),
	  Omani_Rial("OMR", "Omani Rial"),
	  Peruvian_Nuevo_Sol("PEN", "Peruvian Nuevo Sol"),
	  Papua_New_Guinea_Kina("PGK", "Papua New Guinea Kina"),
	  Philippine_Peso("PHP", "Philippine Peso"),
	  Pakistani_Rupee("PKR", "Pakistani Rupee"),
	  Polish_Zloty("PLN", "Polish Zloty"),
	  //Paraguayan_Guarani("PYG", "Paraguayan Guarani"),
	  Qatar_Rial("QAR", "Qatar Rial"),
	  Russian_Rouble("RUB", "Russian Rouble"),
	  Saudi_Arabian_Riyal("SAR", "Saudi Arabian Riyal"),
	  Seychelles_Rupee("SCR", "Seychelles Rupee"),
	  Swedish_Krona("SEK", "Swedish Krona"),
	  Singapore_Dollar("SGD", "Singapore Dollar"),
	  Slovak_Koruna("SKK", "Slovak Koruna"),
	  //Sierra_Leone_Leone("SLL", "Sierra Leone Leone"),
	  El_Salvador_Colon("SVC", "El Salvador Colon"),
	  Thai_Baht("THB", "Thai Baht"),
	  Tunisian_Dinar("TND", "Tunisian Dinar"),
	  Turkey_Lira("TRY", "Turkey Lira"),
	  Trinidad_And_Tobago_Dollar("TTD", "Trinidad And Tobago Dollar"),
	  Taiwan_Dollar("TWD", "Taiwan Dollar"),
	//  Tanzanian_Shilling("TZS", "Tanzanian Shilling"),
	  Ukraine_Hryvnia("UAH", "Ukraine Hryvnia"),
	//  Ugandan_Shilling("UGX", "Ugandan Shilling"),
	  Uruguayan_New_Peso("UYU", "Uruguayan New Peso"),
	//  Venezuelan_Bolivar("VEB", "Venezuelan Bolivar"),
	//  Vietnam_Dong("VND", "Vietnam Dong"),
	  Yemen_Riyal("YER", "Yemen Riyal");
	//  Zambian_Kwacha("ZMK", "Zambian Kwacha"),
	//  Zimbabwe_Dollar("ZWD", "Zimbabwe Dollar");
 
  private final String currencyCode;
  private final String currencyFullName;
  private static final Map<String, String> currencyLookup = new HashMap<String, String>();
 
  static
  {
    for (Currency currencyEnum : EnumSet.allOf(Currency.class))
    {
      currencyLookup.put(currencyEnum.getCurrencyCode(), currencyEnum.getCurrencyCodeFullName());
    }
  }
   
  private Currency(String currencyCode, String currencyFullName)
  {
    this.currencyCode = currencyCode;
    this.currencyFullName = currencyFullName;
  }
 
  public String getCurrencyCode()
  {
    return this.currencyCode;
  }
 
  public String getCurrencyCodeFullName()
  {
    return currencyFullName;
  }
   
  /**Using the currency code as an argument, fetch and return associated full name
   * 
   * @param currencyCode - The Currency Code of which you want to retrieve its full reference name.
   */
  public static String getCurrencyCodeFullName(String currencyCode)
  {
    if(currencyLookup.containsKey(currencyCode))
    {
      return currencyLookup.get(currencyCode);
    }
    return null;
  }
 
  /***Checks and return currency code*/
  public static String getCurrency(String currencyCode)
  {
    if(currencyLookup.containsKey(currencyCode))
    {
      return currencyCode;
    }
    return null;
  }
  
  public static ArrayList<String> getStringCurrency(){
	  ArrayList<String> str_curr= new ArrayList<String>();
	  Currency [] currencies = Currency.values();
	  for(int i=0;i<currencies.length;i++){
		  str_curr.add(currencies[i].getCurrencyCodeFullName());
	  }
		
		return str_curr;
  }
 
}
