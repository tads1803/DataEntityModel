/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portuary.dem.exceptions;

import org.json.JSONObject;

/**
 *
 * @author Portuary
 */
public class JSONException extends Exception{ 
    public JSONException(String message) {
        super((new JSONObject()).put("code", 00).put("message", message).toString());
    } 
    public JSONException(int codigo, String message) {
        super((new JSONObject()).put("code", codigo).put("message", message).toString());
    } 
}
