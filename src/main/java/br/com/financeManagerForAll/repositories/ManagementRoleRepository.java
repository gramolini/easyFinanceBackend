package br.com.financeManagerForAll.repositories;

import br.com.financeManagerForAll.models.ManagementRoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ManagementRoleRepository extends JpaRepository<ManagementRoleModel, UUID> {

    Optional<ManagementRoleModel> findByRoleName(String roleName);
}
