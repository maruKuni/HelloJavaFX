package application;

import application.logic.Counter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class SampleController {
	@FXML
	private Label clickCount;

	@FXML
	protected void handleButtonClicked(ActionEvent e) {
		Counter counter = Counter.getInstance();
		counter.addCount();
		int count = counter.getCount();
		clickCount.setText(Integer.toString(count));
	}
}
