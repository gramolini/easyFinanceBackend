package br.com.financeManagerForAll.models;

import br.com.financeManagerForAll.enums.RoleNameEnum;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Builder
@Entity
@Table(name = "MANAGEMENT_ROLE")
@NoArgsConstructor
@AllArgsConstructor
public class ManagementRoleModel implements GrantedAuthority, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_NAME", nullable = false, unique = true)
    private RoleNameEnum roleName;

    @Override
    public String getAuthority() {
        return this.roleName.toString();
    }
}
