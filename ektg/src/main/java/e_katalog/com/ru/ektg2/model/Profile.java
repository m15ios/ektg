package e_katalog.com.ru.ektg2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
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

    // getters и setters
    
}
