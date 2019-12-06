import sbt._

case class Module(org: String, name: String, version: String) {
  def java: Def.Initialize[ModuleID] = Def.setting(org % name % version)
  def scala: Def.Initialize[ModuleID] = Def.setting(org %% name % version)
  def js: Def.Initialize[ModuleID] = Def.setting(org %%% name % version)
}

object Dependencies {

}