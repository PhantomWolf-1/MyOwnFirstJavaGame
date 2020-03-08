package dataStore;

public class UpdateClass implements Updatable {

    private Data data;

    public UpdateClass(Data data) {
        this.data = data;
    }

    @Override
    public void update() {

        this.data.getPlayerStatsMainGame().setText(this.data.getPlayer().toString());


    }
}
