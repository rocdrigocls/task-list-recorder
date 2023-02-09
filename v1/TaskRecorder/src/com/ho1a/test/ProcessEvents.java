package com.ho1a.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.text.SimpleDateFormat;
import java.util.Date;

//import com.sun.awt.AWTUtilities;

public class ProcessEvents  implements WindowListener, ActionListener, MouseMotionListener, MouseListener, WindowFocusListener, WindowStateListener{

	private TaskRecorder taskRecorder;
	
	public ProcessEvents(TaskRecorder taskRecorder) {
		this.taskRecorder = taskRecorder;
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.print("," + taskRecorder.label.getText() + "\n" + new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss").format(new Date()) + ",DONE");
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent e) {
		String text = taskRecorder.text_field.getText().trim();
		System.out.print("," + taskRecorder.label.getText() + "\n" + new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss").format(new Date()) + "," + text);
		taskRecorder.label.reset();
	}

	public void windowOpened(WindowEvent e) { }
	public void windowClosed(WindowEvent e) { }
	public void windowIconified(WindowEvent e) { }
	public void windowDeiconified(WindowEvent e) { }
	public void windowActivated(WindowEvent e) { }
	public void windowDeactivated(WindowEvent e) { }

	public void mouseDragged(MouseEvent e) {}

	public void mouseMoved(MouseEvent e) {
		//System.out.println("mouseMoved:" + e);
	}

	public void mouseClicked(MouseEvent e) { }

	public void mouseEntered(MouseEvent e) {
		//System.out.println("mouseEntered:" + e);
		//AWTUtilities.setWindowOpacity(taskRecorder,.9f); 
	}

	public void mouseExited(MouseEvent e) {
		//System.out.println("mouseExited:" + e);
		//AWTUtilities.setWindowOpacity(taskRecorder,.4f); 
	}

	public void mousePressed(MouseEvent e) { 
	}

	public void mouseReleased(MouseEvent e) { 
	}

	public void windowGainedFocus(WindowEvent arg0) {
	}

	public void windowLostFocus(WindowEvent arg0) {
	}

	public void windowStateChanged(WindowEvent e) {
	}
	
}
