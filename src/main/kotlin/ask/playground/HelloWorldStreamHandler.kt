package ask.playground

import com.amazon.ask.Skills
import com.amazon.ask.SkillStreamHandler

class HelloWorldStreamHandler : SkillStreamHandler(Skills.standard().addRequestHandlers(
        CancelAndStopIntentHandler(),
        HelloWorldIntentHandler(),
        HelloWorldIntentHandler(),
        LaunchRequestHandler(),
        SessionEndedRequestHandler()).build())
