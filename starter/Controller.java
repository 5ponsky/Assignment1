import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Controller implements ActionListener, MouseListener
{
	View view;
	Model model;

	Controller(Model m)
	{
		model = m;
	}

	void setView(View v) {
		view = v;
		view.addMouseListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		view.removeButton();
	}

	public void mousePressed(MouseEvent e) {
		model.setDestination(e.getX(), e.getY());
	}

	// Not used yet?
	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mouseClicked(MouseEvent e) {

	}


}
