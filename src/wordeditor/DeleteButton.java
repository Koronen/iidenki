package wordeditor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import vocab.Word;


/**
 * The delete button.
 */
public class DeleteButton extends JButton implements ActionListener{

	private static final long serialVersionUID = 5269401400605635128L;
	private GraphicalList glist;

	/**
	 * Instantiates a new delete button.
	 *
	 * @param glist the GraphicalList to delete from
	 */
	public DeleteButton(GraphicalList glist){
		super("Delete");
		addActionListener(this);
		this.glist = glist;
	}

	/**
	 * Deletes the selected word from the GraphicalList view
	 */
	public void actionPerformed(ActionEvent arg0) {
		int index = glist.getSelectedIndex();
		if (index != -1){
			Word word = (Word) glist.wlist.get(index);
			int confirm = JOptionPane.showConfirmDialog(null, "Delete the word '" + word + "'?", "Confirm deletion", JOptionPane.YES_NO_OPTION);
				if (confirm == 0){
					glist.deleteWord(index);
					glist.clearFields();
				}
		}
	}
	
	
}
