package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.Objects;

public class TimeEntry  {
    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;


    public TimeEntry(long timeEntryId, long projectId, long userId, LocalDate parse, int i, long id, long projectId1, long userId1, LocalDate date, int hours) {
        this.id = id;
        this.projectId = projectId1;
        this.userId = userId1;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry( long projectId, long userId, LocalDate parse, int i, long id, long projectId1, long userId1, LocalDate date, int hours) {
        this.id = 0;
        this.projectId = projectId1;
        this.userId = userId1;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry(long projectId, long userId, LocalDate parse, int i) {
    }

    public TimeEntry(long timeEntryId, long projectId, long userId, LocalDate parse, int i) {
    }

    public TimeEntry() {

    }


    public long getId() {
        return id;
    }

    public long getProjectId() {
        return projectId;
    }

    public long getUserId() {
        return userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "TimeEntry{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", date=" + date +
                ", hours=" + hours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeEntry timeEntry = (TimeEntry) o;
        return id == timeEntry.id &&
                projectId == timeEntry.projectId &&
                userId == timeEntry.userId &&
                hours == timeEntry.hours &&
                Objects.equals(date, timeEntry.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, userId, date, hours);
    }
}
