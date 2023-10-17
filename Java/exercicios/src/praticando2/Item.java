package praticando2;

/**
 * @author Victor$
 * @date 10/6/2023$
 * Description:
 */
public class Item {

    int quantidade;
    Jogo game;

    Item(Jogo game, int quantidade) {
        this.game = game;
        this.quantidade = quantidade;
    }
}
