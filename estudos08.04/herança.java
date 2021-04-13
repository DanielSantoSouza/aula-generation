
public class herança {

	public static void main(String[] args) {
		cachorro cr = new cachorro();
		cavalo cv = new cavalo();
		preguiça pç = new preguiça();
		// TODO Auto-generated method stub
		{
			cachorro brunno = new cachorro("brunno,6,hallshalls,30km/h: ");
			cavalo pedro = new cavalo("pedro,13,brurrrr,50km/h: ");
			preguiça daniel = new preguiça("daniel,24,coorrrr,dorme nelas: ");
			{
				System.out.println(brunno.getNome());
				System.out.println(pedro.getNome());
				System.out.println(daniel.getNome());

		}

	}

}
