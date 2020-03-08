package dataStore;

import objects.Player;
import objects.classChoiceStats;
import objects.item.ItemSpritesKnightClass;
import screens.ActionHandler;
import screens.ChoicePanels;
import screens.Frame;
import screens.Pane;
import story.StageOne;

import javax.swing.*;


public class Data {

    private Frame frame;
    private Pane pane;
    private ActionHandler handler;
    private Player player;
    private classChoiceStats stats;
    private ChoicePanels choicePanels;
    private StageOne stageOne;
    private JTextArea mainTextGame;
    private ImageIcon profilePic;
    private JLabel labelPic;
    private ImageIcon itemPic;
    private JLabel labelItemPic;

    private JTextArea playerStatsMainGame;
    private JTextArea playerChoiceOptionInGame;

    private JButton choice1;
    private JButton choice2;
    private JButton choice3;
    private JButton choice4;
    private JButton inventoryButton;

    private Frame inventoryScreen;
    private ItemSpritesKnightClass allSpritesKnight;


    public Frame getFrame() {
        return this.frame;
    }

    public Pane getPane() {
        return this.pane;
    }

    public ActionHandler getHandler() {
        return this.handler;
    }

    public Player getPlayer() {
        return this.player;
    }

    public ChoicePanels getChoicePanels() {
        return choicePanels;
    }

    public classChoiceStats getStats() {
        return stats;
    }

    public StageOne getStageOne() {
        return stageOne;
    }

    public JTextArea getMainTextGame() {
        return mainTextGame;
    }

    public JTextArea getPlayerStatsMainGame() {
        return playerStatsMainGame;
    }

    public JButton getChoice1() {
        return choice1;
    }

    public JButton getChoice2() {
        return choice2;
    }

    public JButton getChoice3() {
        return choice3;
    }

    public JButton getChoice4() {
        return choice4;
    }

    public ImageIcon getProfilePic() {
        return profilePic;
    }

    public JLabel getLabelPic() {
        return labelPic;
    }

    public ImageIcon getItemPic() {
        return itemPic;
    }

    public JLabel getLabelItemPic() {
        return labelItemPic;
    }

    public JTextArea getPlayerChoiceOptionInGame() {
        return playerChoiceOptionInGame;
    }

    public JButton getInventoryButton() {
        return inventoryButton;
    }

    public Frame getInventoryScreen() {
        return inventoryScreen;
    }

    public ItemSpritesKnightClass getAllSpritesKnight() {
        return allSpritesKnight;
    }

    //------------------------------------------------------------------------------------------------------------------------


    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public void setHandler(ActionHandler handler) {
        this.handler = handler;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setChoicePanels(ChoicePanels choicePanels) {
        this.choicePanels = choicePanels;
    }

    public void setStats(classChoiceStats stats) {
        this.stats = stats;
    }

    public void setStageOne(StageOne stageOne) {
        this.stageOne = stageOne;
    }

    public void setMainTextGame(JTextArea mainTextGame) {
        this.mainTextGame = mainTextGame;
    }

    public void setPlayerStatsMainGame(JTextArea playerStatsMainGame) {
        this.playerStatsMainGame = playerStatsMainGame;
    }

    public void setChoice1(JButton choice1) {
        this.choice1 = choice1;
    }

    public void setChoice2(JButton choice2) {
        this.choice2 = choice2;
    }

    public void setChoice3(JButton choice3) {
        this.choice3 = choice3;
    }

    public void setChoice4(JButton choice4) {
        this.choice4 = choice4;
    }

    public void setProfilePic(ImageIcon profilePic) {
        this.profilePic = profilePic;
    }

    public void setLabelPic(JLabel labelPic) {
        this.labelPic = labelPic;
    }

    public void setItemPic(ImageIcon itemPic) {
        this.itemPic = itemPic;
    }

    public void setLabelItemPic(JLabel labelItemPic) {
        this.labelItemPic = labelItemPic;
    }

    public void setPlayerChoiceOptionInGame(JTextArea playerChoiceOptionInGame) {
        this.playerChoiceOptionInGame = playerChoiceOptionInGame;
    }

    public void setInventoryButton(JButton inventoryButton) {
        this.inventoryButton = inventoryButton;
    }

    public void setInventoryScreen(Frame inventoryScreen) {
        this.inventoryScreen = inventoryScreen;
    }

    public void setAllSpritesKnight(ItemSpritesKnightClass allSpritesKnight) {
        this.allSpritesKnight = allSpritesKnight;
    }

    public void clearButtons() {

        this.choice1.setText("");
        this.choice1.setActionCommand("");

        this.choice2.setText("");
        this.choice2.setActionCommand("");

        this.choice3.setText("");
        this.choice3.setActionCommand("");

        this.choice4.setText("");
        this.choice4.setActionCommand("");


    }
}
