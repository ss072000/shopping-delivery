package com.instamart.shopping_delivery.repositorys;

import com.instamart.shopping_delivery.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AppUserRepository extends JpaRepository<AppUser, UUID>
{

}
