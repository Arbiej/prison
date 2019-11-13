package model;

import java.time.LocalDate;
import java.time.Period;

import static java.time.temporal.ChronoUnit.DAYS;

public class Sentence {
    private LocalDate start;
    private LocalDate stop;
    private boolean parole;
    private int coreSentenceDays;
    private String description;

    public Sentence() {
    }

    public Sentence(LocalDate start, LocalDate stop, boolean parole, String description) {
        this.start = start;
        this.stop = stop;
        this.parole = parole;
        this.coreSentenceDays = calculateSentence(start, stop);
        this.description = description;
    }

    private int calculateSentence(LocalDate start, LocalDate stop) {
        return (int)DAYS.between(start, stop);
    }

    public LocalDate getStart() {
        return start;
    }
    public void setStart(LocalDate start) {
        if (start !=  null && this.stop != null) {
            this.coreSentenceDays = calculateSentence(start, this.stop);
        }
        this.start = start;
    }
    public LocalDate getStop() {
        return stop;
    }
    public void setStop(LocalDate stop) {
        if (this.start !=  null && stop != null) {
            this.coreSentenceDays = calculateSentence(this.start, stop);
        }
        this.stop = stop;
    }
    public boolean isParole() {
        return parole;
    }
    public void setParole(boolean parole) {
        this.parole = parole;
    }
    public int getCoreSentenceDays() {
        return coreSentenceDays;
    }
    public void setCoreSentenceDays(int coreSentenceDays) {
        this.coreSentenceDays = coreSentenceDays;
    } // zobaczyć potem czy usunąć
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;

        Sentence sentence = (Sentence) o;

        if (parole != sentence.parole) return false;
        if (coreSentenceDays != sentence.coreSentenceDays) return false;
        if (start != null ? !start.equals(sentence.start) : sentence.start != null) return false;
        if (stop != null ? !stop.equals(sentence.stop) : sentence.stop != null) return false;
        return description != null ? description.equals(sentence.description) : sentence.description == null;
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (stop != null ? stop.hashCode() : 0);
        result = 31 * result + (parole ? 1 : 0);
        result = 31 * result + coreSentenceDays;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "start=" + start +
                ", stop=" + stop +
                ", parole=" + parole +
                ", coreSentenceDays=" + coreSentenceDays +
                ", description='" + description + '\'' +
                '}';
    }
}
