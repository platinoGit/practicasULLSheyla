package webService;

public class DatosProcedimientos extends Datos {

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
		return new Familia();
	}

	@Override
	public void setFamilia(Familia familia) {
		// TODO Auto-generated method stub
		familia = new Familia();
		
	}

	@Override
	public TipoProcedimiento getProcedimiento() {
		// TODO Auto-generated method stub
		return new TipoProcedimiento();
	}

	@Override
	public void setProcedimiento(TipoProcedimiento procedimiento) {
		// TODO Auto-generated method stub
		procedimiento = new TipoProcedimiento();
		
	}

}
