package att.adaptworks.robot.unidade;

import static org.junit.Assert.*;
import org.junit.Test;

import att.adaptworks.robot.Robot;

public class RobotTest {

	@Test
	public void movimentarParaNorte() {
		Robot robot = new Robot(10,10,0,0);
		
		assertEquals("0,2", robot.movimentar("2N"));
	}

}
