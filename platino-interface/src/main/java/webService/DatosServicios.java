package webService;

public class DatosServicios extends Datos {

	@Override
	public TipoA getTipo_actuacion() {
		// TODO Auto-generated method stub
		return new TipoA();
	}

	@Override
	public void setTipo_actuacion(TipoA tipo_actuacion) {
		// TODO Auto-generated method stub
		tipo_actuacion = new TipoA();
		
	}

	@Override
	public Familia getFamilia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFamilia(Familia familia) {
		// TODO Auto-generated method stub
		System.out.println("El servicio no tiene familia");
		
	}

	@Override
	public TipoProcedimiento getProcedimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProcedimiento(TipoProcedimiento procedimiento) {
		// TODO Auto-generated method stub
		System.out.println("El servicio no tiene tipo de procedimiento");
	}

}
