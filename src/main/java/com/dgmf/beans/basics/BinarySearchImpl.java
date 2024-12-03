package com.dgmf.beans.basics;

/*import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
// @Scope("prototype")
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
    // private Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        return 3;
    }

    // Called as soon as Bean is been Created
    /*@PostConstruct
    public void postConstruct() {
        logger.info("Into postConstruct() Method");
    }*/

    // Called before Bean has been Removed from Container
    /*@PreDestroy
    public void preDestroy() {
        logger.info("Into preDestroy() Method");
    }*/
}
