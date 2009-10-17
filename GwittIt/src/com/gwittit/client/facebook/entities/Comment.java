package com.gwittit.client.facebook.entities;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwittit.client.facebook.Json;

/*
 * Stream Comment
 * @see http://wiki.developers.facebook.com/index.php/Stream.getComments
 * @author olamar72 
 */
public class Comment extends JavaScriptObject {

    protected Comment() {
    }

    /**
     * The external ID of the fb:comments being queried. You can specify more
     * than one XID.
     */
    public final native String getXid() /*-{
        return this.xid;
    }-*/;

    /**
     * The ID of the post in the stream.
     */
    public final native String getPostId() /*-{
        return this.post_id;
    }-*/;

    /**
     * The user submitting a comment.
     */
    private final native String getFromIdString() /*-{
        return this.fromid + '';
    }-*/;

    public final Long getFromId() {
        return new Long ( getFromIdString () );
    }

    /**
     * A unix timestamp associated with the creation time of a comment. private
     * Date time;
     */
    // public final native Long getTime() /*-{ alert ( this.time); return
    // this.time; }-*/;
    /**
     * The text of a comment.
     */
    public final native String getText() /*-{
        return this.text;
    }-*/;

    /**
     * A unique ID for a given XID for each comment.
     */
    public final native String getId() /*-{
        return this.id +"";
    }-*/;

    /**
     * The user name that a user entered when they posted a comment. In these
     * cases, the fromid returned will be 0. Note that user names for valid
     * users are not returned here.
     */
    public final native String getUsername() /*-{
        return this.username;
    }-*/;

    /**
     * The target XID for Feed stories generated by the user; applications can
     * retrieve comments made to that story by calling this XID. private String
     * replyXid;
     */
    public final native String replyXid() /*-{
        return this.reply_xid +"";
    }-*/;

    /**
     * Create a comment object with xid and comment. This object can be passed
     * directly to a native javascript function.
     * 
     * @return Comment object
     */
    public final static Comment createComment(String xid, String comment) {
        Json j = Json.newInstance ();
        j.put ( "xid", xid ).put ( "comment", comment );
        return fromJson ( j.toString () );
    }

    public static native Comment fromJson(String jsonString) /*-{
        return eval('(' + jsonString + ')');
    }-*/;

}
