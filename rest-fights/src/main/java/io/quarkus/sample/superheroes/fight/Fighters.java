package io.quarkus.sample.superheroes.fight;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.quarkus.sample.superheroes.fight.client.Hero;
import io.quarkus.sample.superheroes.fight.client.Villain;

@Schema(description = "A fight between one hero and one villain")
public class Fighters {
	@NotNull
	private Hero hero;

	@NotNull
	private Villain villain;

	public Fighters(Hero hero, Villain villain) {
		this.hero = hero;
		this.villain = villain;
	}

	public Fighters() {
	}

	public Hero getHero() {
		return this.hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public Villain getVillain() {
		return this.villain;
	}

	public void setVillain(Villain villain) {
		this.villain = villain;
	}

	@Override
	public String toString() {
		return "Fighters{" + "hero=" + this.hero + ", villain=" + this.villain + '}';
	}
}
