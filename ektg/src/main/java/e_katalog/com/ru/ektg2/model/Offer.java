package e_katalog.com.ru.ektg2.model;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "profile_id", nullable = false)
    private Long profileId;

    @Column(name = "offer_code")
    private String offerCode;

    @Column(name = "offer_status", nullable = false)
    private Short offerStatus;

    @Column(name = "offer_price", precision = 18, scale = 10, nullable = false)
    private BigDecimal offerPrice;

    @Column(name = "offer_description")
    private String offerDescription;

    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Column(name = "create_ip_address", nullable = false)
    private String createIpAddress;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "city_id")
    private Integer cityId;
  
    
}
