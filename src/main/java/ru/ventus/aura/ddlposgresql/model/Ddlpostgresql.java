package ru.ventus.aura.ddlposgresql.model;

/**
 * @autor : antontitow {@literal antontitow@bk}
 * @created : 04.07.2022, 0:51
 */
public class Ddlpostgresql implements IDdlPostgresql {
  private String NAMESPACE = "default";

  @Override
  public void setNamespace(String namespace) {
    this.NAMESPACE = namespace;
  }

  @Override
  public String getNamespace() {
    return NAMESPACE;
  }
}
