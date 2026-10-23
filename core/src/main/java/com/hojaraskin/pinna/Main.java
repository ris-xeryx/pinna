package com.hojaraskin.pinna;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {

    private Texture d_hurt;
    private SpriteBatch batch;

    /*
    el metodo create funciona como un "constructor" para libgdx, no usamos un constructor normal
    ya que la libreria primero carga cirtos componentes fundamentales y si
    usamos un constructor podriamos corromper esto.
    */

    @Override
    public void create() {
        super.create();
        //importar textura (esta en especifico tiene 2 frames de movimiento)
        d_hurt = new Texture(("/Characters/D_Hurt.png"));

        //tamaño de la textura por frame
        int frameAnchura = 32;
        int frameLargo = 32;

        // esto divide la textura en regiones
        TextureRegion[][] temp = TextureRegion.split(d_hurt, frameAnchura, frameLargo);

        //pasar esas regiones a un arreglo
        TextureRegion[] d_hurt_frames = new TextureRegion[2];
        d_hurt_frames[0]= temp [0][0]; //frame 1
        d_hurt_frames[1]= temp [0][1]; //frame 2
        //declaracion del batch
        batch = new SpriteBatch();
    }

    @Override
    public void dispose() {
        super.dispose();
        d_hurt.dispose();
        batch.dispose();

    }

    /*
        render es el que muestra imagenes y actualiza el estado del juego, es muy
        importante ya que sirve para casi todo LO QUE SE VE
         */
    @Override
    public void render() {
       //batch.begin sirve para indicarle al render que queremos comenzar a dibujar cosas en pantalla
        batch.begin();
        batch.draw();
        //todo lo que dijimos quxe queriamos dibujar, lo hara cuando ejecutemos batch end
        batch.end();
        super.render();
    }
}
