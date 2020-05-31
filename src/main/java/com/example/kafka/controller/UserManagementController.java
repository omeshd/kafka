package com.example.kafka.controller;

import com.example.kafka.application.UserManagementApplicationService;
import com.example.kafka.common.HTTPResponseHandler;
import com.example.kafka.common.RequestMappings;
import com.example.kafka.controller.dto.UpdateUserRQ;
import com.example.kafka.controller.dto.UserProfileRS;
import com.example.kafka.controller.dto.UserRQ;
import com.example.kafka.controller.dto.UserRS;
import com.example.kafka.domain.UserType;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.example.kafka.common.CommonConstants.*;

@RestController
public class UserManagementController extends HTTPResponseHandler {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(UserManagementController.class);

    @Autowired
    private UserManagementApplicationService userManagementApplicationService;

    /**
     * Creates the user.
     *
     * @param request  the request
     * @param response the response
     * @param userRQ   the user rq
     * @return the user rs
     */
    @ApiOperation(httpMethod = HTTP_METHOD_POST, value = "Create User", nickname = "Create a new user")
    @ApiResponses(value = {
            @ApiResponse(code = HTTP_STATUS_SUCCESS_STATUS_CODE, message = HTTP_STATUS_SUCCESS_STATUS_DESCRIPTION, response = UserRS.class),
            @ApiResponse(code = HTTP_STATUS_BAD_REQUEST_STATUS_CODE, message = HTTP_STATUS_BAD_REQUEST_STATUS_DESCRIPTION)})
    @RequestMapping(value = RequestMappings.CREATE_USER, method = RequestMethod.POST)
    public @ResponseBody
    UserRS createUser(HttpServletRequest request, HttpServletResponse response,
                      @RequestBody UserRQ userRQ) {

        UserRS userRS = userManagementApplicationService.createUser(userRQ, UserType.ENROLLED);
        setStatusHeadersToSuccess(response);

        return userRS;
    }

    /**
     * Update user.
     *
     * @param request      the request
     * @param response     the response
     * @param updateUserRQ the update user rq
     */
    @ApiOperation(httpMethod = HTTP_METHOD_PUT, value = "Update User", nickname = "Update the user")
    @ApiResponses(value = {
            @ApiResponse(code = HTTP_STATUS_SUCCESS_STATUS_CODE, message = HTTP_STATUS_SUCCESS_STATUS_DESCRIPTION),
            @ApiResponse(code = HTTP_STATUS_BAD_REQUEST_STATUS_CODE, message = HTTP_STATUS_BAD_REQUEST_STATUS_DESCRIPTION),
            @ApiResponse(code = HTTP_STATUS_FORBIDDEN_STATUS_CODE, message = HTTP_STATUS_FORBIDDEN_STATUS_DESCRIPTION)})
    @RequestMapping(value = RequestMappings.UPDATE_USER, method = RequestMethod.PUT)
    public void updateUser(HttpServletRequest request, HttpServletResponse response, @RequestBody UpdateUserRQ updateUserRQ, @PathVariable String userid) {

        userManagementApplicationService.updateUser(updateUserRQ, userid);
        setStatusHeadersToSuccess(response);
    }

    /**
     * Retrieve user by token.
     *
     * @param request  the request
     * @param response the response
     * @return the user profile rs
     */
    @ApiOperation(httpMethod = HTTP_METHOD_GET, value = "Retrieve the user profile", nickname = "Retrieve the user profile")
    @ApiResponses(value = {
            @ApiResponse(code = HTTP_STATUS_SUCCESS_STATUS_CODE, message = HTTP_STATUS_SUCCESS_STATUS_DESCRIPTION, response = UserProfileRS.class),
            @ApiResponse(code = HTTP_STATUS_BAD_REQUEST_STATUS_CODE, message = HTTP_STATUS_BAD_REQUEST_STATUS_DESCRIPTION),
            @ApiResponse(code = HTTP_STATUS_FORBIDDEN_STATUS_CODE, message = HTTP_STATUS_FORBIDDEN_STATUS_DESCRIPTION)})
    @RequestMapping(value = RequestMappings.RETRIEVE_USER_BY_ID, method = RequestMethod.GET)
    public @ResponseBody
    UserProfileRS retrieveUserByToken(HttpServletRequest request, HttpServletResponse response, @PathVariable String userid) {

        UserProfileRS userProfileRS = userManagementApplicationService.retrieveUserById(userid);
        setStatusHeadersToSuccess(response);

        return userProfileRS;
    }
}
