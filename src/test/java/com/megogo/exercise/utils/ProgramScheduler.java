package com.megogo.exercise.utils;

import java.util.Date;

/**
 * Created by Vladislav Kulasov on 28.01.2018.
 */
public class ProgramScheduler {
    private String title;
    private Date startDate;
    private Date stopDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }

    public ProgramScheduler(String title, Date startDate, Date stopDate) {
        this.title = title;
        this.startDate = startDate;
        this.stopDate = stopDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgramScheduler that = (ProgramScheduler) o;

        if (!title.equals(that.title)) return false;
        if (!startDate.equals(that.startDate)) return false;
        return stopDate.equals(that.stopDate);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + stopDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ProgramScheduler{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", stopDate=" + stopDate +
                '}';
    }
}
