package Greedy;
/*@Author Atul Kr Gupta
* Given inputs 2 arr - start - [] , end - []
*for ith index the start time of meeting is given and end time is given.
*the maximum number of meetings that can be accommodated
* if only one meeting can happen in the room at a  particular time
*
* */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Meeting implements Comparable<Meeting>{
    int end;
    int start;
    int pos;

    public Meeting(int end, int start, int pos) {
        this.end = end;
        this.start = start;
        this.pos = pos;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "start=" + start +
                ", end=" + end +
                ", pos=" + pos +
                '}';
    }

    public int getPos() {
        return pos;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.end < o.getEnd()) return -1;
        else if(this.end > o.getEnd()) return 1;
        else if(this.pos < o.getPos()) return -1;
        else if(this.pos > o.getPos()) return 1;
        return 0;
    }
}
public class NmeetOneRoom {

    public static void main(String[] args) {
        //initialisation
        int n = 6;
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,5,7,9,9};
        maxMeetings(start,end,n);
    }

    private static void maxMeetings(int[] start, int[] end, int n) {
//        Create a list of meetings to store all meeting with pos
        ArrayList<Meeting> meetings = new ArrayList<>(n);
        for(int i =0; i< n; i++){
            meetings.add(new Meeting(end[i],start[i],i+1));
        }
//        sort the meeting based on endings and pos
        Comparator<Meeting> endingComparator = Comparator.comparing(Meeting::getEnd).thenComparing(Meeting::getPos);
        meetings.sort(null);
        for(Meeting m : meetings){
            System.out.println(m);
        }
//        answer will hold the sequence of meetings thus the positions
        List<Integer> ans = new ArrayList<>();
        ans.add(meetings.get(0).getPos());
//        to add meeting in answers list check if the meeting has started after the prev one was finished
        int limit = meetings.get(0).getEnd();
        for(int i = 1; i < n; i++){
            if(meetings.get(i).getStart() > limit){
                limit = meetings.get(i).getEnd();
                ans.add(meetings.get(i).getPos());
            }
        }
//        print the order of meetings execution
        for(int e: ans) System.out.println(e);


    }
}
