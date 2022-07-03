package ru.ventus.aura.ddlposgresql.executor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ventus.aura.ddlposgresql.repository.DdlpostgresqlRepository;

import javax.annotation.PostConstruct;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 04.07.2022, 1:42
 */
@Component
@Slf4j
public class CreatorTable {

  private final DdlpostgresqlRepository ddlpostgresqlRepository;

  @Autowired
  public CreatorTable(DdlpostgresqlRepository ddlpostgresqlRepository) {
    this.ddlpostgresqlRepository = ddlpostgresqlRepository;
  }

  @PostConstruct
  public void run() {
    log.info(String.valueOf(ddlpostgresqlRepository.createTable()));
  }
}
