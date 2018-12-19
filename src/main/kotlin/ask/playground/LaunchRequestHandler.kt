package ask.playground

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.LaunchRequest
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.*

class LaunchRequestHandler : RequestHandler {

    override fun canHandle(input: HandlerInput?): Boolean {
        if (input == null) {
            return false
        }
        return input.matches(Predicates.requestType(LaunchRequest::class.java))
    }

    override fun handle(input: HandlerInput?): Optional<Response> {
        val speechText = "Welcome to the Alexa Skills Kit, you can say hello"
        if (input == null) {
            return Optional.empty()
        }
        return input.responseBuilder
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .withReprompt(speechText)
                .build()
    }

}
