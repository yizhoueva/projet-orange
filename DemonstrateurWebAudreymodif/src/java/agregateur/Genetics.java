/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregateur;

/**
 *
 * @author Romeo
 */
public class Genetics  extends AgregateurObjet{
    
    private String trait;
    private String description;
    private String[] possibleTraits;

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getPossibleTraits() {
        return possibleTraits;
    }

    public void setPossibleTraits(String[] possibleTraits) {
        this.possibleTraits = possibleTraits;
    }
    
}
