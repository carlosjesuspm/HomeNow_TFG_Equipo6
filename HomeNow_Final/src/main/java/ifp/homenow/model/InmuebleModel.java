package ifp.homenow.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ifp.homenow.bean.DireccionBean;
import ifp.homenow.bean.InmuebleBean;
import ifp.homenow.bean.UsuarioBean;
import ifp.homenow.utility.JDBCDataSource;

public class InmuebleModel {

	
	
	public static long nextPk() {
		long pk = 0;
		Connection conn;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select Max(idinmuebles) from inmueble");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				pk = rs.getLong(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pk + 1;

	}
	
	
	
	
	public static long nextPkDireccion() {
		long pk = 0;
		Connection conn;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select Max(iddireccion) from direccion");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				pk = rs.getLong(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pk + 1;

	}
	
	
	
	
	public static long addDireccionModel(DireccionBean direccion) {
		int i = 0;
		try {
			
			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into direccion values(?,?,?,?,?,?,?,?)");
			stmt.setLong(1, nextPkDireccion());
			stmt.setString(2, direccion.getProvincia());
			stmt.setString(3, direccion.getMunicipio());
			stmt.setString(4, direccion.getLocalidad());
			stmt.setInt(5, direccion.getCodigo_postal());
			stmt.setString(6, direccion.getCalle());
			stmt.setInt(7, direccion.getNumero());
			stmt.setString(8, direccion.getComplemento());

			i = stmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}
	
	
	
	

	public static long addInmuebleModel(InmuebleBean inmueble) {
		int i = 0;
		try {
			
			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into inmueble values(?,?,?,?,?,?,?,?,?,?)");
			stmt.setLong(1, nextPk());
			stmt.setString(2, inmueble.getTipo());
			stmt.setInt(3, inmueble.getPrecio_inmueble());
			stmt.setInt(4, inmueble.getSuperficie());
			stmt.setLong(5, inmueble.getDireccion_inmueble().getIddireccion());
			stmt.setInt(6, inmueble.getHabitacion());
			stmt.setInt(7, inmueble.getBano());
			stmt.setString(8, inmueble.getImagen_inmueble());
			stmt.setString(9, inmueble.getDescripcion_inmueble());
			stmt.setLong(10, inmueble.getUsuarios_inmueble().getIdusuarios());

			i = stmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}
}
