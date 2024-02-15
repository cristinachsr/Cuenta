package Cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria.
 * Proporciona metodos para realizar operaciones.
 */

public class CCuenta {

/**
 * Nombre asociado a la cuenta numero de cuenta, saldo actual de la cuenta y el tipo de interes
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * obtiene el tipo de interes de la cuenta
     * @return el tipo de interes actual
     */
    double getTipoInteres() {
		return tipoInteres;
	}
    
    /**
     * establece el tipo de interes de la cuenta
     * @param tipoInterés el nuevo tipo de interes
     */

	void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	/**
	 * obtiene el saldo actual de la cuenta
	 * @return el saldo actual de la cuenta
	 */

	double getSaldo() {
		return saldo;
	}

	/**
	 * establece el saldo de la cuenta
	 * @param saldo el nuevo saldo de la cuenta
	 */
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * obtiene el numero de cuenta
	 * @return el numero de cuenta asociado
	 */
	String getCuenta() {
		return cuenta;
	}

	/**
	 * establece el numero de cuenta
	 * @param cuenta el nuevo numero de cuenta
	 */
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/** 
	 * obtiene el nombre asociado a la cuenta
	 * @return el nombre asociado a la cuenta
	 */
	String getNombre() {
		return nombre;
	}

	 /**
     * Establece el nombre asociado a la cuenta.
     *
     * @param nombre El nuevo nombre asociado a la cuenta.
     */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * constructor por defecto de la clase cuenta
 */
	public CCuenta()
    {
    }

	/**
	Constructor con parámetros de la clase CCuenta.
     *
     * @param nom   El nombre asociado a la cuenta.
     * @param cue   El número de cuenta.
     * @param sal   El saldo inicial de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Obtiene el estado actual de la cuenta, es decir, el saldo actual.
     * @return El saldo actual de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }

 /** 
  * realizar un deposito en la cuenta
  * @param cantidad la cantidad a depositar
  * @throws Exception si la cantidad a depositar es negativa
  */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
   
    /**
     * realizar un retiro de la cuenta
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad a retirar es negativa o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
