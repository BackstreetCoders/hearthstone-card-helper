package entities
import enums._

class Minion(
  name: String,
  card_text: String,
  mana_cost: Int,
  hero_class: HeroClass,
  special_effects: Array[SpecialEffect],
  val attack: Int,
  val defense: Int
) extends Card(name, card_text, mana_cost, hero_class, special_effects) {}