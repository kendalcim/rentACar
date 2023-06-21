package kodlama.io.rentACar.business.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class BrandBusinessRules {
	
	@Autowired
	private BrandRepository brandRepository;

	public void checkIfNameExists(String name) {
		if(brandRepository.existsByName(name)) {
			throw new BusinessException("Brand already exists");
		}
	
		

}
	
}