package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import java.io.File;
import java.time.LocalDate;
import java.util.Map;
import java.time.OffsetDateTime;
import org.openapitools.model.OuterComposite;
import org.openapitools.model.User;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

public abstract class FakeApiService {
    public abstract Response fakeOuterBooleanSerialize(Boolean booleanPostBody,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fakeOuterCompositeSerialize(OuterComposite outerComposite,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fakeOuterNumberSerialize(BigDecimal body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fakeOuterStringSerialize(String body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testBodyWithQueryParams( @NotNull String query,User user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testClientModel(Client client,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testEndpointParameters(BigDecimal number,Double _double,String patternWithoutDelimiter,byte[] _byte,Integer integer,Integer int32,Long int64,Float _float,String string,InputStream binaryInputStream, FormDataContentDisposition binaryDetail,LocalDate date,OffsetDateTime dateTime,String password,String paramCallback,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testEnumParameters(List<String> enumHeaderStringArray,String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble,List<String> enumFormStringArray,String enumFormString,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testInlineAdditionalProperties(String requestBody,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testJsonFormData(String param,String param2,SecurityContext securityContext) throws NotFoundException;
}