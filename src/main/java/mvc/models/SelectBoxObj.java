package mvc.models;

/**
 * Created by Bipin on 3/14/2016.
 */
public class SelectBoxObj {

    private int id;
    private String value;

    public SelectBoxObj () {}

    public SelectBoxObj(int id, String value){
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
