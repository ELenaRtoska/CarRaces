package mk.ukim.finki.emt.carraces.sharedkernel.domain.base;

import org.springframework.lang.Nullable;

import java.io.Serializable;

public interface IdentifiableDomainObject<ID extends Serializable> extends DomainObject  {

    @Nullable
    ID id();
}
