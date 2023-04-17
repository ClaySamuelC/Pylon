package com.pylon.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.ScreenUtils;

public class Pylon extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	private Stage stage;
	private Table table;
	
	@Override
	public void create() {
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);

		table = new Table();
		table.setFillParent(true);
		stage.addActor(table);

		table.setDebug(true);

		batch = new SpriteBatch();
		img = new Texture("card.jpg");
	}

	public void resize (int width, int height) {
		stage.getViewport().update(width, height, true);
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();

		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();

		/*
		Animate player UI (Mana, health)
		Animate hand (For each card, animate the card, it's name, etc.)

		LOGIC:
		when you click on a card, select it.
		When you have a card selected, highlight it.
		When you have a card selected and you click a valid target, cast that card.
		 */

		/*
		for (Card card: user.hand) {
			if isCardSelected(card) {

			}
		}
		 */
	}
	
	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	}
}
