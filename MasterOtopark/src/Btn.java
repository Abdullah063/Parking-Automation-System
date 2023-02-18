
import javax.swing.JButton;

public class Btn extends JButton{
        private int row , colm;
        private boolean park = true;

        public Btn() {
        }

        public Btn(int row, int colm) {
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
        public boolean isPark() {
                return park;
        }

        public void setPark(boolean park) {
                this.park = park;
        }
        
        
}
