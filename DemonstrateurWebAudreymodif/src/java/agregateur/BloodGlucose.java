/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregateur;

/**
 *
 * @author Romeo
 */
public class BloodGlucose extends AgregateurObjet {
    private String value;
    private String unit;
    private String notes;
    private String mealTag;
    private String medicationTag;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMealTag() {
        return mealTag;
    }

    public void setMealTag(String mealTag) {
        this.mealTag = mealTag;
    }

    public String getMedicationTag() {
        return medicationTag;
    }

    public void setMedicationTag(String medicationTag) {
        this.medicationTag = medicationTag;
    }
    
}
