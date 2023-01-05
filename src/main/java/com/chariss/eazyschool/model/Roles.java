package com.chariss.eazyschool.model;

import com.chariss.eazyschool.model.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
public class Roles extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int roleId;

    private String roleName;

}
