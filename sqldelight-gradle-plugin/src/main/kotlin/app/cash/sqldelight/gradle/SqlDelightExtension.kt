package app.cash.sqldelight.gradle

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.provider.Property

interface SqlDelightExtension {
  val databases: NamedDomainObjectContainer<SqlDelightDatabase>
  val linkSqlite: Property<Boolean>
}
