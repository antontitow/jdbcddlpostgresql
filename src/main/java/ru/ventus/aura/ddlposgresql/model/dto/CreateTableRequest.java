package ru.ventus.aura.ddlposgresql.model.dto;

import ru.ventus.aura.ddlposgresql.model.Field;

import java.util.List;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 04.07.2022, 1:59
 */
public class CreateTableRequest {
  String table;
  List<Field> fieldList;
}
