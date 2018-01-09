package entities
import enums._

abstract class Card(
  val name: String,
  val card_text: String,
  val mana_cost: Int,
  val hero_class: HeroClass,
  val special_effects: Array[SpecialEffect]) {}
