package cn.dolphinsoft.nostos.common.converter;

/**
 * Class Name: ObjectConverter Description: TODO
 * 
 * @author zhishenghong
 * 
 * @param <F>
 * @param <T>
 */
public interface ObjectConverter<F, T> {

    
    /**
    * Description: convert from domain to dto
    *
    * @param domain
    * @param target
    */
    void convertFromDomain(T domain, F target);

    
    /**
    * Description: convert from dto to domain
    *
    * @param source
    * @param domain
    */
    void convertToDomain(F source, T domain);

}
