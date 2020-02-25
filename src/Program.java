import dataStore.Data;



public class Program {

    private Data data = Init.buildData();


    public Program() {

    }

    public void run() {

        data.getFrame().setFrame(data.getPane().setChoiceScreen());
        data.getFrame().setFrameVisible();

    }


}
