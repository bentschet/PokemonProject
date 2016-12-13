package pokemon.view;

import java.awt.Color;
import javax.swing.*;
import pokemon.controller.PokemonController;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.event.MouseMotionListener;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.DARK_GRAY);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
	}
	
	private void setupListeners()
	{
		this.addMouseListener(new MouseListener()
				{
					public void mouseEntered(MouseEvent entered)
					{
					//	JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse entered the program");
					}
					
					public void mouseReleased(MouseEvent released)
					{
					//	System.out.println("released");
					}
					
					public void mouseExited(MouseEvent exited)
					{
					//	JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse exited the program");
					}
					
					public void mouseClicked(MouseEvent clicked)
					{
					//	JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was clicked");
					}
					
					public void mousePressed(MouseEvent pressed)
					{
                   	//	System.out.println("pressed");
					}
				});
		this.addMouseMotionListener(new MouseMotionListener()
				{
					public void mouseMoved(MouseEvent moved)
					{
						if(((Math.abs(moved.getX() - updateButton.getX()) < 5 ) || (Math.abs(moved.getY() - updateButton.getY() <5))))
						{
							updateButton.setLocation(moved.getX() + 10, moved.getY() - 10);
							
						}
						//	JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was at X:" + moved.getX() +", Y:" + moved.getY());
					}
					
					public void mouseDragged(MouseEvent dragged)
					{
					//	setRandomColor();
					}
				});
	}
}