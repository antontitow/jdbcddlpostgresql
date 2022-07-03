package ru.ventus.aura.ddlposgresql.model;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 04.07.2022, 0:52
 */
public interface IDdlPostgresql {
  void setNamespace(String namespace);

  String getNamespace();

  default boolean createTable() {
    return false;
  }

  default boolean deleteTable() {
    return false;
  }
}
