package Final;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScheduleTester
{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 400;
	private static final int FIELD_WIDTH = 10;
	private static final int AREA_ROWS = 10;
	private static final int AREA_COLUMNS = 30;
	
	public static void main(String[] args)
	{
		Schedule mySchedule = new Schedule();
		Building buildingA = new Building();
		
		for(int i = 0; i<50; i++)
		{
			buildingA.setClasses(new Classroom());
		}
		
		mySchedule.setClassrooms(buildingA.getClasses());
		
		JFrame frame = new JFrame();
		JButton submitButton = new JButton("Submit");
		JButton deleteButton = new JButton("Delete");
		JButton clearButton = new JButton("Clear");
		JLabel label = new JLabel("Hello!");
		JPanel panel = new JPanel();
		JPanel dataEntryPanel = new JPanel();
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(1,2));
		dataEntryPanel.setLayout(new GridLayout(4,3));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1,3));
		
		JRadioButton classesButton = new JRadioButton("Class");
		JRadioButton guestSpeakerButton = new JRadioButton("Guest Speaker");
		JRadioButton seminarButton = new JRadioButton("Seminar");
		JRadioButton clubButton = new JRadioButton("Club");
		classesButton.setSelected(true);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(classesButton);
		buttonGroup.add(guestSpeakerButton);
		buttonGroup.add(seminarButton);
		buttonGroup.add(clubButton);

		JTextField description = new JTextField(FIELD_WIDTH);
		JTextField startTime = new JTextField(FIELD_WIDTH);
		JTextField duration = new JTextField(FIELD_WIDTH);
		JTextField roomNumber = new JTextField(FIELD_WIDTH);
		JLabel descriptionLabel = new JLabel("Description");
		JLabel startTimeLabel = new JLabel("Start Time");
		JLabel durationLabel = new JLabel("Duration");
		JLabel roomNumberLabel = new JLabel("Room Number");
		
		dataEntryPanel.add(description);
		dataEntryPanel.add(descriptionLabel);
		dataEntryPanel.add(classesButton);
		dataEntryPanel.add(startTime);
		dataEntryPanel.add(startTimeLabel);
		dataEntryPanel.add(guestSpeakerButton);
		dataEntryPanel.add(duration);
		dataEntryPanel.add(durationLabel);
		dataEntryPanel.add(seminarButton);
		dataEntryPanel.add(roomNumber);
		dataEntryPanel.add(roomNumberLabel);
		dataEntryPanel.add(clubButton);
		
		buttonPanel.add(submitButton);
		buttonPanel.add(deleteButton);
		buttonPanel.add(clearButton);
		
		JTextArea scheduleField = new JTextArea(AREA_ROWS, AREA_COLUMNS);
		scheduleField.setLineWrap(true);
		
		panel.setLayout(new BorderLayout());
		panel.add(dataEntryPanel, BorderLayout.NORTH);
		panel.add(scheduleField, BorderLayout.CENTER);
		panel.add(buttonPanel, BorderLayout.SOUTH);
		frame.add(panel);
		
		class SubmitButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				String desc = description.getText();
				int min = Integer.parseInt(startTime.getText().substring(0,1));
				int hour = Integer.parseInt(startTime.getText().substring(3,4));
				int dura = Integer.parseInt(duration.getText());
				int roomNum = Integer.parseInt(roomNumber.getText());
				if(classesButton.isSelected())
				{
					mySchedule.setSchedule(new Classes(dura, new Time(), roomNum, desc));
				}
				else if(guestSpeakerButton.isSelected())
				{
					mySchedule.setSchedule(new GuestSpeakers(dura, new Time(), roomNum, desc));
				}
				else if(seminarButton.isSelected())
				{
					mySchedule.setSchedule(new Seminars(dura, new Time(), roomNum, desc));
				}
				else if(clubButton.isSelected())
				{
					mySchedule.setSchedule(new Clubs(dura, new Time(), roomNum, desc));
				}
				scheduleField.setText(mySchedule.getSchedule());
			}
		}
		
		class DeleteButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				scheduleField.setText("You will delete the last entry");
			}
		}
		
		class ClearButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				scheduleField.setText("Clear all data");
			}
		}
	
		ActionListener submitListener = new SubmitButtonListener();
		submitButton.addActionListener(submitListener);
		ActionListener deleteListener = new DeleteButtonListener();
		deleteButton.addActionListener(deleteListener);
		ActionListener clearListener = new ClearButtonListener();
		clearButton.addActionListener(clearListener);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

// I haven't been able to work on this program other than what I have done here due to a family emergency. I will be working on this on sunday and monday to complete the task before the deadline. This isn't an excuse this is just the reason for the extreme drop in performace this last week. I just thought I should communicate this to you.

