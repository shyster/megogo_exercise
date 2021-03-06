package com.megogo.exercise.channel_objects.json;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "original",
        "105x85",
        "150x85",
        "980x560",
        "105x60",
        "125x70",
        "480x330",
        "1600x520",
        "230x130"
})
public class Pictures {

    @JsonProperty("original")
    private String original;
    @JsonProperty("105x85")
    private String _105x85;
    @JsonProperty("150x85")
    private String _150x85;
    @JsonProperty("980x560")
    private String _980x560;
    @JsonProperty("105x60")
    private String _105x60;
    @JsonProperty("125x70")
    private String _125x70;
    @JsonProperty("480x330")
    private String _480x330;
    @JsonProperty("1600x520")
    private String _1600x520;
    @JsonProperty("230x130")
    private String _230x130;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("original")
    public String getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(String original) {
        this.original = original;
    }

    @JsonProperty("105x85")
    public String get105x85() {
        return _105x85;
    }

    @JsonProperty("105x85")
    public void set105x85(String _105x85) {
        this._105x85 = _105x85;
    }

    @JsonProperty("150x85")
    public String get150x85() {
        return _150x85;
    }

    @JsonProperty("150x85")
    public void set150x85(String _150x85) {
        this._150x85 = _150x85;
    }

    @JsonProperty("980x560")
    public String get980x560() {
        return _980x560;
    }

    @JsonProperty("980x560")
    public void set980x560(String _980x560) {
        this._980x560 = _980x560;
    }

    @JsonProperty("105x60")
    public String get105x60() {
        return _105x60;
    }

    @JsonProperty("105x60")
    public void set105x60(String _105x60) {
        this._105x60 = _105x60;
    }

    @JsonProperty("125x70")
    public String get125x70() {
        return _125x70;
    }

    @JsonProperty("125x70")
    public void set125x70(String _125x70) {
        this._125x70 = _125x70;
    }

    @JsonProperty("480x330")
    public String get480x330() {
        return _480x330;
    }

    @JsonProperty("480x330")
    public void set480x330(String _480x330) {
        this._480x330 = _480x330;
    }

    @JsonProperty("1600x520")
    public String get1600x520() {
        return _1600x520;
    }

    @JsonProperty("1600x520")
    public void set1600x520(String _1600x520) {
        this._1600x520 = _1600x520;
    }

    @JsonProperty("230x130")
    public String get230x130() {
        return _230x130;
    }

    @JsonProperty("230x130")
    public void set230x130(String _230x130) {
        this._230x130 = _230x130;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Pictures{" +
                "original='" + original + '\'' +
                ", _105x85='" + _105x85 + '\'' +
                ", _150x85='" + _150x85 + '\'' +
                ", _980x560='" + _980x560 + '\'' +
                ", _105x60='" + _105x60 + '\'' +
                ", _125x70='" + _125x70 + '\'' +
                ", _480x330='" + _480x330 + '\'' +
                ", _1600x520='" + _1600x520 + '\'' +
                ", _230x130='" + _230x130 + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
