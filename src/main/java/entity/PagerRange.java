package entity;


import lombok.Data;

@Data
public class PagerRange {
    Integer start;
    Integer end;

    public PagerRange(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public String toString() {
        return "PagerRange{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
