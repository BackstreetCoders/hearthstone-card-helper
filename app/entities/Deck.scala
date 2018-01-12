package entities
import enums._

class Deck (
  val name: String,
  val cards: Array[Cards],
  val hero_class: HeroClass,
  val archetype: Archetype) {

  def card_count: Int = { cards.length }
  def dust_cost: Int = { cards.map(_dust_cost).sum }

  def add_card(card: Card) = { cards :+ card }
  def remove_card(card: Card) = { cards :- card }

}
