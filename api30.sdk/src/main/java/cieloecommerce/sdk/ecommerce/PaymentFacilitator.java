package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class PaymentFacilitator {

  @SerializedName("EstablishmentCode")
  private String establishmentCode;
  @SerializedName("SubEstablishment")
  private SubEstablishment subEstablishment;

  public String getEstablishmentCode() {
    return this.establishmentCode;
  }

  public PaymentFacilitator setEstablishmentCode(String establishmentCode) {
    this.establishmentCode = establishmentCode;
    return this;
  }

  public SubEstablishment getSubEstablishment() { return this.subEstablishment; }

  public PaymentFacilitator setSubEstablishment(SubEstablishment subEstablishment) {
    this.subEstablishment = subEstablishment;
    return this;
  }
}
