package Greedy;
/*You are given a set of N jobs where each job comes with a deadline and profit.
The profit can only be earned upon completing the job within its deadline.
Find the number of jobs done and the maximum profit that can be obtained.
Each job takes a single unit of time and only one job can be performed at a time.
Input: N = 4, Jobs = {(1,4,20),(2,1,10),(3,1,40),(4,1,30)}
-----------------------------------------------
Output: 2 60
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Job {
    int id, profit, deadline;

    public int getId() {
        return id;
    }


    public int getProfit() {
        return profit;
    }


    public int getDeadline() {
        return deadline;
    }


    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", profit=" + profit +
                ", deadline=" + deadline +
                '}';
    }

    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

public class JobScheduling {
    public static void main(String[] args) {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job(1, 4, 20));
        jobs.add(new Job(2, 1, 10));
        jobs.add(new Job(3, 2, 40));
        jobs.add(new Job(4, 2, 30));
        List<Integer> ans = JobScheduling(jobs);
        System.out.println(ans);


    }

    private static List<Integer> JobScheduling(ArrayList<Job> jobs) {
        Comparator<Job> jobComparatorByProfit = Comparator.comparing(Job::getProfit).reversed();
        jobs.sort(jobComparatorByProfit);
        System.out.println(jobs);
        //we will create an array of length deadline
        //find the max deadline
        int maxDeadline = 0;
        for (Job x : jobs) {
            if (x.getDeadline() > maxDeadline) maxDeadline = x.getDeadline();
        }
        //create array of that deadline size and initialise with -1;
        int[] jobOrder = new int[maxDeadline + 1];
        Arrays.fill(jobOrder, -1);

        int countjobs = 0, jobProfit = 0;
        //for every job if the job fits in its deadline -- add profit -- increment count
        for (Job x : jobs) {
            for (int j = x.getDeadline(); j > 0; j--) {
                //traverse from the curr job deadline to 0 in the jobOrder array if -1 is found, job can be taken
                //free slot is found
                if (jobOrder[j] == -1) {
                    jobOrder[j] = x.getId();
                    countjobs++;
                    jobProfit += x.getProfit();
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(jobOrder));
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(jobProfit);
        ans.add(countjobs);
        return ans;
    }
}
