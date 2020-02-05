import dataStore.Data;



public class Program {

    private Data data = Init.buildData();


    public Program() {

    }

    public void run() {

        data.getFrame().setFrame(data.getPane().gameScreen());
        data.getFrame().setFrameVisible();

    }


}
