package main

type Card struct {
	name string
	cardType string
}

func NewCard(name, cardType string) *Card {
	return &Card{name: name, cardType: cardType}
}

func (c *Card) GetName() string {
	return c.name
}

func (c *Card) GetType() string {
	return c.cardType
}