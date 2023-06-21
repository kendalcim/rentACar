package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;


public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
	boolean existsByName(String name);
	
}

//BTK akademi ileri java kursu, spring kursu kismini izle. IOC ozellikle 