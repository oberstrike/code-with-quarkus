package de.ma

import de.ma.proto.HelloRequest
import org.mapstruct.Mapper
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello-resteasy-reactive")
class ReactiveGreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello RESTEasy Reactive"
}


data class Hello(val name: String = "")

@Mapper
interface HelloMapper{
    fun convertHelloToHelloRequest(hello: Hello): HelloRequest

}