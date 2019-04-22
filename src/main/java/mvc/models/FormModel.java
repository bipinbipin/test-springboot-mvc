package mvc.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bipin on 3/14/2016.
 */
public class FormModel {

    private int hiddenField;
    private String textField;
    private String selectBox;
    private List<SelectBoxObj> selectBoxList;

    public FormModel() {
        this.selectBoxList = new ArrayList<>();

        //notes:    typically this would come from the database, we are hard coding here for example purposes
        this.selectBoxList.add(new SelectBoxObj(1, "ABC"));
        this.selectBoxList.add(new SelectBoxObj(2, "DEF"));
        this.selectBoxList.add(new SelectBoxObj(3, "GHI"));
        this.selectBoxList.add(new SelectBoxObj(4, "JKL"));
        this.selectBoxList.add(new SelectBoxObj(5, "MNO"));
    }


    public int getHiddenField() {
        return hiddenField;
    }

    public void setHiddenField(int hiddenField) {
        this.hiddenField = hiddenField;
    }

    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    public List<SelectBoxObj> getSelectBoxList() {
        return selectBoxList;
    }

    public void setSelectBoxList(List<SelectBoxObj> selectBox) {
        this.selectBoxList = selectBox;
    }

    public String getSelectBox() {
        return selectBox;
    }

    public void setSelectBox(String selectBox) {
        this.selectBox = selectBox;
    }
}
