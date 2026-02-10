package de.byaku.lh2z.model;

import jakarta.persistence.*;

@Entity
@Table(name = "co2_emission")
public class Co2Emission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_code", nullable = false, length = 10)
    private String countryCode;

    @Column(name = "country_name", nullable = false, length = 100)
    private String countryName;

    @Column(nullable = false)
    private Integer year;

    @Column(name = "value_kt", nullable = false)
    private Double valueKt;

    public Co2Emission() { }

    public Co2Emission(String countryCode, String countryName, Integer year, Double valueKt) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.year = year;
        this.valueKt = valueKt;
    }

    public Long getId() { return id; }
    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }

    public String getCountryName() { return countryName; }
    public void setCountryName(String countryName) { this.countryName = countryName; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public Double getValueKt() { return valueKt; }
    public void setValueKt(Double valueKt) { this.valueKt = valueKt; }
}
