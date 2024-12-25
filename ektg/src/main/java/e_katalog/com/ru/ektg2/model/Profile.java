package e_katalog.com.ru.ektg2.model;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "tg_id")
    private Long tgId;
    
    @Column(name = "profile_status")
    private Short profileStatus;
    
    @Column(name = "create_date")
    private Date createDate;
    
    @Column(name = "create_ip_address")
    private String createIpAddress;
   
}
