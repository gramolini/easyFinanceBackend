package br.com.financeManagerForAll.repositories;

import br.com.financeManagerForAll.models.ManagementUserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ManagementUserRepository extends JpaRepository<ManagementUserModel, UUID> {

    Optional<ManagementUserModel> findUserByUsername(String username);
}
