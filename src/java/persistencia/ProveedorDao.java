
package persistencia;

import negocio.Proveedor;

public interface ProveedorDao {
    public String grabar(Proveedor pro);
    public Object[] buscar(String cod);
}
