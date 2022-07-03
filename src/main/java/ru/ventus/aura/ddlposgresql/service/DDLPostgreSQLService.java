package ru.ventus.aura.ddlposgresql.service;

import org.springframework.stereotype.Service;
import ru.ventus.aura.ddlposgresql.model.dto.CreateTableRequest;
import ru.ventus.aura.ddlposgresql.repository.DdlpostgresqlRepository;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 04.07.2022, 2:15
 */
@Service
public class DDLPostgreSQLService {
  private final DdlpostgresqlRepository ddlpostgresqlRepository;

  public DDLPostgreSQLService(DdlpostgresqlRepository ddlpostgresqlRepository) {
    this.ddlpostgresqlRepository = ddlpostgresqlRepository;
  }

  public void createTable(CreateTableRequest createTableRequest) {
    ddlpostgresqlRepository.createTable();
  }
}
