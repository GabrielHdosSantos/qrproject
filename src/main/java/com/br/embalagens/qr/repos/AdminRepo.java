package com.br.embalagens.qr.repos;

import com.br.embalagens.qr.modelo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {
}
