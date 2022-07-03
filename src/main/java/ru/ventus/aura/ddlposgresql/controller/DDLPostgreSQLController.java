package ru.ventus.aura.ddlposgresql.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ventus.aura.ddlposgresql.model.dto.CreateTableRequest;
import ru.ventus.aura.ddlposgresql.service.DDLPostgreSQLService;

import javax.validation.Valid;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 04.07.2022, 1:55
 */
@RestController
public class DDLPostgreSQLController {
  private final DDLPostgreSQLService ddlPostgreSQLService;

  public DDLPostgreSQLController(DDLPostgreSQLService ddlPostgreSQLService) {
    this.ddlPostgreSQLService = ddlPostgreSQLService;
  }

  @PostMapping("/table/create")
  public ResponseEntity createTable(@Valid @RequestBody CreateTableRequest createTableRequest) {
    ddlPostgreSQLService.createTable(createTableRequest);
    return null;
  }
}
