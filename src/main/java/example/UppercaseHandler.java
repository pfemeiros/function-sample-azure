/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package example;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

import java.util.Optional;

import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

/**
 * @author Soby Chacko
 */
public class UppercaseHandler extends AzureSpringBootRequestHandler<String, String> {

	@FunctionName("uppercase")
	public String execute(@HttpTrigger(name = "req", methods = {HttpMethod.GET,
			HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
		ExecutionContext context) {
		context.getLogger().warning(context.getFunctionName() + " upercasing");
		context.getLogger().warning(context.getFunctionName() + " upercasing");
		context.getLogger().warning(context.getFunctionName() + " upercasing");
		context.getLogger().warning(context.getFunctionName() + " upercasing");
		context.getLogger().warning(context.getFunctionName() + " upercasing");
		context.getLogger().warning(context.getFunctionName() + " upercasing");
		context.getLogger().warning(context.getFunctionName() + " upercasing");
		context.getLogger().warning(context.getInvocationId());
		return handleRequest(request.getBody().get(), context);
	}

	@FunctionName("lowercase")
	public String execute2(@HttpTrigger(name = "req2", methods = {HttpMethod.GET,
		HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
						  ExecutionContext context) {
		context.getLogger().warning(context.getFunctionName() + " lowercasing");
		context.getLogger().warning(context.getFunctionName() + " lowercasing");
		context.getLogger().warning(context.getFunctionName() + " lowercasing");
		context.getLogger().warning(context.getFunctionName() + " lowercasing");
		context.getLogger().warning(context.getFunctionName() + " lowercasing");
		context.getLogger().warning(context.getFunctionName() + " lowercasing");
		context.getLogger().warning(context.getFunctionName() + " lowercasing");
		context.getLogger().warning(context.getInvocationId());
		return handleRequest(request.getBody().get(), context);
	}

}
