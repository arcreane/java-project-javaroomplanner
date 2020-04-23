package Material;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public abstract class Material {
	List <Material> createMaterialList(Map<MaterialList,Integer> RoomMaterial){
		List <Material> MaterialToReturn = new ArrayList<>();
		for (var material : RoomMaterial.entrySet()) {
			for(int i = 0; i<material.getValue();i++) {
				switch (material.getKey()) {
				case COMPUTER: 
					
					break;
				case SOUND: 
					break;
				case SCREEN: 
					break;
				case RETRO_PROJECTEUR: 
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + material.getKey());
				}
			}
		}
		
		return MaterialToReturn;
	}
}
