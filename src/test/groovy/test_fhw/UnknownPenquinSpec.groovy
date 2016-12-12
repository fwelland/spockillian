
package test_fhw
import spock.lang.*
import fhw.model.*
import javax.inject.Inject
import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.junit.runner.RunWith
import org.jboss.arquillian.spock.*


@RunWith(ArquillianSputnik)
class UnknownPenquinSpec
    extends Specification
{
	
    @Deployment
    def static JavaArchive "create deployment"() {
     return ShrinkWrap.create(JavaArchive.class, "pizzel.jar")
            .addPackage(true, Package.getPackage("fhw"))                
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }    
    
    
    def setup()
    {
        
    }
    
    
    def cleanup()
    {
        
    }
    
    def "simple spock and arquillian test"()
    {
        
        when: 
            println "foo"
            
        then: 
            println "bar"
    }
}

