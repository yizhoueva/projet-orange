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
public class Activity extends AgregateurObjet{
    private String startTime;
    private String endTime;
    private String tzOffset;
    private String type;
    private String duration;
    private String distance;
    private String steps;
    private String calories;
    private String sourceData;
    private String timeSeries;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTzOffset() {
        return tzOffset;
    }

    public void setTzOffset(String tzOffset) {
        this.tzOffset = tzOffset;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getSourceData() {
        return sourceData;
    }

    public void setSourceData(String sourceData) {
        this.sourceData = sourceData;
    }

    public String getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(String timeSeries) {
        this.timeSeries = timeSeries;
    }

}
