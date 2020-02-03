package com.dh.demo.servicios;

import java.util.List;

import com.dh.demo.entidades.MiEntidad;

public interface MiInterfazServicio {

	public List<MiEntidad>listaEntidad ();
	public MiEntidad encontrarPorId (Long id, List<MiEntidad>listaEntidad);
}
