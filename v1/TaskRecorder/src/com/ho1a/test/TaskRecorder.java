package com.ho1a.test;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JWindow;

//import com.sun.awt.AWTUtilities;

public class TaskRecorder extends JFrame{
	private static final long serialVersionUID = 1L;

	public ProcessEvents processEvents;
	public JTextField text_field;
	private JButton button;
	public PSOLabel label;
	
	public TaskRecorder() {
		processEvents = new ProcessEvents(this);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setAlwaysOnTop(true);
		//AWTUtilities.setWindowOpacity(this,0.4f); 
		addWindowListener(processEvents);
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add((text_field = new JTextField(20)));
		getContentPane().add((label = new PSOLabel()));
		getContentPane().add((button = new JButton("Agregar")));

		text_field.addActionListener(processEvents);
		button.addActionListener(processEvents);
		pack();
		
		addMouseListener(processEvents);
		addMouseMotionListener(processEvents);
		
		text_field.addMouseListener(processEvents);
		text_field.addMouseMotionListener(processEvents);
		
		button.addMouseListener(processEvents);
		button.addMouseMotionListener(processEvents);
		//addMouseMotionListener(processEvents);
		//addMouseListener(processEvents);
		addWindowListener(processEvents);
		addWindowStateListener(processEvents);
	}
	
	public static void main(String[] args) {
		new TaskRecorder().setVisible(true);
	}
}
