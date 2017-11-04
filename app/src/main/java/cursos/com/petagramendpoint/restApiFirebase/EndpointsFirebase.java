package cursos.com.petagramendpoint.restApiFirebase;

import cursos.com.petagramendpoint.restApiFirebase.model.UsuarioResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Usuario on 31/10/2017.
 */
public interface EndpointsFirebase {

    @FormUrlEncoded
    @POST(ConstantesRestApiFirebase.KEY_POST_ID_TOKEN)
    Call<UsuarioResponse> registrarTokenID(@Field("id_dispositivo") String token, @Field("id_usuario_instagram") String insta);

}
