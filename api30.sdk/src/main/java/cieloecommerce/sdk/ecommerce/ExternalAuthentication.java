package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class ExternalAuthentication {

    @SerializedName("Cavv")
    private String cavv;

    @SerializedName("Xid")
    private String xid;

    @SerializedName("Eci")
    private String eci;

    @SerializedName("Version")
    private String version;

    @SerializedName("ReferenceID")
    private String referenceId;

    public ExternalAuthentication(String cavv,
                                  String xid,
                                  String eci) {
        this.cavv = cavv;
        this.xid = xid;
        this.eci = eci;
    }

    public String getCavv() {
        return cavv;
    }

    public ExternalAuthentication setCavv(String cavv) {
        this.cavv = cavv;
        return this;
    }

    public String getXid() {
        return xid;
    }

    public ExternalAuthentication setXid(String xid) {
        this.xid = xid;
        return this;
    }

    public String getEci() {
        return eci;
    }

    public ExternalAuthentication setEci(String eci) {
        this.eci = eci;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public ExternalAuthentication setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public ExternalAuthentication setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
}
