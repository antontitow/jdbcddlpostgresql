package ru.ventus.aura.ddlposgresql.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ventus.aura.ddlposgresql.model.Ddlpostgresql;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 04.07.2022, 1:22
 */
@Repository
public class DdlpostgresqlRepository extends Ddlpostgresql {
  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public DdlpostgresqlRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }




  @Override
  public boolean createTable() {
    jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS TEST( id BIGSERIAL PRIMARY KEY, NAME VARCHAR(200));");
    return true;
  }
}
