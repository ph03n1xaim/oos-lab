import java.util.*;
import java.text.*;

class Meeting {
    String meetingTitle;
    Date startTime;
    Date endTime;
    String meetingDescription;

    Meeting(String meetingTitle, Date startTime, Date endTime, String meetingDescription) {
        this.meetingTitle = meetingTitle;
        this.startTime = startTime;
        this.endTime = endTime;
        this.meetingDescription = meetingDescription;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH.mm");
        return "On " + dateFormat.format(this.startTime) + ", from " + timeFormat.format(this.startTime) + " to " + timeFormat.format(this.endTime) + " : " + meetingTitle + " : " + meetingDescription;
    }
}


class DepartmentMeetingScheduler {
    List<Meeting> meetings = new ArrayList<>();

    public boolean scheduleMeeting(String meetingTitle, String meetingDate, String meetingStartTime, String meetingEndTime, String meetingDescription) {
        Date newStartTime = null;
        Date newEndTime = null;
        Date existingStartTime;
        Date existingEndTime;
        Meeting newMeet;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            newStartTime = dateFormat.parse(meetingDate + " " + meetingStartTime);
            newEndTime = dateFormat.parse(meetingDate + " " + meetingEndTime);
        } catch (ParseException e) {
            System.exit(1);
        }

        for (Meeting existingMeet: meetings) {
            existingStartTime = existingMeet.getStartTime();
            existingEndTime = existingMeet.getEndTime();

            if (newStartTime.after(newEndTime))
                System.exit(1);

            if (newStartTime.after(existingStartTime) && newStartTime.before(existingEndTime) || newEndTime.after(existingStartTime) && newEndTime.before(existingEndTime))
                return false;
        }
        newMeet = new Meeting(meetingTitle, newStartTime, newEndTime, meetingDescription);
        this.meetings.add(newMeet);
        return true;
    }

    public void displayMeetings(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date meetDate;
        String currDate;
        try {
            meetDate = dateFormat.parse(date);
        } catch (ParseException e) {
            System.exit(1);
        }
        for (Meeting meet: this.meetings) {
            currDate = dateFormat.format(meet.getStartTime());
            if (currDate.equals(date)) {
                System.out.println(meet.toString());
            }
        }
    }
}


public class Q3 {
    public static void main(String[] args) {
        int choice;
        DepartmentMeetingScheduler sched = new DepartmentMeetingScheduler();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currDate = dateFormat.format(new Date());
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Schedule Meeting");
        System.out.println("2. List Meetings");
        while (true) {
            System.out.print("\nEnter your choice:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    currDate = addMeeting(sched);
                    break;
                case 2:
                    sched.displayMeetings(currDate);
                    break;
            }
        }
    }

    public static String addMeeting(DepartmentMeetingScheduler sched) {
        Scanner scanner = new Scanner(System.in);

        String meetingTitle;
        String meetingDate;
        String startTime;
        String endTime;
        String meetingDescription;

        boolean isScheduled;

        System.out.print("Title - ");
        meetingTitle = scanner.nextLine().trim();

        System.out.print("Date - ");
        meetingDate = scanner.nextLine().trim();

        System.out.print("Start time - ");
        startTime = scanner.nextLine().trim();

        System.out.print("End time - ");
        endTime = scanner.nextLine().trim();

        System.out.print("Description - ");
        meetingDescription = scanner.nextLine().trim();

        isScheduled = sched.scheduleMeeting(meetingTitle, meetingDate, startTime, endTime, meetingDescription);

        if (isScheduled) {
            System.out.println("Scheduled successfully");
        } else {
            System.out.println("Collision! Already another meeting is scheduled");
        }

        return meetingDate;
    }
}
