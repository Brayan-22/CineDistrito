/**
 * Paquete que contiene las distintas clases para la implementacion del patron de diseño 
 * AbstractFactory para el manejo del CRUD de la Base de datos
 * <p>Interfaces principales del paquete:</p>
 * <ul>
 *      <li>{@link com.alejandro.Logica.AbstractFactory.AbstractFactoryCRUD }: Interface que representa el concepto de fabrica abstracta, cotiene los metodos abstractos que implementaran luego las fabricas concretas </li>
 * </ul>
 * <p>Clases principales del paquete:</p>
 * <ul>
 *      <li>{@link com.alejandro.Logica.AbstractFactory.FabricaAsiento}: Implementacion para la fabrica concreta del CRUD de asientos </li>
 *      <li>{@link com.alejandro.Logica.AbstractFactory.FabricaCliente}: Implementacion para la fabrica concreta del CRUD de clientes</li>
 *      <li>{@link com.alejandro.Logica.AbstractFactory.FabricaEmpleado}: Implementacion para la fabrica concreta del CRUD de empleados</li>
 *      <li>{@link com.alejandro.Logica.AbstractFactory.FabricaMultiplex}: Implementacion para la fabrica concreta del CRUD de Multiplex</li>
 *      <li>{@link com.alejandro.Logica.AbstractFactory.FabricaPeliculas}: Implementacion para la fabrica concreta del CRUD de peliculas</li>
 *      <li>{@link com.alejandro.Logica.AbstractFactory.FabricaSala}: Implementacion para la fabrica concreta del CRUD de salas</li>
 * </ul>
 */
package com.alejandro.Logica.AbstractFactory;
