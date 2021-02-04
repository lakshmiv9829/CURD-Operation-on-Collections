package com.xworkz.Perfume.PerfumeTester;

import java.util.ArrayList;

import java.util.List;

import com.xworkz.Perfume.dao.PerfumeDAO;
import com.xworkz.Perfume.dao.PerfumesDAOImpl;
import com.xworkz.Perfume.dto.PerfumeDTO;

public class PerfumeTester {
	static List<PerfumeDTO> list = new ArrayList<PerfumeDTO>();

	public static void main(String[] args) {
		PerfumeDTO perfumeDTO = new PerfumeDTO();
		perfumeDTO.setName("Fogg");
		perfumeDTO.setPrice(230);
		perfumeDTO.setQuntity(150);
		perfumeDTO.setFlavour("Blue Ocean");

		PerfumeDTO perfumeDTO1 = new PerfumeDTO();
		perfumeDTO1.setName("CK");
		perfumeDTO1.setPrice(1900);
		perfumeDTO1.setFlavour("lilyofthevalley");
		perfumeDTO1.setQuntity(150);

		PerfumeDAO perfumeDAO = new PerfumesDAOImpl(list);
		perfumeDAO.save(perfumeDTO);
		
		PerfumeDTO DTOfound=perfumeDAO.findByName("Fogg");
		System.out.println(DTOfound);
		
		boolean updatePriceByName=perfumeDAO.updatePriceByName("Fogg", 450);
		System.out.println(updatePriceByName);
		
		boolean deleteByName=perfumeDAO.deleteByName("CK");
		System.out.println("deleted"+ " "+deleteByName);
		
	}

}
