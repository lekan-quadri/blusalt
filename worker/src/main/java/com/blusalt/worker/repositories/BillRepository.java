package com.blusalt.worker.repositories;

import com.blusalt.worker.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
