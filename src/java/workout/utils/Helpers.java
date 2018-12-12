/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.utils;

import java.util.Date;

/**
 *
 * @author ceckles
 */
public class Helpers {
    
    
public static Long concatenateLong(Long... ids) {
   StringBuilder sb = new StringBuilder(ids.length);
   for (Long id : ids) {
     sb.append(ids);
   }
   Long output;
   try{
   output = new Long(sb.toString());
   } catch(Exception e) {
   output = (new Date()).getTime() ;   
   }
   
   return new Long(sb.toString());
}
}
