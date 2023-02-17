
import javax.swing.JButton;
import javax.swing.JLabel;

public class LblPark extends JButton{
        private int row , colm;

        public LblPark() {
        }

        public LblPark(int row, int colm) {
                this.row = row;
                this.colm = colm;
        }

        public int getRow() {
                return row;
        }

        public void setRow(int row) {
                this.row = row;
        }

        public int getColm() {
                return colm;
        }

        public void setColm(int colm) {
                this.colm = colm;
        }
        
        
}
